package org.myproject.app.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.commons.pojo.IPage;
import org.myproject.app.customer.mapper.CustomerTypeMapper;
import org.myproject.app.customer.pojo.*;
import org.myproject.app.customer.service.CustomerPojoConverter;
import org.myproject.app.customer.service.CustomerTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {

    @Resource
    private CustomerTypeMapper customerTypeMapper;
    @Resource
    private CustomerPojoConverter converter;

    @Override
    public long countByExample(CustomerTypeExample example) {
        return customerTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CustomerTypeExample example) {
        return customerTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return customerTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CustomerType record) {
        return customerTypeMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CustomerType record) {
        return customerTypeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CustomerType record) {
        return customerTypeMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CustomerType record) {
        return customerTypeMapper.insertSelective(record);
    }

    @Override
    public List<CustomerType> selectByExample(CustomerTypeExample example) {
        return customerTypeMapper.selectByExample(example);
    }

    @Override
    public CustomerType selectByPrimaryKey(Long id) {
        return customerTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(CustomerType record, CustomerTypeExample example) {
        return customerTypeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(CustomerType record, CustomerTypeExample example) {
        return customerTypeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerType record) {
        return customerTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerType record) {
        return customerTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerType> list) {
        return customerTypeMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerType> list) {
        return customerTypeMapper.batchInsert(list);
    }

    @Override
    public int deleteByIdIn(Collection<Long> idCollection) {
        return customerTypeMapper.deleteByIdIn(idCollection);
    }

    @Override
    public List<CustomerType> selectAllByIdIn(Collection<Long> idCollection) {
        return customerTypeMapper.selectAllByIdIn(idCollection);
    }

    @Override
    public IPage<CustomerType> selectPageByQuery(CustomerTypeQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new IPageInfo<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public int insert(CustomerTypeVo customerTypeVo) {
        return insert(converter.convert(customerTypeVo));
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerTypeVo customerTypeVo) {
        return updateByPrimaryKeySelective(converter.convert(customerTypeVo));
    }
}

