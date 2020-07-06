package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.SysRoleRoute;

@Mapper
public interface SysRoleRouteMapper extends BaseMapper<SysRoleRoute>, tk.mybatis.mapper.common.Mapper<SysRoleRoute> {
}