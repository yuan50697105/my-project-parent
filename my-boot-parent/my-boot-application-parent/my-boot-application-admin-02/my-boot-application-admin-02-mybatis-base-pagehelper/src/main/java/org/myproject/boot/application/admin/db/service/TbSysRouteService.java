package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbSysRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRouteExample;

import java.util.List;

public interface TbSysRouteService {


    List<TbSysRoute> selectAll();


    int insert(TbSysRoute sysRoute);

    long countByExample(TbSysRouteExample example);

    int deleteByExample(TbSysRouteExample example);

    int insertSelective(TbSysRoute record);

    List<TbSysRoute> selectByExample(TbSysRouteExample example);

    int updateByExampleSelective(TbSysRoute record, TbSysRouteExample example);

    int updateByExample(TbSysRoute record, TbSysRouteExample example);

    int batchInsert(List<TbSysRoute> list);
}


