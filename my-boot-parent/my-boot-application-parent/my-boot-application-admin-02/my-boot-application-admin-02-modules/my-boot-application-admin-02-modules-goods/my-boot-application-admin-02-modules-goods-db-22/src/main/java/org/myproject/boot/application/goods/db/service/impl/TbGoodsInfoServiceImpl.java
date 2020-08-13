package org.myproject.boot.application.goods.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoQuery;
import org.springframework.stereotype.Service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoExample;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.goods.db.mapper.TbGoodsInfoMapper;
import org.myproject.boot.application.goods.db.service.TbGoodsInfoService;

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
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery) {
        return baseMapper.selectByExample(goodsInfoQuery.toExample());
    }

    @Override
    public PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery, int page, int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(baseMapper.selectByExample(goodsInfoQuery.toExample()));
    }
}
