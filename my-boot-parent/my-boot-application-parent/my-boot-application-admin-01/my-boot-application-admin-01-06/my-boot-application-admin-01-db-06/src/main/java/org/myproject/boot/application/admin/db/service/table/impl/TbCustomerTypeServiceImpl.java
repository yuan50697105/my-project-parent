package org.myproject.boot.application.admin.db.service.table.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbCustomerTypeMapper;
import org.myproject.boot.application.admin.db.service.table.TbCustomerTypeService;

import java.util.List;

@Service
public class TbCustomerTypeServiceImpl implements TbCustomerTypeService{

    @Resource
    private TbCustomerTypeMapper tbCustomerTypeMapper;

    @Override
    public PageInfo<TbCustomerType> selectByQuery(TbCustomerTypeQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(tbCustomerTypeMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<TbCustomerType> selectByQuery(TbCustomerTypeQuery query) {
        return tbCustomerTypeMapper.selectByExample(query.toExample());
    }

    @Override
    public TbCustomerType selectById(Long id) {
        return tbCustomerTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insert(TbCustomerType convert) {
        tbCustomerTypeMapper.insert(convert);
    }

    @Override
    public void updateSelective(TbCustomerType convert) {
        tbCustomerTypeMapper.updateByPrimaryKeySelective(convert);
    }

    @Override
    public void deleteByExample(Object o) {
        tbCustomerTypeMapper.deleteByExample(o);
    }

    @Override
    public void deleteById(Long id) {
        tbCustomerTypeMapper.deleteByPrimaryKey(id);
    }
}
