package org.myproject.boot.application.admin.service.impl;

import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.service.TbSysPermissionService;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.application.admin.db.service.TbSysRouteService;
import org.myproject.boot.application.admin.db.service.TbSysUserRoleService;
import org.myproject.boot.application.admin.service.converter.ConverterService;
import org.myproject.boot.application.admin.service.pojo.SysRoleAoDTO;
import org.myproject.boot.application.admin.service.pojo.SysRoleVoDTO;
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
    public void save(SysRoleVoDTO sysRoleVoDTO) {
        switch (sysRoleVoDTO.getEvent()) {
            case ADD:
                insert(sysRoleVoDTO);
                break;
            case UPDATE:
                update(sysRoleVoDTO);
                break;
        }
    }

    private void update(SysRoleVoDTO sysRoleVoDTO) {
        Long id = sysRoleVoDTO.getId();
        TbSysRole tbSysRole = sysRoleService.selectByPrimaryKey(id);
        converterService.copySysRole(sysRoleVoDTO, tbSysRole);
        sysRoleService.updateByPrimaryKeySelective(tbSysRole);
    }

    private void insert(SysRoleVoDTO sysRoleVoDTO) {
        sysRoleService.insert(converterService.sysRoles(sysRoleVoDTO));
    }

    @Override
    public void delete(Long id) {
        sysRoleService.deleteByPrimaryKey(id);
        sysUserRoleService.deleteByRoleId(id);
        sysRouteService.deleteByRoleId(id);
        sysPermissionService.deleteByRoleId(id);
    }

    @Override
    public SysRoleAoDTO get(Long id) {
        TbSysRole tbSysRole = sysRoleService.selectByPrimaryKey(id);
        return converterService.sysRoles(tbSysRole);
    }

}