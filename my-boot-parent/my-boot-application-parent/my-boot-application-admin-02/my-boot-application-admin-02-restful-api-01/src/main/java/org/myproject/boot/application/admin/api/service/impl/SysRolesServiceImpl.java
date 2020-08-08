package org.myproject.boot.application.admin.api.service.impl;

import org.myproject.boot.application.admin.api.pojo.SysRolesAo;
import org.myproject.boot.application.admin.api.service.ApiConverter;
import org.myproject.boot.application.admin.api.service.SysRolesService;
import org.myproject.boot.application.admin.service.pojo.SysRoleAoDTO;
import org.myproject.boot.application.admin.service.service.SysRoleService;
import org.myproject.boot.application.admin.service.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-08 19:46
 */
@Service
public class SysRolesServiceImpl implements SysRolesService {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private ApiConverter converter;


    @Override
    public SysRolesAo get(Long id) {
        SysRoleAoDTO sysRoleAoDTO = sysRoleService.get(id);
        return converter.sysRoles(sysRoleAoDTO) ;
    }
}