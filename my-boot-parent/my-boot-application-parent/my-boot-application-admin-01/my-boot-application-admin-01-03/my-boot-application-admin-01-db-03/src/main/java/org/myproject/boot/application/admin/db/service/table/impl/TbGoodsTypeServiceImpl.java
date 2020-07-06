package org.myproject.boot.application.admin.db.service.table.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.mapper.TbGoodsTypeMapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeExample;
import org.myproject.boot.application.admin.db.service.table.TbGoodsTypeService;
@Service
public class TbGoodsTypeServiceImpl extends ServiceImpl<TbGoodsTypeMapper, TbGoodsType> implements TbGoodsTypeService{

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
    public int updateByExampleSelective(TbGoodsType record,TbGoodsTypeExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(TbGoodsType record,TbGoodsTypeExample example) {
        return baseMapper.updateByExample(record,example);
    }

    @Override
    public PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(baseMapper.selectByExample(query.toExample()));
    }

    @Override
    public PageInfo<TbGoodsType> selectByExample(TbGoodsTypeExample example, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(baseMapper.selectByExample(example));
    }

    @Override
    public List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query) {
        return selectByExample(query.toExample());
    }

}
