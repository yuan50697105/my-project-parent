package org.myproject.boot.application.goods.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.goods.db.mapper.TbGoodsTypeMapper;
import org.myproject.boot.application.goods.db.pojo.TbGoodsType;
import org.myproject.boot.application.goods.db.pojo.TbGoodsTypeExample;
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
    public long countByExample(TbGoodsTypeExample example) {
        return tbGoodsTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbGoodsTypeExample example) {
        return tbGoodsTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbGoodsTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbGoodsType record) {
        return tbGoodsTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(TbGoodsType record) {
        return tbGoodsTypeMapper.insertSelective(record);
    }

    @Override
    public List<TbGoodsType> selectByExample(TbGoodsTypeExample example) {
        return tbGoodsTypeMapper.selectByExample(example);
    }

    @Override
    public TbGoodsType selectByPrimaryKey(Long id) {
        return tbGoodsTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbGoodsType record, TbGoodsTypeExample example) {
        return tbGoodsTypeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbGoodsType record, TbGoodsTypeExample example) {
        return tbGoodsTypeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbGoodsType record) {
        return tbGoodsTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbGoodsType record) {
        return tbGoodsTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query) {
        return null;
    }

    @Override
    public PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(selectByQuery(query));
    }

}