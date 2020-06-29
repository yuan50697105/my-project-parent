package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbCustomerTypeMapper;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.service.TbCustomerTypeService;
@Service
public class TbCustomerTypeServiceImpl implements TbCustomerTypeService{

    @Resource
    private TbCustomerTypeMapper tbCustomerTypeMapper;

    @Override
    public long countByExample(TbCustomerTypeExample example) {
        return tbCustomerTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbCustomerTypeExample example) {
        return tbCustomerTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbCustomerTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbCustomerType record) {
        return tbCustomerTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(TbCustomerType record) {
        return tbCustomerTypeMapper.insertSelective(record);
    }

    @Override
    public List<TbCustomerType> selectByExample(TbCustomerTypeExample example) {
        return tbCustomerTypeMapper.selectByExample(example);
    }

    @Override
    public TbCustomerType selectByPrimaryKey(Long id) {
        return tbCustomerTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbCustomerType record,TbCustomerTypeExample example) {
        return tbCustomerTypeMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbCustomerType record,TbCustomerTypeExample example) {
        return tbCustomerTypeMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbCustomerType record) {
        return tbCustomerTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbCustomerType record) {
        return tbCustomerTypeMapper.updateByPrimaryKey(record);
    }

}
