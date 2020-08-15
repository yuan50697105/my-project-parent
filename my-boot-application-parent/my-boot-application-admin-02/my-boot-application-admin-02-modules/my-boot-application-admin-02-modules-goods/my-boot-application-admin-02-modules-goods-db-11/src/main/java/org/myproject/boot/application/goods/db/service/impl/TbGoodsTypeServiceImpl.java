package org.myproject.boot.application.goods.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.goods.db.mapper.TbGoodsTypeMapper;
import org.myproject.boot.application.goods.db.pojo.TbGoodsType;
import org.myproject.boot.application.goods.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.goods.db.service.TbGoodsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbGoodsTypeServiceImpl implements TbGoodsTypeService {

    @Resource
    private TbGoodsTypeMapper tbGoodsTypeMapper;

    @Override
    public TbGoodsType selectByPrimaryKey(Long id) {
        return tbGoodsTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(TbGoodsType tbGoodsType) {
        tbGoodsTypeMapper.updateByPrimaryKeySelective(tbGoodsType);
    }

    @Override
    public void insert(TbGoodsType tbGoodsType) {
        tbGoodsTypeMapper.insert(tbGoodsType);
    }

    @Override
    public void deleteByPrimaryKey(Long id) {
        tbGoodsTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query) {
        return tbGoodsTypeMapper.selectByExample(query.toExample());
    }

    @Override
    public PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(selectByQuery(query));
    }

}
