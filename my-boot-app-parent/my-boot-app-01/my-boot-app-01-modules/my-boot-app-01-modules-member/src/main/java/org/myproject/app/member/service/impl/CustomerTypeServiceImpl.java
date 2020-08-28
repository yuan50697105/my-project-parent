package org.myproject.app.member.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.commons.pojo.IPage;
import org.myproject.app.member.mapper.CustomerTypeMapper;
import org.myproject.app.member.service.CustomerPojoConverter;
import org.myproject.app.member.service.CustomerTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class CustomerTypeServiceImpl implements CustomerTypeService {

    @Resource
    private CustomerTypeMapper customerTypeMapper;
    @Resource
    private CustomerPojoConverter converter;

    @Override
    public long countByExample(org.myproject.app.member.pojo.CustomerTypeExample example) {
        return customerTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(org.myproject.app.member.pojo.CustomerTypeExample example) {
        return customerTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return customerTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(org.myproject.app.member.pojo.CustomerType record) {
        return customerTypeMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(org.myproject.app.member.pojo.CustomerType record) {
        return customerTypeMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(org.myproject.app.member.pojo.CustomerType record) {
        return customerTypeMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(org.myproject.app.member.pojo.CustomerType record) {
        return customerTypeMapper.insertSelective(record);
    }

    @Override
    public List<org.myproject.app.member.pojo.CustomerType> selectByExample(org.myproject.app.member.pojo.CustomerTypeExample example) {
        return customerTypeMapper.selectByExample(example);
    }

    @Override
    public org.myproject.app.member.pojo.CustomerType selectByPrimaryKey(Long id) {
        return customerTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(org.myproject.app.member.pojo.CustomerType record, org.myproject.app.member.pojo.CustomerTypeExample example) {
        return customerTypeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(org.myproject.app.member.pojo.CustomerType record, CustomerTypeExample example) {
        return customerTypeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(org.myproject.app.member.pojo.CustomerType record) {
        return customerTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(org.myproject.app.member.pojo.CustomerType record) {
        return customerTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<org.myproject.app.member.pojo.CustomerType> list) {
        return customerTypeMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<org.myproject.app.member.pojo.CustomerType> list) {
        return customerTypeMapper.batchInsert(list);
    }

    @Override
    public int deleteByIdIn(Collection<Long> idCollection) {
        return customerTypeMapper.deleteByIdIn(idCollection);
    }

    @Override
    public List<org.myproject.app.member.pojo.CustomerType> selectAllByIdIn(Collection<Long> idCollection) {
        return customerTypeMapper.selectAllByIdIn(idCollection);
    }

    @Override
    public IPage<org.myproject.app.member.pojo.CustomerType> selectPageByQuery(org.myproject.app.member.pojo.CustomerTypeQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new org.myproject.app.member.pojo.IPageInfo<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public int insert(org.myproject.app.member.pojo.CustomerTypeVo customerTypeVo) {
        return insert(converter.convert(customerTypeVo));
    }

    @Override
    public int updateByPrimaryKeySelective(org.myproject.app.member.pojo.CustomerTypeVo customerTypeVo) {
        return updateByPrimaryKeySelective(converter.convert(customerTypeVo));
    }
}

