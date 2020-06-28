package org.myproject.boot.application.admin.db.service;

import java.util.List;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysRouteService extends IService<SysRoute>{


    long countByExample(SysRouteExample example);

    int deleteByExample(SysRouteExample example);

    List<SysRoute> selectByExample(SysRouteExample example);

    int updateByExampleSelective(SysRoute record,SysRouteExample example);

    int updateByExample(SysRoute record,SysRouteExample example);

}
