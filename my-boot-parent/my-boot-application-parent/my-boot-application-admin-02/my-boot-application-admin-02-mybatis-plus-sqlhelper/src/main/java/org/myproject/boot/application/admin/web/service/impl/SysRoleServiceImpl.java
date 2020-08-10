package org.myproject.boot.application.admin.web.service.impl;

import org.myproject.boot.application.admin.web.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.web.db.service.TbSysPermissionService;
import org.myproject.boot.application.admin.web.db.service.TbSysRoleService;
import org.myproject.boot.application.admin.web.db.service.TbSysRouteService;
import org.myproject.boot.application.admin.web.db.service.TbSysUserRoleService;
import org.myproject.boot.application.admin.web.service.converter.ConverterService;
import org.myproject.boot.application.admin.service.pojo.SysRoleAo;
import org.myproject.boot.application.admin.service.pojo.SysRoleVo;
import org.myproject.boot.application.admin.service.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-08 19:22
 */
@Service
@Transactional
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private TbSysUserRoleService sysUserRoleService;
    @Autowired
    private TbSysRoleService sysRoleService;
    @Autowired
    private TbSysRouteService sysRouteService;
    @Autowired
    private TbSysPermissionService sysPermissionService;
    @Autowired
    private ConverterService converterService;

    @Override
    public void save(SysRoleVo sysRoleVo) {
        switch (sysRoleVo.getEvent()) {
            case ADD:
                insert(sysRoleVo);
                break;
            case UPDATE:
                update(sysRoleVo);
                break;
        }
    }

    private void update(SysRoleVo sysRoleVo) {
        Long id = sysRoleVo.getId();
        TbSysRole tbSysRole = sysRoleService.getById(id);
        converterService.copySysRole(sysRoleVo, tbSysRole);
        sysRoleService.updateById(tbSysRole);
    }

    private void insert(SysRoleVo sysRoleVo) {
        sysRoleService.save(converterService.sysRoles(sysRoleVo));
    }

    @Override
    public void delete(Long id) {
        sysRoleService.removeById(id);
        sysUserRoleService.removeByRoleId(id);
        sysRouteService.removeByRoleId(id);
        sysPermissionService.removeByRoleId(id);
    }

    @Override
    public SysRoleAo get(Long id) {
        TbSysRole tbSysRole = sysRoleService.getById(id);
        return converterService.sysRoles(tbSysRole);
    }

}