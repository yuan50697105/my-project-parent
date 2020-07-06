package org.myproject.boot.application.admin.db.service.table.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbGoodsInfoMapper;
import org.myproject.boot.application.admin.db.service.table.TbGoodsInfoService;

import java.util.List;

@Service
public class TbGoodsInfoServiceImpl implements TbGoodsInfoService{

    @Resource
    private TbGoodsInfoMapper tbGoodsInfoMapper;

    @Override
    public PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(tbGoodsInfoMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query) {
        return tbGoodsInfoMapper.selectByExample(query.toExample());
    }

    @Override
    public TbGoodsInfo selectById(Long id) {
        return tbGoodsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insert(TbGoodsInfo convert) {
        tbGoodsInfoMapper.insert(convert);
    }

    @Override
    public void updateSelective(TbGoodsInfo convert) {
        tbGoodsInfoMapper.updateByPrimaryKeySelective(convert);
    }

    @Override
    public void deleteByExample(Object o) {
        tbGoodsInfoMapper.deleteByExample(o);
    }

    @Override
    public void deleteById(Long id) {
        tbGoodsInfoMapper.deleteByPrimaryKey(id);
    }
}
