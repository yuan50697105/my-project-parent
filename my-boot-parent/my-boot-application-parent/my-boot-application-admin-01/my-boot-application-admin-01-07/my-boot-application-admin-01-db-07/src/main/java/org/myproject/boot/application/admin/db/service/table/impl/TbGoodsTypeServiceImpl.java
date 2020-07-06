package org.myproject.boot.application.admin.db.service.table.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.mapper.TbGoodsTypeMapper;
import org.myproject.boot.application.admin.db.service.table.TbGoodsTypeService;

import java.util.List;

@Service
public class TbGoodsTypeServiceImpl extends ServiceImpl<TbGoodsTypeMapper, TbGoodsType> implements TbGoodsTypeService{

    @Override
    public PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int size) {
        PageHelper.startPage(page,size);
        return new PageInfo<>(baseMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }
}
