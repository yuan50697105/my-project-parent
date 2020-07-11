package org.myproject.boot.application.admin.db.service;

import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbSysRouteExample;
import org.myproject.boot.application.admin.db.pojo.TbSysRoute;
public interface TbSysRouteService{


    long countByExample(TbSysRouteExample example);

    int deleteByExample(TbSysRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysRoute record);

    int insertSelective(TbSysRoute record);

    List<TbSysRoute> selectByExample(TbSysRouteExample example);

    TbSysRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbSysRoute record,TbSysRouteExample example);

    int updateByExample(TbSysRoute record,TbSysRouteExample example);

    int updateByPrimaryKeySelective(TbSysRoute record);

    int updateByPrimaryKey(TbSysRoute record);

}
