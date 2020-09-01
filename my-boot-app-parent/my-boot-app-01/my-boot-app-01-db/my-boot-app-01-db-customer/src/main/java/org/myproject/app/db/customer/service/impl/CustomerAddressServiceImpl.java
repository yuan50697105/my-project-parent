package org.myproject.app.db.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.db.commons.pojo.IPage;
import org.myproject.app.db.customer.mapper.CustomerAddressMapper;
import org.myproject.app.db.customer.pojo.*;
import org.myproject.app.db.customer.service.CustomerAddressService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class CustomerAddressServiceImpl implements CustomerAddressService {

    @Resource
    private CustomerAddressMapper customerAddressMapper;

    @Override
    public long countByExample(CustomerAddressExample example) {
        return customerAddressMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CustomerAddressExample example) {
        return customerAddressMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return customerAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CustomerAddress record) {
        return customerAddressMapper.insert(record);
    }

    @Override
    public int insert(CustomerAddressVo record) {

        return insert(record);
    }

    @Override
    public int insertOrUpdate(CustomerAddress record) {
        return customerAddressMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CustomerAddress record) {
        return customerAddressMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CustomerAddress record) {
        return customerAddressMapper.insertSelective(record);
    }

    @Override
    public List<CustomerAddress> selectByExample(CustomerAddressExample example) {
        return customerAddressMapper.selectByExample(example);
    }

    @Override
    public CustomerAddress selectByPrimaryKey(Long id) {
        return customerAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(CustomerAddress record, CustomerAddressExample example) {
        return customerAddressMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(CustomerAddress record, CustomerAddressExample example) {
        return customerAddressMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerAddress record) {
        return customerAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerAddressVo record) {
        return updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerAddress record) {
        return customerAddressMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerAddress> list) {
        return customerAddressMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CustomerAddress> list) {
        return customerAddressMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CustomerAddress> list) {
        return customerAddressMapper.batchInsert(list);
    }

    @Override
    public int deleteByIdIn(Collection<Long> idCollection) {
        return customerAddressMapper.deleteByIdIn(idCollection);
    }

    @Override
    public int deleteByIdAndCustomerIdIn(Long id, Collection<Long> customerIdCollection) {
        return customerAddressMapper.deleteByIdAndCustomerIdIn(id, customerIdCollection);
    }

    @Override
    public IPage<CustomerAddress> selectPageByQuery(CustomerAddressQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new IPageInfo<>(PageInfo.of(selectByExample(query.toExample())));
    }

}

