package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbCustomerInfoMapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.myproject.boot.application.admin.db.service.TbCustomerInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbCustomerInfoServiceImpl extends ServiceImpl<TbCustomerInfoMapper, TbCustomerInfo> implements TbCustomerInfoService {

    @Override
    public long countByExample(TbCustomerInfoExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbCustomerInfoExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbCustomerInfo> selectByExample(TbCustomerInfoExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbCustomerInfo record, TbCustomerInfoExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbCustomerInfo record, TbCustomerInfoExample example) {
        return baseMapper.updateByExample(record, example);
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

