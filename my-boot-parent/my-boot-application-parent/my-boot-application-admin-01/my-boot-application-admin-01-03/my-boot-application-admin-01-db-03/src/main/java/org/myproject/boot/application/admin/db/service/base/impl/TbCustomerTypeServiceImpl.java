package org.myproject.boot.application.admin.db.service.base.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbCustomerTypeMapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.service.base.TbCustomerTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbCustomerTypeServiceImpl extends ServiceImpl<TbCustomerTypeMapper, TbCustomerType> implements TbCustomerTypeService {

    @Override
    public long countByExample(TbCustomerTypeExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbCustomerTypeExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbCustomerType> selectByExample(TbCustomerTypeExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public List<TbCustomerType> selectByQuery(TbCustomerTypeQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }

    @Override
    public int updateByExampleSelective(TbCustomerType record, TbCustomerTypeExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbCustomerType record, TbCustomerTypeExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public PageInfo<TbCustomerType> selectByQuery(TbCustomerTypeQuery query, int page, int size) {
        return selectByExample(query.toExample(), page, size);
    }

    @Override
    public PageInfo<TbCustomerType> selectByExample(TbCustomerTypeExample example, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(baseMapper.selectByExample(example));
    }

}
