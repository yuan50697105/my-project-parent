package org.myproject.app.customer.service;

import org.myproject.app.customer.pojo.CustomerType;
import org.myproject.app.customer.pojo.CustomerTypeExample;
import org.myproject.app.customer.pojo.CustomerTypeQuery;
import org.myproject.app.customer.pojo.CustomerTypeVo;
import org.myproject.app.db.commons.pojo.IPage;

import java.util.Collection;
import java.util.List;

public interface CustomerTypeService {


    long countByExample(CustomerTypeExample example);

    int deleteByExample(CustomerTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerType record);

    int insertOrUpdate(CustomerType record);

    int insertOrUpdateSelective(CustomerType record);

    int insertSelective(CustomerType record);

    List<CustomerType> selectByExample(CustomerTypeExample example);

    CustomerType selectByPrimaryKey(Long id);

    int updateByExampleSelective(CustomerType record, CustomerTypeExample example);

    int updateByExample(CustomerType record, CustomerTypeExample example);

    int updateByPrimaryKeySelective(CustomerType record);

    int updateByPrimaryKey(CustomerType record);

    int updateBatch(List<CustomerType> list);

    int batchInsert(List<CustomerType> list);

    IPage<CustomerType> selectPageByQuery(CustomerTypeQuery query);

    int insert(CustomerTypeVo customerTypeVo);

    int updateByPrimaryKeySelective(CustomerTypeVo customerTypeVo);

    int deleteByIdIn(Collection<Long> list);

    List<CustomerType> selectAllByIdIn(Collection<Long> idCollection);
}

