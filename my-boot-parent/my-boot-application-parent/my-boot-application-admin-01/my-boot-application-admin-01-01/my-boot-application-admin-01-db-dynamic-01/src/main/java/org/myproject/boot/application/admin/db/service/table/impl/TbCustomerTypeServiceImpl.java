package org.myproject.boot.application.admin.db.service.table.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbCustomerTypeMapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.service.table.TbCustomerTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbCustomerTypeServiceImpl implements TbCustomerTypeService {

    @Resource
    private TbCustomerTypeMapper tbCustomerTypeMapper;

    @Override
    public long countByExample(TbCustomerTypeExample example) {
        return tbCustomerTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbCustomerTypeExample example) {
        return tbCustomerTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbCustomerTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbCustomerType record) {
        return tbCustomerTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(TbCustomerType record) {
        return tbCustomerTypeMapper.insertSelective(record);
    }

    @Override
    public List<TbCustomerType> selectByExample(TbCustomerTypeExample example) {
        return tbCustomerTypeMapper.selectByExample(example);
    }

    @Override
    public TbCustomerType selectByPrimaryKey(Long id) {
        return tbCustomerTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbCustomerType record, TbCustomerTypeExample example) {
        return tbCustomerTypeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbCustomerType record, TbCustomerTypeExample example) {
        return tbCustomerTypeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbCustomerType record) {
        return tbCustomerTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbCustomerType record) {
        return tbCustomerTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<TbCustomerType> selectByQuery(TbCustomerTypeQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(selectByExample(query.toExample()));
    }

    @Override
    public List<TbCustomerType> selectByQuery(TbCustomerTypeQuery query) {
        return selectByExample(query.toExample());
    }

}
