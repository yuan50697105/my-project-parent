package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoExample;

import java.util.List;

@Mapper
public interface TbCustomerInfoMapper extends tk.mybatis.mapper.common.Mapper<TbCustomerInfo> {
    long countByExample(TbCustomerInfoExample example);

    int deleteByExample(TbCustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCustomerInfo record);

    int insertSelective(TbCustomerInfo record);

    List<TbCustomerInfo> selectByExample(TbCustomerInfoExample example);

    TbCustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCustomerInfo record, @Param("example") TbCustomerInfoExample example);

    int updateByExample(@Param("record") TbCustomerInfo record, @Param("example") TbCustomerInfoExample example);

    int updateByPrimaryKeySelective(TbCustomerInfo record);

    int updateByPrimaryKey(TbCustomerInfo record);
}