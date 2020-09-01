package org.myproject.app.db.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.db.customer.pojo.CustomerAddress;
import org.myproject.app.db.customer.pojo.CustomerAddressExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface CustomerAddressMapper {
    long countByExample(CustomerAddressExample example);

    int deleteByExample(CustomerAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerAddress record);

    int insertOrUpdate(CustomerAddress record);

    int insertOrUpdateSelective(CustomerAddress record);

    int insertSelective(CustomerAddress record);

    List<CustomerAddress> selectByExample(CustomerAddressExample example);

    CustomerAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerAddress record, @Param("example") CustomerAddressExample example);

    int updateByExample(@Param("record") CustomerAddress record, @Param("example") CustomerAddressExample example);

    int updateByPrimaryKeySelective(CustomerAddress record);

    int updateByPrimaryKey(CustomerAddress record);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);

    int deleteByIdAndCustomerIdIn(@Param("id") Long id, @Param("customerIdCollection") Collection<Long> customerIdCollection);

    int updateBatch(List<CustomerAddress> list);

    int updateBatchSelective(List<CustomerAddress> list);

    int batchInsert(@Param("list") List<CustomerAddress> list);
}