package org.myproject.boot.application.admin.db.service.table;

import java.util.List;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;

public interface SysRouteService {


    long countByExample(SysRouteExample example);

    int deleteByExample(SysRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRoute record);

    int insertSelective(SysRoute record);

    List<SysRoute> selectByExample(SysRouteExample example);

    SysRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysRoute record, SysRouteExample example);

    int updateByExample(SysRoute record, SysRouteExample example);

    int updateByPrimaryKeySelective(SysRoute record);

    int updateByPrimaryKey(SysRoute record);

}

