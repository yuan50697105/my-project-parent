package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import org.myproject.boot.application.admin.db.pojo.TbOrderInfo;

import java.util.List;

import org.myproject.boot.application.admin.db.mapper.TbOrderInfoMapper;
import org.myproject.boot.application.admin.db.pojo.TbOrderInfoExample;
import org.myproject.boot.application.admin.db.service.TbOrderInfoService;

@Service
public class TbOrderInfoServiceImpl implements TbOrderInfoService {

    @Resource
    private TbOrderInfoMapper tbOrderInfoMapper;

    @Override
    public long countByExample(TbOrderInfoExample example) {
        return tbOrderInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbOrderInfoExample example) {
        return tbOrderInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbOrderInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbOrderInfo record) {
        return tbOrderInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(TbOrderInfo record) {
        return tbOrderInfoMapper.insertSelective(record);
    }

    @Override
    public List<TbOrderInfo> selectByExample(TbOrderInfoExample example) {
        return tbOrderInfoMapper.selectByExample(example);
    }

    @Override
    public TbOrderInfo selectByPrimaryKey(Long id) {
        return tbOrderInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbOrderInfo record, TbOrderInfoExample example) {
        return tbOrderInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbOrderInfo record, TbOrderInfoExample example) {
        return tbOrderInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbOrderInfo record) {
        return tbOrderInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbOrderInfo record) {
        return tbOrderInfoMapper.updateByPrimaryKey(record);
    }

}

