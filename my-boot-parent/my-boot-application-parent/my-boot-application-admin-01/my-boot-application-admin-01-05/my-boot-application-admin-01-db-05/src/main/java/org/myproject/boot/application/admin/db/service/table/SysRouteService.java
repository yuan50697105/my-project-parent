package org.myproject.boot.application.admin.db.service.table;

import org.myproject.boot.application.admin.db.pojo.SysRoute;

import java.util.List;

public interface SysRouteService {


    List<SysRoute> selectByExample(Object object);

    int insert(SysRoute sysRoute);
}
