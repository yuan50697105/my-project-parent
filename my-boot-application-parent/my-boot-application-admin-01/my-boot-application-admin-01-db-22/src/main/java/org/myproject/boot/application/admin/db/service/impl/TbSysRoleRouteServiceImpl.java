package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysRoleRouteMapper;
import org.myproject.boot.application.admin.db.service.TbSysRoleRouteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbSysRoleRouteServiceImpl implements TbSysRoleRouteService {

    @Resource
    private TbSysRoleRouteMapper tbSysRoleRouteMapper;

}

