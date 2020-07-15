package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.pojo.TbSysRoute;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbSysRouteMapper;
import org.myproject.boot.application.admin.db.service.TbSysRouteService;

import java.util.List;

@Service
public class TbSysRouteServiceImpl implements TbSysRouteService {

    @Resource
    private TbSysRouteMapper tbSysRouteMapper;

    @Override
    public List<TbSysRoute> selectAll() {
        return tbSysRouteMapper.selectAll();
    }

    @Override
    public int insert(TbSysRoute sysRoute) {
        return tbSysRouteMapper.insert(sysRoute);
    }
}

