package org.myproject.boot.application.admin.db.service.base.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbGoodsInfoMapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.service.base.TbGoodsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbGoodsInfoServiceImpl implements TbGoodsInfoService {

    @Resource
    private TbGoodsInfoMapper tbGoodsInfoMapper;

    @Override
    public long countByExample(TbGoodsInfoExample example) {
        return tbGoodsInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbGoodsInfoExample example) {
        return tbGoodsInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbGoodsInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbGoodsInfo record) {
        return tbGoodsInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(TbGoodsInfo record) {
        return tbGoodsInfoMapper.insertSelective(record);
    }

    @Override
    public List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example) {
        return tbGoodsInfoMapper.selectByExample(example);
    }

    @Override
    public TbGoodsInfo selectByPrimaryKey(Long id) {
        return tbGoodsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbGoodsInfo record, TbGoodsInfoExample example) {
        return tbGoodsInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbGoodsInfo record, TbGoodsInfoExample example) {
        return tbGoodsInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbGoodsInfo record) {
        return tbGoodsInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbGoodsInfo record) {
        return tbGoodsInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(selectByExample(query.toExample()));
    }

    @Override
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query) {
        return selectByExample(query.toExample());
    }

}

