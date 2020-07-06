package org.myproject.boot.application.admin.db.service.table.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbGoodsTypeMapper;
import org.myproject.boot.application.admin.db.service.table.TbGoodsTypeService;

import java.util.List;

@Service
public class TbGoodsTypeServiceImpl implements TbGoodsTypeService {

    @Resource
    private TbGoodsTypeMapper tbGoodsTypeMapper;

    @Override
    public PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(tbGoodsTypeMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query) {
        return tbGoodsTypeMapper.selectByExample(query.toExample());
    }

    @Override
    public void insert(TbGoodsType convert) {
        tbGoodsTypeMapper.insert(convert);
    }

    @Override
    public void updateSelective(TbGoodsType convert) {
        tbGoodsTypeMapper.updateByPrimaryKeySelective(convert);
    }

    @Override
    public void deleteByExample(Object example) {
        tbGoodsTypeMapper.deleteByExample(example);
    }

    @Override
    public void deleteById(Long id) {
        tbGoodsTypeMapper.deleteByPrimaryKey(id);
    }
}


