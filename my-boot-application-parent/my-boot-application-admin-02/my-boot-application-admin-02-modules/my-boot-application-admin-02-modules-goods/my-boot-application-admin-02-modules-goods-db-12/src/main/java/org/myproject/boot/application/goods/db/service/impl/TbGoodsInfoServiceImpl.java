package org.myproject.boot.application.goods.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.goods.db.mapper.TbGoodsInfoMapper;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.goods.db.service.TbGoodsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbGoodsInfoServiceImpl implements TbGoodsInfoService {

    @Resource
    private TbGoodsInfoMapper tbGoodsInfoMapper;

    @Override
    public void insert(TbGoodsInfo infoVo) {
        tbGoodsInfoMapper.insert(infoVo);
    }

    @Override
    public void deleteByPrimaryKey(Long id) {
        tbGoodsInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public TbGoodsInfo selectByPrimaryKey(Long id) {
        return tbGoodsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query) {
        return tbGoodsInfoMapper.selectByExample(query.toExample());
    }

    @Override
    public PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(selectByQuery(query));
    }

}
