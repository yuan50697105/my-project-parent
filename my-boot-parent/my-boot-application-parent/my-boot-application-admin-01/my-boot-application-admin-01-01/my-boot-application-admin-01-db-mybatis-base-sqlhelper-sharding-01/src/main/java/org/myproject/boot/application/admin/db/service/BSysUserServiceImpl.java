package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.SysUserConverter;
import org.myproject.boot.application.admin.db.converter.SysUserRoleConverter;
import org.myproject.boot.application.admin.db.pojo.*;
import org.myproject.boot.application.admin.db.service.table.SysRoleService;
import org.myproject.boot.application.admin.db.service.table.SysUserRoleService;
import org.myproject.boot.application.admin.db.service.table.SysUserService;
import org.myproject.boot.application.admin.pojo.SysUser;
import org.myproject.boot.application.admin.pojo.SysUserQuery;
import org.myproject.boot.application.admin.pojo.SysUserVo;
import org.myproject.boot.application.admin.service.BSysUserService;
import org.myproject.boot.mybatis.commons.pojo.IPage;
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
    private final SysUserConverter sysUserConverter;
    private final SysUserRoleConverter sysUserRoleConverter;

    @Override
    public IPage<SysUser> selectByQuery(SysUserQuery query, int page, int size) {
        SysUserQuery sysUserQuery = sysUserConverter.convert(query);
        PageInfo<SysUser> pageInfo = sysUserService.selectByQuery(sysUserQuery, page, size);
        return new PageResult<>(sysUserConverter.convert(pageInfo));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {

        SysUserQuery sysUserQuery = sysUserConverter.convert(query);
        List<SysUser> list = sysUserService.selectByQuery(sysUserQuery);
        return sysUserConverter.convert(list);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        SysUser sysUser = sysUserService.selectByPrimaryKey(id);
        return sysUserConverter.convert(sysUser);
    }

    @Override
    public int insert(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convert(sysUserVo);
        sysUserService.insert(sysUser);
        List<SysRole> sysRoles = selectRoleListByIds(sysUserVo.getRoleIds());
        List<SysUserRole> userRoles = sysUserRoleConverter.convert(sysUser, sysRoles);
        sysUserRoleService.insertBatch(userRoles);
        return 1;
    }

    @Override
    public int update(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convert(sysUserVo);
        return sysUserService.updateByPrimaryKeySelective(sysUser);
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
        return sysUserService.deleteByExample(example);
    }

    private List<SysRole> selectRoleListByIds(List<Long> roleIds) {
        SysRoleExample example = new SysRoleExample();
        example.or().andIdIn(roleIds);
        return sysRoleService.selectByExample(example);
    }

    private List<SysUserRole> createUserRoles(SysUser sysUser, List<SysRole> sysRoles) {
        List<SysUserRole> userRoles = Lists.newArrayList();
        for (SysRole sysRole : sysRoles) {
            userRoles.add(new SysUserRole(sysUser.getId(), sysRole.getId()));
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