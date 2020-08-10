package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysRouteMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysRoute;
import org.myproject.boot.application.admin.db.service.TbSysRouteService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;

import javax.annotation.Resource;

@Service
public class TbSysRouteServiceImpl implements TbSysRouteService {

    @Resource
    private TbSysRouteMapper tbSysRouteMapper;

    @Override
    public void deleteByRoleId(Long roleId) {
        Example.Builder builder = Example.builder(TbSysRoute.class);
        builder.where(WeekendSqls.<TbSysRoute>custom().andEqualTo(TbSysRoute::getRoleId, roleId));
        tbSysRouteMapper.deleteByExample(builder.build());
    }
}
