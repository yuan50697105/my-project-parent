package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbGoodsInfoMapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.service.TbGoodsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbGoodsInfoServiceImpl implements TbGoodsInfoService {

    @Resource
    private TbGoodsInfoMapper tbGoodsInfoMapper;

    @Override
    public PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(tbGoodsInfoMapper.selectByExample(goodsInfoQuery.toExample()));
    }

    @Override
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery) {
        return tbGoodsInfoMapper.selectByExample(goodsInfoQuery.toExample());
    }

    @Override
    public TbGoodsInfo selectByPrimaryKey(Long id) {
        return tbGoodsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(TbGoodsInfo goodsInfo) {
        return tbGoodsInfoMapper.insert(goodsInfo);
    }

    @Override
    public int updateByPrimaryKeySelective(TbGoodsInfo goodsInfo) {
        return tbGoodsInfoMapper.updateByPrimaryKeySelective(goodsInfo);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbGoodsInfoMapper.deleteByPrimaryKey(id);
    }
}

