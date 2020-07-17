package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbSysRoleRouteMapper;
import org.myproject.boot.application.admin.db.service.TbSysRoleRouteService;

@Service
public class TbSysRoleRouteServiceImpl implements TbSysRoleRouteService {

    @Resource
    private TbSysRoleRouteMapper tbSysRoleRouteMapper;

}

