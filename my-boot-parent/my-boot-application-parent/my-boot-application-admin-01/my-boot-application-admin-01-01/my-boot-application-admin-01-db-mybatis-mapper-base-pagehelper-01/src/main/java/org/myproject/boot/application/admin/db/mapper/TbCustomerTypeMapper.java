package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import org.myproject.boot.application.admin.db.pojo.TbCustomerType;import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;import java.util.List;

@Mapper
public interface TbCustomerTypeMapper extends tk.mybatis.mapper.common.Mapper<TbCustomerType> {
    long countByExample(TbCustomerTypeExample example);

    int deleteByExample(TbCustomerTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCustomerType record);

    int insertSelective(TbCustomerType record);

    List<TbCustomerType> selectByExample(TbCustomerTypeExample example);

    TbCustomerType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCustomerType record, @Param("example") TbCustomerTypeExample example);

    int updateByExample(@Param("record") TbCustomerType record, @Param("example") TbCustomerTypeExample example);

    int updateByPrimaryKeySelective(TbCustomerType record);

    int updateByPrimaryKey(TbCustomerType record);
}