package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbCustomerTypeMapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.service.TbCustomerTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbCustomerTypeServiceImpl implements TbCustomerTypeService {

    @Resource
    private TbCustomerTypeMapper tbCustomerTypeMapper;

    @Override
    public PageInfo<TbCustomerType> selectByQuery(TbCustomerTypeQuery customerTypeQuery, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(tbCustomerTypeMapper.selectByExample(customerTypeQuery.toExample()));
    }

    @Override
    public List<TbCustomerType> selectByQuery(TbCustomerTypeQuery customerTypeQuery) {
        return tbCustomerTypeMapper.selectByExample(customerTypeQuery.toExample());
    }

    @Override
    public TbCustomerType selectByPrimaryKey(Long id) {
        return tbCustomerTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(TbCustomerType record) {
        return tbCustomerTypeMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TbCustomerType record) {
        return tbCustomerTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbCustomerTypeMapper.deleteByPrimaryKey(id);
    }
}

