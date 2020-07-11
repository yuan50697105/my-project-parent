package org.myproject.boot.application.admin.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRouteExample;

@Mapper
public interface TbSysRouteMapper {
    long countByExample(TbSysRouteExample example);

    int deleteByExample(TbSysRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysRoute record);

    int insertSelective(TbSysRoute record);

    List<TbSysRoute> selectByExample(TbSysRouteExample example);

    TbSysRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSysRoute record, @Param("example") TbSysRouteExample example);

    int updateByExample(@Param("record") TbSysRoute record, @Param("example") TbSysRouteExample example);

    int updateByPrimaryKeySelective(TbSysRoute record);

    int updateByPrimaryKey(TbSysRoute record);
}