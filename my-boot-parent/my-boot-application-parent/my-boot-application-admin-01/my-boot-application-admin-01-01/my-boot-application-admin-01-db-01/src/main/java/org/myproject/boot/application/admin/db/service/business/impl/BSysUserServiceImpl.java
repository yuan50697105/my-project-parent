package org.myproject.boot.application.admin.db.service.business.impl;
import com.google.common.collect.Lists;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.*;
import org.myproject.boot.application.admin.db.service.business.BSysUserService;
import org.myproject.boot.application.admin.db.service.base.SysRoleService;
import org.myproject.boot.application.admin.db.service.base.SysUserRoleService;
import org.myproject.boot.application.admin.db.service.base.SysUserService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:18
 */
@Service
@Transactional
@AllArgsConstructor
public class BSysUserServiceImpl implements BSysUserService {
    private final SysUserService sysUserService;
    private final SysRoleService sysRoleService;
    private final SysUserRoleService sysUserRoleService;

    @Override
    public PageResult<SysUser> selectByQueryWithPage(int page, int size, SysUserQuery query) {
        return new PageResult<>(sysUserService.selectByQuery(query,page, size));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        return sysUserService.selectByQuery(query);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserService.selectByPrimaryKey(id);
    }

    @Override
    public int insert(SysUserVo sysUserVo) {
        SysUser sysUser = createUser(sysUserVo);
        sysUserService.insert(sysUser);
        List<SysRole> sysRoles = selectRoleListByIds(sysUserVo.getRoleIds());
        List<SysUserRole> userRoles = createUserRoles(sysUser, sysRoles);
        sysUserRoleService.insertBatch(userRoles);
        return 1;
    }

    @Override
    public int update(SysUserVo sysUserVo) {
        SysUser sysUser = createUser(sysUserVo);
        return sysUserService.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public int deleteByExample(SysUserExample example) {
        return sysUserService.deleteByExample(example);
    }

    @Override
    public int delete(Long id) {
        deleteUserRoleById(id);
        return sysUserService.deleteByPrimaryKey(id);
    }

    @Override
    public int delete(List<Long> ids) {
        deleteUserRoleByIds(ids);
        SysUserExample example = new SysUserExample();
        example.or().andIdIn(ids);
        return deleteByExample(example);
    }

    private List<SysRole> selectRoleListByIds(List<Long> roleIds) {
        SysRoleExample example = new SysRoleExample();
        example.or().andIdIn(roleIds);
        return sysRoleService.selectByExample(example);
    }

    private SysUser createUser(SysUserVo sysUserVo) {
        SysUser sysUser = new SysUser();
        sysUser.setId(sysUserVo.getId());
        sysUser.setUsername(sysUserVo.getUsername());
        sysUser.setName(sysUserVo.getName());
        sysUser.setPassword(sysUserVo.getPassword());
        sysUser.setEnabled(sysUserVo.getEnabled());
        sysUser.setId(sysUserVo.getId());
        return sysUser;
    }

    private List<SysUserRole> createUserRoles(SysUser sysUser, List<SysRole> sysRoles) {
        List<SysUserRole> userRoles=Lists.newArrayList();
        for (SysRole sysRole :sysRoles) {
            userRoles.add(new SysUserRole(sysUser.getId(),sysRole.getId()));
        }
        return userRoles;
    }

    private void deleteUserRoleById(Long id) {
        SysUserRoleExample example = new SysUserRoleExample();
        example.or().andRoleIdEqualTo(id);
        sysUserRoleService.deleteByExample(example);

    }

    private void deleteUserRoleByIds(List<Long> ids) {
        SysUserRoleExample example = new SysUserRoleExample();
        example.or().andRoleIdIn(ids);
        sysUserRoleService.deleteByExample(example);
    }
}