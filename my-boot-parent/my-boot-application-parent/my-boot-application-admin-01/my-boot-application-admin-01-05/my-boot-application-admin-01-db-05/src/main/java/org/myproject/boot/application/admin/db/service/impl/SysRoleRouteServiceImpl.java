package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.SysRoleRouteMapper;
import org.myproject.boot.application.admin.db.service.SysRoleRouteService;
@Service
public class SysRoleRouteServiceImpl implements SysRoleRouteService{

    @Resource
    private SysRoleRouteMapper sysRoleRouteMapper;

}