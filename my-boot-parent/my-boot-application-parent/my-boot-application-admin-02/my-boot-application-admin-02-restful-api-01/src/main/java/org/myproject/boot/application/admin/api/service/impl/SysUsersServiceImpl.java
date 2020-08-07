package org.myproject.boot.application.admin.api.service.impl;

import cn.hutool.core.util.ObjectUtil;
import org.myproject.boot.application.admin.api.pojo.*;
import org.myproject.boot.application.admin.api.service.ApiConverter;
import org.myproject.boot.application.admin.api.service.SysUsersService;
import org.myproject.boot.application.admin.service.pojo.IPage;
import org.myproject.boot.application.admin.service.pojo.SysUserAoDTO;
import org.myproject.boot.application.admin.service.pojo.SysUserQueryDTO;
import org.myproject.boot.application.admin.service.pojo.SysUserVoDTO;
import org.myproject.boot.application.admin.service.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
        return converter.sysUser(sysUserAoDTO);
    }

    @Override
    public List<SysRolesAo> getRoles(Long id) {
        SysUsersAo sysUsersAo = get(id);
        return sysUsersAo.getRoles();
    }

    @Override
    public List<SysRolesAo> getRoles(Long userId, Long roleId) {
        List<SysRolesAo> roles = getRoles(userId);
        if (ObjectUtil.isNotEmpty(roleId)) {
            return roles.stream().filter(sysRolesPredicate(roleId)).collect(Collectors.toList());
        } else {
            return roles;
        }
    }

    @Override
    public IPages<SysUsersAo> list(SysUsersQuery query, int page, int limit) {
        SysUserQueryDTO queryDTO = converter.sysUserQuery(query);
        IPage<SysUserAoDTO> iPage = sysUserService.list(queryDTO, page, limit);
        return converter.sysUsers(iPage);
    }

    @Override
    public List<SysUsersAo> list(SysUsersQuery query) {
        return converter.sysUsers(sysUserService.list(converter.sysUserQuery(query)));
    }

    @Override
    public void add(SysUsersVo sysUsersVo) {
        SysUserVoDTO sysUsers = converter.sysUsers(sysUsersVo);
        sysUsers.event(SysUserVoDTO.Event.ADD);
        sysUserService.save(sysUsers);
    }

    private Predicate<SysRolesAo> sysRolesPredicate(Long roleId) {
        return sysRolesAo -> sysRolesAo.getId().equals(roleId);
    }
}