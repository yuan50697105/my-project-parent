package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import org.myproject.boot.application.admin.db.pojo.TbSysRoleRoute;import org.myproject.boot.application.admin.db.pojo.TbSysRoleRouteExample;import java.util.List;

@Mapper
public interface TbSysRoleRouteMapper extends tk.mybatis.mapper.common.Mapper<TbSysRoleRoute> {
    long countByExample(TbSysRoleRouteExample example);

    int deleteByExample(TbSysRoleRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysRoleRoute record);

    int insertSelective(TbSysRoleRoute record);

    List<TbSysRoleRoute> selectByExample(TbSysRoleRouteExample example);

    TbSysRoleRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSysRoleRoute record, @Param("example") TbSysRoleRouteExample example);

    int updateByExample(@Param("record") TbSysRoleRoute record, @Param("example") TbSysRoleRouteExample example);

    int updateByPrimaryKeySelective(TbSysRoleRoute record);

    int updateByPrimaryKey(TbSysRoleRoute record);
}