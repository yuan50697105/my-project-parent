package org.myproject.app.customer.service;

import org.myproject.app.customer.pojo.CustomerInfo;
import org.myproject.app.customer.pojo.CustomerInfoExample;
import org.myproject.app.customer.pojo.CustomerInfoQuery;
import org.myproject.app.customer.pojo.CustomerInfoVo;
import org.myproject.app.db.commons.pojo.IPage;

import java.util.Collection;
import java.util.List;

public interface CustomerInfoService {


    long countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerInfo record);

    int insertOrUpdate(CustomerInfo record);

    int insertOrUpdateSelective(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    CustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(CustomerInfo record, CustomerInfoExample example);

    int updateByExample(CustomerInfo record, CustomerInfoExample example);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

    int updateBatch(List<CustomerInfo> list);

    int batchInsert(List<CustomerInfo> list);

    IPage<CustomerInfo> selectPageByQuery(CustomerInfoQuery query);

    int insert(CustomerInfoVo customerInfoVo);

    int updateByPrimaryKeySelective(CustomerInfoVo customerInfoVo);

    int deleteByIdIn(List<Long> asList);

    List<CustomerInfo> selectAllByIdIn(Collection<Long> idCollection);
}

