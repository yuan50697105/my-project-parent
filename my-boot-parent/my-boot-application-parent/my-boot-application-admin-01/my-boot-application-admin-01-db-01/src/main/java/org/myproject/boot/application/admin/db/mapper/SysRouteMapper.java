package org.myproject.boot.application.admin.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;

@Mapper
public interface SysRouteMapper {
    long countByExample(SysRouteExample example);

    int deleteByExample(SysRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRoute record);

    int insertSelective(SysRoute record);

    List<SysRoute> selectByExample(SysRouteExample example);

    SysRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRoute record, @Param("example") SysRouteExample example);

    int updateByExample(@Param("record") SysRoute record, @Param("example") SysRouteExample example);

    int updateByPrimaryKeySelective(SysRoute record);

    int updateByPrimaryKey(SysRoute record);
}