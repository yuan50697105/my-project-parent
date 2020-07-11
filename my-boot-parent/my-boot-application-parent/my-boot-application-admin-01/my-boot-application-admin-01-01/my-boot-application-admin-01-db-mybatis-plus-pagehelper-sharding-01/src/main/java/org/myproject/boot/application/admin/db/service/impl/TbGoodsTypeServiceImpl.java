package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbGoodsTypeMapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.admin.db.service.TbGoodsTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbGoodsTypeServiceImpl extends ServiceImpl<TbGoodsTypeMapper, TbGoodsType> implements TbGoodsTypeService {

    @Override
    public long countByExample(TbGoodsTypeExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbGoodsTypeExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbGoodsType> selectByExample(TbGoodsTypeExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbGoodsType record, TbGoodsTypeExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbGoodsType record, TbGoodsTypeExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery goodsTypeQuery, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(selectByExample(goodsTypeQuery.toExample()));
    }

    @Override
    public List<TbGoodsType> selectByQuery(TbGoodsTypeQuery goodsTypeQuery) {
        return selectByExample(goodsTypeQuery.toExample());
    }
}
