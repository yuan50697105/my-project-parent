package org.myproject.app.member.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.commons.pojo.IPage;
import org.myproject.app.member.mapper.CustomerInfoMapper;
import org.myproject.app.member.service.CustomerInfoService;
import org.myproject.app.member.service.CustomerPojoConverter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class CustomerInfoServiceImpl implements CustomerInfoService {

    @Resource
    private CustomerInfoMapper customerInfoMapper;
    @Resource
    private CustomerPojoConverter converter;

    @Override
    public long countByExample(org.myproject.app.member.pojo.CustomerInfoExample example) {
        return customerInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(org.myproject.app.member.pojo.CustomerInfoExample example) {
        return customerInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return customerInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(org.myproject.app.member.pojo.CustomerInfo record) {
        return customerInfoMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(org.myproject.app.member.pojo.CustomerInfo record) {
        return customerInfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(org.myproject.app.member.pojo.CustomerInfo record) {
        return customerInfoMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(org.myproject.app.member.pojo.CustomerInfo record) {
        return customerInfoMapper.insertSelective(record);
    }

    @Override
    public List<org.myproject.app.member.pojo.CustomerInfo> selectByExample(org.myproject.app.member.pojo.CustomerInfoExample example) {
        return customerInfoMapper.selectByExample(example);
    }

    @Override
    public org.myproject.app.member.pojo.CustomerInfo selectByPrimaryKey(Long id) {
        return customerInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(org.myproject.app.member.pojo.CustomerInfo record, org.myproject.app.member.pojo.CustomerInfoExample example) {
        return customerInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(org.myproject.app.member.pojo.CustomerInfo record, org.myproject.app.member.pojo.CustomerInfoExample example) {
        return customerInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(org.myproject.app.member.pojo.CustomerInfo record) {
        return customerInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(org.myproject.app.member.pojo.CustomerInfo record) {
        return customerInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<org.myproject.app.member.pojo.CustomerInfo> list) {
        return customerInfoMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<org.myproject.app.member.pojo.CustomerInfo> list) {
        return customerInfoMapper.batchInsert(list);
    }

    @Override
    public IPage<org.myproject.app.member.pojo.CustomerInfo> selectPageByQuery(CustomerInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new org.myproject.app.member.pojo.IPageInfo<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public int updateByPrimaryKeySelective(org.myproject.app.member.pojo.CustomerInfoVo customerInfoVo) {
        return updateByPrimaryKeySelective(converter.convert(customerInfoVo));
    }

    @Override
    public int deleteByIdIn(List<Long> asList) {
        return customerInfoMapper.deleteByIdIn(asList);
    }

    @Override
    public int insert(org.myproject.app.member.pojo.CustomerInfoVo customerInfoVo) {
        return insert(converter.convert(customerInfoVo));
    }


    @Override
    public List<org.myproject.app.member.pojo.CustomerInfo> selectAllByIdIn(Collection<Long> idCollection) {
        return customerInfoMapper.selectAllByIdIn(idCollection);
    }
}

