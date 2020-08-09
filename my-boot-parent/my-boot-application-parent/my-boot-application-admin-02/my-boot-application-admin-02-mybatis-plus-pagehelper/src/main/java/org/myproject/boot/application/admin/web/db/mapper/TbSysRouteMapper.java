package org.myproject.boot.application.admin.web.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRoute;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRouteExample;

@Mapper
public interface TbSysRouteMapper extends BaseMapper<TbSysRoute> {
    long countByExample(TbSysRouteExample example);

    int deleteByExample(TbSysRouteExample example);

    List<TbSysRoute> selectByExample(TbSysRouteExample example);

    int updateByExampleSelective(@Param("record") TbSysRoute record, @Param("example") TbSysRouteExample example);

    int updateByExample(@Param("record") TbSysRoute record, @Param("example") TbSysRouteExample example);
}