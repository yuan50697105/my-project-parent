package org.myproject.boot.application.admin.db.service.table.impl;

import org.myproject.boot.application.admin.db.mapper.SysRouteMapper;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.service.table.SysRouteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRouteServiceImpl implements SysRouteService {

    @Resource
    private SysRouteMapper sysRouteMapper;

    @Override
    public int insert(SysRoute sysRoute) {
        return sysRouteMapper.insert(sysRoute);
    }

    @Override
    public List<SysRoute> selectByExample(Object object) {
        return sysRouteMapper.selectByExample(object);
    }
}
