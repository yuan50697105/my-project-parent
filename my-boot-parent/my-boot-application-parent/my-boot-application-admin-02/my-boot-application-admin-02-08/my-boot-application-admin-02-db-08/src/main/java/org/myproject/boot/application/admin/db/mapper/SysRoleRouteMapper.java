package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.SysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.SysRoleRouteExample;

import java.util.List;

@Mapper
public interface SysRoleRouteMapper extends BaseMapper<SysRoleRoute>, tk.mybatis.mapper.common.Mapper<SysRoleRoute> {
    long countByExample(SysRoleRouteExample example);

    int deleteByExample(SysRoleRouteExample example);

    List<SysRoleRoute> selectByExample(SysRoleRouteExample example);

    int updateByExampleSelective(@Param("record") SysRoleRoute record, @Param("example") SysRoleRouteExample example);

    int updateByExample(@Param("record") SysRoleRoute record, @Param("example") SysRoleRouteExample example);
}