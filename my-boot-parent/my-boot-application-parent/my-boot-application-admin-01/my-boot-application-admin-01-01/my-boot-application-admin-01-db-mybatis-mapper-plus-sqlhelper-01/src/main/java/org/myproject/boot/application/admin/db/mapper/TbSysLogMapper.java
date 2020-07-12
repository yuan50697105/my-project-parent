package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysLog;
import org.myproject.boot.application.admin.db.pojo.TbSysLogExample;

import java.util.List;

@Mapper
public interface TbSysLogMapper extends BaseMapper<TbSysLog>, tk.mybatis.mapper.common.Mapper<TbSysLog> {
    long countByExample(TbSysLogExample example);

    int deleteByExample(TbSysLogExample example);

    List<TbSysLog> selectByExample(TbSysLogExample example);

    int updateByExampleSelective(@Param("record") TbSysLog record, @Param("example") TbSysLogExample example);

    int updateByExample(@Param("record") TbSysLog record, @Param("example") TbSysLogExample example);
}