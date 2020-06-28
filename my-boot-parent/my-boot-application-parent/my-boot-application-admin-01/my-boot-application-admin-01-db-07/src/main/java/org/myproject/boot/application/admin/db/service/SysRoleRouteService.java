package org.myproject.boot.application.admin.db.service;

import java.util.List;
import org.myproject.boot.application.admin.db.pojo.SysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.SysRoleRouteExample;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysRoleRouteService extends IService<SysRoleRoute>{


    long countByExample(SysRoleRouteExample example);

    int deleteByExample(SysRoleRouteExample example);

    List<SysRoleRoute> selectByExample(SysRoleRouteExample example);

    int updateByExampleSelective(SysRoleRoute record,SysRoleRouteExample example);

    int updateByExample(SysRoleRoute record,SysRoleRouteExample example);

}
