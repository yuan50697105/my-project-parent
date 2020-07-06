package org.myproject.boot.application.admin.db.service.table;

import org.myproject.boot.application.admin.db.pojo.SysRoute;
import com.baomidou.mybatisplus.extension.service.IService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface SysRouteService extends IService<SysRoute>{


    List<SysRoute> selectByExample(Object example);
}
