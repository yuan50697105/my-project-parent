package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoExample;
import java.util.List;
import org.myproject.boot.application.admin.db.mapper.TbCustomerInfoMapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.service.TbCustomerInfoService;
@Service
public class TbCustomerInfoServiceImpl implements TbCustomerInfoService{

    @Resource
    private TbCustomerInfoMapper tbCustomerInfoMapper;

    @Override
    public long countByExample(TbCustomerInfoExample example) {
        return tbCustomerInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbCustomerInfoExample example) {
        return tbCustomerInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbCustomerInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbCustomerInfo record) {
        return tbCustomerInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(TbCustomerInfo record) {
        return tbCustomerInfoMapper.insertSelective(record);
    }

    @Override
    public List<TbCustomerInfo> selectByExample(TbCustomerInfoExample example) {
        return tbCustomerInfoMapper.selectByExample(example);
    }

    @Override
    public TbCustomerInfo selectByPrimaryKey(Long id) {
        return tbCustomerInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbCustomerInfo record,TbCustomerInfoExample example) {
        return tbCustomerInfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbCustomerInfo record,TbCustomerInfoExample example) {
        return tbCustomerInfoMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbCustomerInfo record) {
        return tbCustomerInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbCustomerInfo record) {
        return tbCustomerInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery customerInfoQuery, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(selectByExample(customerInfoQuery.toExample()));
    }

    @Override
    public List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery customerInfoQuery) {
        return selectByExample(customerInfoQuery.toExample());
    }

}
