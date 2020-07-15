package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRouteExample;

import java.util.List;

@Mapper
public interface TbSysRouteMapper extends BaseMapper<TbSysRoute> {
    long countByExample(TbSysRouteExample example);

    int deleteByExample(TbSysRouteExample example);

    List<TbSysRoute> selectByExample(TbSysRouteExample example);

    int updateByExampleSelective(@Param("record") TbSysRoute record, @Param("example") TbSysRouteExample example);

    int updateByExample(@Param("record") TbSysRoute record, @Param("example") TbSysRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysRoute record);

    int insertSelective(TbSysRoute record);

    TbSysRoute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSysRoute record);

    int updateByPrimaryKey(TbSysRoute record);
}