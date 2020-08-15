package org.myproject.boot.application.admin.web.api.service.impl;

import cn.hutool.core.util.ObjectUtil;
import org.myproject.boot.application.admin.service.pojo.SysUserAoDTO;
import org.myproject.boot.application.admin.service.pojo.SysUserQueryDTO;
import org.myproject.boot.application.admin.service.pojo.SysUserVoDTO;
import org.myproject.boot.application.admin.service.service.SysUserService;
import org.myproject.boot.application.admin.web.api.pojo.SysRolesAo;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersAo;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersQuery;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersVo;
import org.myproject.boot.application.admin.web.api.service.ApiConverter;
import org.myproject.boot.application.admin.web.api.service.SysUsersService;
import org.myproject.boot.application.commons.pojo.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-07 22:00
 */
@Service
public class SysUsersServiceImpl implements SysUsersService {
    @Autowired
    private ApiConverter converter;
    @Autowired
    private SysUserService sysUserService;

    @Override
    public SysUsersAo get(Long id) {
        SysUserAoDTO sysUserAoDTO = sysUserService.get(id);
        return converter.sysUsers(sysUserAoDTO);
    }

    @Override
    public List<SysRolesAo> getRoles(Long id) {
        SysUsersAo sysUsersAo = get(id);
        return Optional.ofNullable(sysUsersAo.getRoles()).orElse(new ArrayList<>());
    }

    @Override
    public List<SysRolesAo> getRoles(Long userId, Long roleId) {
        List<SysRolesAo> roles = getRoles(userId);
        if (ObjectUtil.isNotEmpty(roleId)) {
            return Optional.ofNullable(roles).stream().flatMap(Collection::stream).filter(sysRolesPredicate(roleId)).collect(Collectors.toList());
        } else {
            return Optional.ofNullable(roles).orElse(new ArrayList<>());
        }
    }

    @Override
    public IPage<SysUsersAo> list(SysUsersQuery query, int page, int limit) {
        SysUserQueryDTO queryDTO = converter.sysUserQuery(query);
        IPage<SysUserAoDTO> iPage = sysUserService.list(queryDTO, page, limit);
        return converter.sysUsers(iPage);
    }

    @Override
    public List<SysUsersAo> list(SysUsersQuery query) {
        return converter.sysUsers(sysUserService.list(converter.sysUserQuery(query)));
    }

    @Override
    public void add(SysUsersVo sysUsersAo) {
        SysUserVoDTO sysUsers = converter.sysUsers(sysUsersAo);
        sysUsers.setEvent(SysUserVoDTO.Event.ADD);
        sysUserService.save(sysUsers);
    }

    @Override
    public void update(SysUsersVo sysUsersVo) {
        SysUserVoDTO sysUsers = converter.sysUsers(sysUsersVo);
        sysUsers.setEvent(SysUserVoDTO.Event.UPDATE);
        sysUserService.save(sysUsers);
    }

    @Override
    public void delete(Long id) {
        sysUserService.delete(id);
    }

    private Predicate<SysRolesAo> sysRolesPredicate(Long roleId) {
        return sysRolesAo -> sysRolesAo.getId().equals(roleId);
    }
}