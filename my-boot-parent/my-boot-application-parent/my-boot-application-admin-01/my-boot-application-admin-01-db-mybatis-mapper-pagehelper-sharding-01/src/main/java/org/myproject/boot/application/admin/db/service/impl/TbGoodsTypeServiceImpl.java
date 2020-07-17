package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbGoodsTypeMapper;
import org.myproject.boot.application.admin.db.service.TbGoodsTypeService;

import java.util.List;

@Service
public class TbGoodsTypeServiceImpl implements TbGoodsTypeService {

    @Resource
    private TbGoodsTypeMapper tbGoodsTypeMapper;

    @Override
    public PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery goodsTypeQuery, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(tbGoodsTypeMapper.selectByExample(goodsTypeQuery.toExample()));
    }

    @Override
    public List<TbGoodsType> selectByQuery(TbGoodsTypeQuery goodsTypeQuery) {
        return tbGoodsTypeMapper.selectByExample(goodsTypeQuery.toExample());
    }

    @Override
    public TbGoodsType selectByPrimaryKey(Long id) {
        return tbGoodsTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(TbGoodsType record) {
        return tbGoodsTypeMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TbGoodsType goodsType) {
        return tbGoodsTypeMapper.updateByPrimaryKeySelective(goodsType);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbGoodsTypeMapper.deleteByPrimaryKey(id);
    }
}

