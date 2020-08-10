package org.myproject.boot.application.admin.web.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.web.db.service.TbSysRoleService;
import org.myproject.boot.application.admin.web.db.service.TbSysUserRoleService;
import org.myproject.boot.application.admin.web.db.service.TbSysUserService;
import org.myproject.boot.application.admin.web.service.converter.ConverterService;
import org.myproject.boot.application.admin.service.pojo.PageResult;
import org.myproject.boot.application.admin.service.pojo.SysUserAo;
import org.myproject.boot.application.admin.service.pojo.SysUserQuery;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;
import org.myproject.boot.application.admin.service.service.SysUserService;
import org.myproject.boot.application.commons.pojo.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-07 21:30
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private ConverterService converterService;
    @Autowired
    private TbSysUserService sysUserService;
    @Autowired
    private TbSysRoleService sysRoleService;
    @Autowired
    private TbSysUserRoleService sysUserRoleService;

    @Override
    public SysUserAo get(Long id) {
        TbSysUser tbSysUser = sysUserService.selectByPrimaryKey(id);
        SysUserAo sysUserAo = converterService.sysUser(tbSysUser);
        List<Long> roleIds = sysUserRoleService.selectRoleIdByUserId(id);
        if (ObjectUtil.isNotEmpty(roleIds)) {
            sysUserAo.setRoles(converterService.sysRoles(sysRoleService.selectByIds(roleIds)));
        }
        return sysUserAo;
    }

    @Override
    public List<Object> get(Long userId, Long roleId) {
        throw new RuntimeException("未实现");
    }

    @Override
    public List<SysUserAo> list(SysUserQuery query) {
        TbSysUserQuery sysUserQuery = converterService.sysUser(query);
        List<TbSysUser> list = sysUserService.selectByQuery(sysUserQuery);
        return converterService.sysUser(list);
    }

    @Override
    public IPage<SysUserAo> list(SysUserQuery query, int page, int limit) {
        PageHelper.startPage(page, limit);
        TbSysUserQuery sysUserQuery = converterService.sysUser(query);
        PageInfo<TbSysUser> pageInfo = sysUserService.selectByQuery(sysUserQuery, page, limit);
        return new PageResult<>(converterService.sysUsers(pageInfo));
    }

    @Override
    public void save(SysUserVo sysUsers) {
        switch (sysUsers.getEvent()) {
            case UPDATE:
                update(sysUsers);
                break;
            case ADD:
                insert(sysUsers);
                break;
        }
    }

    @Override
    public void delete(Long id) {
        sysUserService.deleteByPrimaryKey(id);
        sysUserRoleService.deleteByUserId(id);
    }

    private void update(SysUserVo sysUsers) {
        Long id = sysUsers.getId();
        TbSysUser tbSysUser = sysUserService.selectByPrimaryKey(id);
        converterService.copySysUser(sysUsers, tbSysUser);
        List<Long> roleIds = sysUsers.getRoleIds();
        List<Long> roleIdsDb = sysUserRoleService.selectRoleIdByUserId(sysUsers.getId());
        Collection<Long> intersection = CollUtil.intersection(roleIds, roleIdsDb);
        roleIdsDb.removeAll(intersection);
        roleIdsDb.forEach(sysUserRoleService::deleteByRoleId);
        roleIds.removeAll(intersection);
        roleIds.stream().map(sysUserRole(tbSysUser)).forEach(sysUserRoleService::insert);
        sysUserService.updateByPrimaryKeySelective(tbSysUser);

    }

    private void insert(SysUserVo sysUsers) {
        TbSysUser tbSysUser = converterService.sysUser(sysUsers);
        sysUserService.insert(tbSysUser);
        List<Long> roleIds = sysRoleService.selectIdtByIds(sysUsers.getRoleIds());
        roleIds.stream().map(sysUserRole(tbSysUser)).forEach(sysUserRoleService::insert);
    }

    private Function<Long, TbSysUserRole> sysUserRole(TbSysUser tbSysUser) {
        return roleId -> {
            TbSysUserRole tbSysUserRole = new TbSysUserRole();
            tbSysUserRole.setUserId(tbSysUser.getId());
            tbSysUserRole.setRoleId(roleId);
            return tbSysUserRole;
        };
    }
}