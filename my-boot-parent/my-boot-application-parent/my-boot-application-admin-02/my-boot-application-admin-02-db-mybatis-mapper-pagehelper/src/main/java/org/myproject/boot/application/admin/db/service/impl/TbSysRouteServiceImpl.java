package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysRouteMapper;
import org.myproject.boot.application.admin.db.service.TbSysRouteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbSysRouteServiceImpl implements TbSysRouteService {

    @Resource
    private TbSysRouteMapper tbSysRouteMapper;

}
