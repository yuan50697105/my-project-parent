package org.myproject.boot.application.admin.db.service.table.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbCustomerInfoMapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.service.table.TbCustomerInfoService;

import java.util.List;

@Service
public class TbCustomerInfoServiceImpl extends ServiceImpl<TbCustomerInfoMapper, TbCustomerInfo> implements TbCustomerInfoService{

    @Override
    public PageInfo<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(baseMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }
}
