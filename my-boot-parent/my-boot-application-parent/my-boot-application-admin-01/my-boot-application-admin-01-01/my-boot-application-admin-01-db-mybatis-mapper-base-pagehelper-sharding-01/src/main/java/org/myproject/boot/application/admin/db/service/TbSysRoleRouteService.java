package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbSysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleRouteExample;

import java.util.List;

public interface TbSysRoleRouteService {


    long countByExample(TbSysRoleRouteExample example);

    int deleteByExample(TbSysRoleRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysRoleRoute record);

    int insertSelective(TbSysRoleRoute record);

    List<TbSysRoleRoute> selectByExample(TbSysRoleRouteExample example);

    TbSysRoleRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbSysRoleRoute record, TbSysRoleRouteExample example);

    int updateByExample(TbSysRoleRoute record, TbSysRoleRouteExample example);

    int updateByPrimaryKeySelective(TbSysRoleRoute record);

    int updateByPrimaryKey(TbSysRoleRoute record);

}

