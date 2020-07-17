package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbSysRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRouteExample;

import java.util.List;

public interface TbSysRouteService extends IService<TbSysRoute> {


    long countByExample(TbSysRouteExample example);

    int deleteByExample(TbSysRouteExample example);

    List<TbSysRoute> selectByExample(TbSysRouteExample example);

    int updateByExampleSelective(TbSysRoute record, TbSysRouteExample example);

    int updateByExample(TbSysRoute record, TbSysRouteExample example);

}

