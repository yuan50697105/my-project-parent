package org.myproject.boot.application.admin.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.application.admin.db.service.TbSysUserRoleService;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
import org.myproject.boot.application.admin.service.converter.ConverterService;
import org.myproject.boot.application.admin.service.pojo.*;
import org.myproject.boot.application.admin.service.service.SysUserService;
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
    public SysUserAoDTO get(Long id) {
        TbSysUser tbSysUser = sysUserService.selectByPrimaryKey(id);
        SysUserAoDTO sysUserAoDTO = converterService.sysUser(tbSysUser);
        List<Long> roleIds = sysUserRoleService.selectRoleIdByUserId(id);
        sysUserAoDTO.setRoles(converterService.sysRoles(sysRoleService.selectByIds(roleIds)));
        return sysUserAoDTO;
    }

    @Override
    public List<SysRoleAoDTO> get(Long userId, Long roleId) {
        throw new RuntimeException("未实现");
    }

    @Override
    public List<SysUserAoDTO> list(SysUserQueryDTO queryDTO) {
        TbSysUserQuery sysUserQuery = converterService.sysUser(queryDTO);
        List<TbSysUser> list = sysUserService.selectByQuery(sysUserQuery);
        return converterService.sysUser(list);
    }

    @Override
    public IPage<SysUserAoDTO> list(SysUserQueryDTO queryDTO, int page, int limit) {
        PageHelper.startPage(page, limit);
        TbSysUserQuery sysUserQuery = converterService.sysUser(queryDTO);
        PageInfo<TbSysUser> pageInfo = sysUserService.selectByQuery(sysUserQuery, page, limit);
        return new PageResult<>(converterService.sysUsers(pageInfo));
    }

    @Override
    public void save(SysUserVoDTO sysUsers) {
        switch (sysUsers.event()) {
            case UPDATE:
                update(sysUsers);
                break;
            case ADD:
                insert(sysUsers);
                break;
        }
    }

    private void update(SysUserVoDTO sysUsers) {
        Long id = sysUsers.id();
        TbSysUser tbSysUser = sysUserService.selectByPrimaryKey(id);
        converterService.copySysUser(sysUsers, tbSysUser);
        List<Long> roleIds = sysUsers.getRoleIds();
        List<Long> roleIdsDb = sysUserRoleService.selectRoleIdByUserId(sysUsers.id());
        Collection<Long> intersection = CollUtil.intersection(roleIds, roleIdsDb);
        roleIdsDb.removeAll(intersection);
        roleIdsDb.forEach(sysUserRoleService::deleteByRoleId);
        roleIds.removeAll(intersection);
        roleIds.stream().map(sysUserRole(tbSysUser)).forEach(sysUserRoleService::insert);
        sysUserService.updateByPrimaryKeySelective(tbSysUser);

    }

    private void insert(SysUserVoDTO sysUsers) {
        TbSysUser tbSysUser = converterService.sysUser(sysUsers);
        sysUserService.insert(tbSysUser);
        List<Long> roleIds = sysRoleService.selecIdtByIds(sysUsers.getRoleIds());
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