package org.myproject.app.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.customer.pojo.CustomerType;
import org.myproject.app.customer.pojo.CustomerTypeExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface CustomerTypeMapper {
    long countByExample(CustomerTypeExample example);

    int deleteByExample(CustomerTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerType record);

    int insertOrUpdate(CustomerType record);

    int insertOrUpdateSelective(CustomerType record);

    int insertSelective(CustomerType record);

    List<CustomerType> selectByExample(CustomerTypeExample example);

    CustomerType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerType record, @Param("example") CustomerTypeExample example);

    int updateByExample(@Param("record") CustomerType record, @Param("example") CustomerTypeExample example);

    int updateByPrimaryKeySelective(CustomerType record);

    int updateByPrimaryKey(CustomerType record);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);

    List<CustomerType> selectAllByIdIn(@Param("idCollection") Collection<Long> idCollection);

    int updateBatch(List<CustomerType> list);

    int batchInsert(@Param("list") List<CustomerType> list);
}