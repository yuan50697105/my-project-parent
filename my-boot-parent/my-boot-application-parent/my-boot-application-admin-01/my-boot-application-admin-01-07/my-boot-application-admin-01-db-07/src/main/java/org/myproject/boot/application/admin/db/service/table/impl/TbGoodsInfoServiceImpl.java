package org.myproject.boot.application.admin.db.service.table.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbGoodsInfoMapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.service.table.TbGoodsInfoService;

import java.util.List;

@Service
public class TbGoodsInfoServiceImpl extends ServiceImpl<TbGoodsInfoMapper, TbGoodsInfo> implements TbGoodsInfoService{

    @Override
    public PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(baseMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }
}
