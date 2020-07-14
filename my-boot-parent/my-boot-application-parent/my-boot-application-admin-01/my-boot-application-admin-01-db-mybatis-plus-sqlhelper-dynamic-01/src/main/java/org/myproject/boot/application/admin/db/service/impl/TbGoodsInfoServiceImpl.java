package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbGoodsInfoMapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.service.TbGoodsInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbGoodsInfoServiceImpl extends ServiceImpl<TbGoodsInfoMapper, TbGoodsInfo> implements TbGoodsInfoService {

    @Override
    public long countByExample(TbGoodsInfoExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbGoodsInfoExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbGoodsInfo record, TbGoodsInfoExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbGoodsInfo record, TbGoodsInfoExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(selectByExample(goodsInfoQuery.toExample()));
    }

    @Override
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery) {
        return selectByExample(goodsInfoQuery.toExample());
    }
}
