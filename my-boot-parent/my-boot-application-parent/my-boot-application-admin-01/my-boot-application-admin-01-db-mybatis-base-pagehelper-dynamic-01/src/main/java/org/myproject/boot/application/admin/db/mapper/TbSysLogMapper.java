package org.myproject.boot.application.admin.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysLog;
import org.myproject.boot.application.admin.db.pojo.TbSysLogExample;

@Mapper
public interface TbSysLogMapper {
    long countByExample(TbSysLogExample example);

    int deleteByExample(TbSysLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysLog record);

    int insertSelective(TbSysLog record);

    List<TbSysLog> selectByExample(TbSysLogExample example);

    TbSysLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSysLog record, @Param("example") TbSysLogExample example);

    int updateByExample(@Param("record") TbSysLog record, @Param("example") TbSysLogExample example);

    int updateByPrimaryKeySelective(TbSysLog record);

    int updateByPrimaryKey(TbSysLog record);
}