package org.myproject.app.customer.service;

import org.myproject.app.commons.pojo.IPage;
import org.myproject.app.customer.pojo.CustomerAddress;
import org.myproject.app.customer.pojo.CustomerAddressExample;
import org.myproject.app.customer.pojo.CustomerAddressQuery;
import org.myproject.app.customer.pojo.CustomerAddressVo;

import java.util.Collection;
import java.util.List;

public interface CustomerAddressService {


    long countByExample(CustomerAddressExample example);

    int deleteByExample(CustomerAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerAddress record);

    int insert(CustomerAddressVo record);

    int insertOrUpdate(CustomerAddress record);

    int insertOrUpdateSelective(CustomerAddress record);

    int insertSelective(CustomerAddress record);

    List<CustomerAddress> selectByExample(CustomerAddressExample example);

    CustomerAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(CustomerAddress record, CustomerAddressExample example);

    int updateByExample(CustomerAddress record, CustomerAddressExample example);

    int updateByPrimaryKeySelective(CustomerAddress record);

    int updateByPrimaryKeySelective(CustomerAddressVo record);

    int updateByPrimaryKey(CustomerAddress record);

    int updateBatch(List<CustomerAddress> list);

    int updateBatchSelective(List<CustomerAddress> list);

    int batchInsert(List<CustomerAddress> list);

    int deleteByIdIn(Collection<Long> idCollection);

    int deleteByIdAndCustomerIdIn(Long id, Collection<Long> customerIdCollection);

    IPage<CustomerAddress> selectPageByQuery(CustomerAddressQuery query);
}

