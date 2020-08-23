package org.myproject.app.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.commons.pojo.IPage;
import org.myproject.app.customer.mapper.CustomerInfoMapper;
import org.myproject.app.customer.pojo.*;
import org.myproject.app.customer.service.CustomerInfoService;
import org.myproject.app.customer.service.CustomerPojoConverter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {

    @Resource
    private CustomerInfoMapper customerInfoMapper;
    @Resource
    private CustomerPojoConverter converter;

    @Override
    public long countByExample(CustomerInfoExample example) {
        return customerInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CustomerInfoExample example) {
        return customerInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return customerInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CustomerInfo record) {
        return customerInfoMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(CustomerInfo record) {
        return customerInfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CustomerInfo record) {
        return customerInfoMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(CustomerInfo record) {
        return customerInfoMapper.insertSelective(record);
    }

    @Override
    public List<CustomerInfo> selectByExample(CustomerInfoExample example) {
        return customerInfoMapper.selectByExample(example);
    }

    @Override
    public CustomerInfo selectByPrimaryKey(Long id) {
        return customerInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(CustomerInfo record, CustomerInfoExample example) {
        return customerInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(CustomerInfo record, CustomerInfoExample example) {
        return customerInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerInfo record) {
        return customerInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerInfo record) {
        return customerInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerInfo> list) {
        return customerInfoMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<CustomerInfo> list) {
        return customerInfoMapper.batchInsert(list);
    }

    @Override
    public IPage<CustomerInfo> selectPageByQuery(CustomerInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new IPageInfo<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerInfoVo customerInfoVo) {
        return updateByPrimaryKeySelective(converter.convert(customerInfoVo));
    }

    @Override
    public int deleteByIdIn(List<Long> asList) {
        return customerInfoMapper.deleteByIdIn(asList);
    }

    @Override
    public int insert(CustomerInfoVo customerInfoVo) {
        return insert(converter.convert(customerInfoVo));
    }


    @Override
    public List<CustomerInfo> selectAllByIdIn(Collection<Long> idCollection) {
        return customerInfoMapper.selectAllByIdIn(idCollection);
    }
}

