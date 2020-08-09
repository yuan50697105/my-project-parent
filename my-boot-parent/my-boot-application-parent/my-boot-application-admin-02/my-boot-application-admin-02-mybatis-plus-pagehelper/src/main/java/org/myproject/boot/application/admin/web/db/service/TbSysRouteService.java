package org.myproject.boot.application.admin.web.db.service;

import java.util.List;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRouteExample;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRoute;
import com.baomidou.mybatisplus.extension.service.IService;

public interface TbSysRouteService extends IService<TbSysRoute>{


    long countByExample(TbSysRouteExample example);

    int deleteByExample(TbSysRouteExample example);

    List<TbSysRoute> selectByExample(TbSysRouteExample example);

    int updateByExampleSelective(TbSysRoute record,TbSysRouteExample example);

    int updateByExample(TbSysRoute record,TbSysRouteExample example);

    void removeByRoleId(Long roleId);
}
