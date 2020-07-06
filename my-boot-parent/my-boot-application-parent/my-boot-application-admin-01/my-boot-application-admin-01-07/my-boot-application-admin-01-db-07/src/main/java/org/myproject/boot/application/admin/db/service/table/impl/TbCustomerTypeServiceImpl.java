package org.myproject.boot.application.admin.db.service.table.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbCustomerTypeMapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.service.table.TbCustomerTypeService;

import java.util.List;

@Service
public class TbCustomerTypeServiceImpl extends ServiceImpl<TbCustomerTypeMapper, TbCustomerType> implements TbCustomerTypeService{

    @Override
    public PageInfo<TbCustomerType> selectByQuery(TbCustomerTypeQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(baseMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<TbCustomerType> selectByQuery(TbCustomerTypeQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }
}
