package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysLog;
import org.myproject.boot.application.admin.db.pojo.TbSysLogExample;

import java.util.List;

@Mapper
public interface TbSysLogMapper extends BaseMapper<TbSysLog> {
    long countByExample(TbSysLogExample example);

    int deleteByExample(TbSysLogExample example);

    List<TbSysLog> selectByExample(TbSysLogExample example);

    int updateByExampleSelective(@Param("record") TbSysLog record, @Param("example") TbSysLogExample example);

    int updateByExample(@Param("record") TbSysLog record, @Param("example") TbSysLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysLog record);

    int insertSelective(TbSysLog record);

    TbSysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSysLog record);

    int updateByPrimaryKey(TbSysLog record);
}