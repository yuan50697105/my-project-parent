package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRouteExample;

import java.util.List;

@Mapper
public interface TbSysRouteMapper {
    long countByExample(TbSysRouteExample example);

    int deleteByExample(TbSysRouteExample example);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TbSysRoute record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TbSysRoute record);

    List<TbSysRoute> selectByExample(TbSysRouteExample example);

    int updateByExampleSelective(@Param("record") TbSysRoute record, @Param("example") TbSysRouteExample example);

    int updateByExample(@Param("record") TbSysRoute record, @Param("example") TbSysRouteExample example);
}