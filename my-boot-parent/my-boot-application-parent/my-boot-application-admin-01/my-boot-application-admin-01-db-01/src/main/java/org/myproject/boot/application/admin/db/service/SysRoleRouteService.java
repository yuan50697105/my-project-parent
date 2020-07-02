package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.SysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.SysRoleRouteExample;

import java.util.List;

public interface SysRoleRouteService {


    long countByExample(SysRoleRouteExample example);

    int deleteByExample(SysRoleRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRoleRoute record);

    int insertSelective(SysRoleRoute record);

    List<SysRoleRoute> selectByExample(SysRoleRouteExample example);

    SysRoleRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysRoleRoute record, SysRoleRouteExample example);

    int updateByExample(SysRoleRoute record, SysRoleRouteExample example);

    int updateByPrimaryKeySelective(SysRoleRoute record);

    int updateByPrimaryKey(SysRoleRoute record);

}
