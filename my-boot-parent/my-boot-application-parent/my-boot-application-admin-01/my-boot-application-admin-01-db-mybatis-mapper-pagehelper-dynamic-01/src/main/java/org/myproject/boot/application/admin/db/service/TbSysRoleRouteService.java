package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleRouteExample;

import java.util.List;

public interface TbSysRoleRouteService extends IService<TbSysRoleRoute> {


    long countByExample(TbSysRoleRouteExample example);

    int deleteByExample(TbSysRoleRouteExample example);

    List<TbSysRoleRoute> selectByExample(TbSysRoleRouteExample example);

    int updateByExampleSelective(TbSysRoleRoute record, TbSysRoleRouteExample example);

    int updateByExample(TbSysRoleRoute record, TbSysRoleRouteExample example);

}

