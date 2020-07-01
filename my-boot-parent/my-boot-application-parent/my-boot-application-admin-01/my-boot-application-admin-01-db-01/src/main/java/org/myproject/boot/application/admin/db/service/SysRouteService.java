package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;

import java.util.List;

public interface SysRouteService extends IService<SysRoute> {


    long countByExample(SysRouteExample example);

    int deleteByExample(SysRouteExample example);

    List<SysRoute> selectByExample(SysRouteExample example);

    int updateByExampleSelective(SysRoute record, SysRouteExample example);

    int updateByExample(SysRoute record, SysRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRoute record);

    int insertSelective(SysRoute record);

    SysRoute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoute record);

    int updateByPrimaryKey(SysRoute record);
}

