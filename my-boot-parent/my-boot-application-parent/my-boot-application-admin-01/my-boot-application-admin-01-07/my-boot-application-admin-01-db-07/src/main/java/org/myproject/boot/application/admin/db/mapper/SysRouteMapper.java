package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.SysRoute;

@Mapper
public interface SysRouteMapper extends BaseMapper<SysRoute>, tk.mybatis.mapper.common.Mapper<SysRoute> {
}