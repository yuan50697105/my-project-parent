package org.myproject.boot.application.admin.service.api;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.*;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.application.admin.db.service.TbSysUserRoleService;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
import org.myproject.boot.application.admin.service.pojo.SysUser;
import org.myproject.boot.application.admin.service.pojo.SysUserQuery;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 19:36
 */
@Service
@AllArgsConstructor
@Transactional
@Primary
public class SysUserApiImpl implements BSysUserApi {
    private final TbConverter converter;
    private final TbSysUserService sysUserService;
    private final TbSysUserRoleService sysUserRoleService;
    private final TbSysRoleService sysRoleService;

    @Override
    public IPage<SysUser> selectByQuery(SysUserQuery query, int page, int size) {
        TbSysUserQuery sysUserQuery = converter.sysUser(query);
        return new PageResult<>(converter.sysUser(sysUserService.selectByQuery(sysUserQuery, page, size)));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        TbSysUserQuery sysUserQuery = converter.sysUser(query);
        return converter.sysUser(sysUserService.selectByQuery(sysUserQuery));
    }

    @Override
    public SysUser get(Long id) {
        return converter.sysUser(sysUserService.selectByPrimaryKey(id));
    }

    @Override
    public void save(SysUserVo sysUserVo) {
        TbSysUser sysUser = converter.sysUser(sysUserVo);
        sysUserService.insert(sysUser);
        TbSysRoleExample example = new TbSysRoleExample();
        example.or().andIdIn(sysUserVo.getRoleIds());
        List<TbSysRole> sysRoles = sysRoleService.selectByExample(example);
        List<Long> roleIds = sysRoles.stream().map(BaseEntity::getId).distinct().collect(Collectors.toList());
        List<TbSysUserRole> sysUserRoles = converter.sysUserRole(sysUser.getId(), roleIds);
        sysUserRoles.forEach(sysUserRoleService::insert);
    }

    @Override
    public void update(SysUserVo sysUser) {
        sysUserService.updateByPrimaryKeySelective(converter.sysUser(sysUser));
    }

    @Override
    public void delete(List<Long> ids) {
        ids.forEach(sysUserService::deleteByPrimaryKey);
    }

    @Override
    public void modify(SysUserVo sysUserVo) {
        sysUserService.updateByPrimaryKey(converter.sysUser(sysUserVo));
    }

    @Override
    public void delete(Long id) {
        sysUserService.deleteByPrimaryKey(id);
    }
}