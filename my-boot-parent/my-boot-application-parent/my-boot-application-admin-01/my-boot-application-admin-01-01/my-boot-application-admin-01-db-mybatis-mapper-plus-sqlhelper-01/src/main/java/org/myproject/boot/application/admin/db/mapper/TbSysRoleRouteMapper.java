package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleRouteExample;

import java.util.List;

@Mapper
public interface TbSysRoleRouteMapper extends BaseMapper<TbSysRoleRoute>, tk.mybatis.mapper.common.Mapper<TbSysRoleRoute> {
    long countByExample(TbSysRoleRouteExample example);

    int deleteByExample(TbSysRoleRouteExample example);

    List<TbSysRoleRoute> selectByExample(TbSysRoleRouteExample example);

    int updateByExampleSelective(@Param("record") TbSysRoleRoute record, @Param("example") TbSysRoleRouteExample example);

    int updateByExample(@Param("record") TbSysRoleRoute record, @Param("example") TbSysRoleRouteExample example);
}