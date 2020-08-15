package org.myproject.boot.application.admin.api.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.api.api.BSysUserApi;
import org.myproject.boot.application.admin.api.converter.TbConverter;
import org.myproject.boot.application.admin.api.pojo.*;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.application.admin.db.service.TbSysUserRoleService;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
import org.myproject.boot.mybatis.pojo.BaseEntity;
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
    public IPage<BSysUser> selectByQuery(BSysUserQuery query, int page, int size) {
        TbSysUserQuery sysUserQuery = converter.sysUser(query);
        return new PageResult<>(converter.sysUser(sysUserService.selectByQuery(sysUserQuery, page, size)));
    }

    @Override
    public List<BSysUser> selectByQuery(BSysUserQuery query) {
        TbSysUserQuery sysUserQuery = converter.sysUser(query);
        return converter.sysUser(sysUserService.selectByQuery(sysUserQuery));
    }

    @Override
    public BSysUser get(Long id) {
        return converter.sysUser(sysUserService.selectByPrimaryKey(id));
    }

    @Override
    public void save(BSysUserVo BSysUserVo) {
        addUser(BSysUserVo);
    }

    @Override
    public void update(BSysUserVo sysUser) {
        switch (sysUser.getOp()) {
            default:
            case ADD:
                break;
            case UPDATE_INFO:
                updateInfo(sysUser);
                break;
            case UPDATE_ROLE:
                updateRole(sysUser);
                break;
        }
    }

    @Override
    public void delete(List<Long> ids) {
        ids.forEach(sysUserService::deleteByPrimaryKey);
    }

    @Override
    public void modify(BSysUserVo BSysUserVo) {
        sysUserService.updateByPrimaryKey(converter.sysUser(BSysUserVo));
    }

    @Override
    public void delete(Long id) {
        sysUserService.deleteByPrimaryKey(id);
    }

    private void addUser(BSysUserVo BSysUserVo) {
        TbSysUser sysUser = converter.sysUser(BSysUserVo);
        sysUserService.insert(sysUser);
        List<TbSysRole> sysRoles = sysRoleService.selectByIds(BSysUserVo.getRoleIds());
        List<Long> roleIds = sysRoles.stream().map(BaseEntity::getId).distinct().collect(Collectors.toList());
        List<TbSysUserRole> sysUserRoles = converter.sysUserRole(sysUser.getId(), roleIds);
        sysUserRoles.forEach(sysUserRoleService::insert);
    }

    private void updateInfo(BSysUserVo sysUser) {
        sysUserService.updateByPrimaryKeySelective(converter.sysUserUpdateInfo(sysUser));
    }

    private void updateRole(BSysUserVo sysUser) {
        Long id = sysUser.getId();
        List<Long> roleIds = sysUser.getRoleIds();
        sysUserRoleService.deleteByUserId(id);
        List<TbSysUserRole> sysUserRoles = converter.sysUserRole(id, roleIds);
        sysUserRoles.forEach(sysUserRoleService::insert);
    }
}