package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;

@Mapper
public interface SysRouteMapper extends BaseMapper<SysRoute> {
    long countByExample(SysRouteExample example);

    int deleteByExample(SysRouteExample example);

    List<SysRoute> selectByExample(SysRouteExample example);

    int updateByExampleSelective(@Param("record") SysRoute record, @Param("example") SysRouteExample example);

    int updateByExample(@Param("record") SysRoute record, @Param("example") SysRouteExample example);
}