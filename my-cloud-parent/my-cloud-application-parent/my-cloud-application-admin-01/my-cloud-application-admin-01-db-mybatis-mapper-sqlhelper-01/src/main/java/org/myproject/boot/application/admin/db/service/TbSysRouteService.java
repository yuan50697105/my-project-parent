package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbSysRoute;

import java.util.List;

public interface TbSysRouteService {


    List<TbSysRoute> selectAll();


    int insert(TbSysRoute sysRoute);
}

