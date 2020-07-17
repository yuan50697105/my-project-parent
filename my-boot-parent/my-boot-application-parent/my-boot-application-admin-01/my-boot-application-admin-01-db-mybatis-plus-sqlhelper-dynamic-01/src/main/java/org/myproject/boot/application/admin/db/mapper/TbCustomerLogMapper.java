package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLog;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLogExample;

import java.util.List;

@Mapper
public interface TbCustomerLogMapper extends BaseMapper<TbCustomerLog> {
    long countByExample(TbCustomerLogExample example);

    int deleteByExample(TbCustomerLogExample example);

    List<TbCustomerLog> selectByExample(TbCustomerLogExample example);

    int updateByExampleSelective(@Param("record") TbCustomerLog record, @Param("example") TbCustomerLogExample example);

    int updateByExample(@Param("record") TbCustomerLog record, @Param("example") TbCustomerLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCustomerLog record);

    int insertSelective(TbCustomerLog record);

    TbCustomerLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbCustomerLog record);

    int updateByPrimaryKey(TbCustomerLog record);
}