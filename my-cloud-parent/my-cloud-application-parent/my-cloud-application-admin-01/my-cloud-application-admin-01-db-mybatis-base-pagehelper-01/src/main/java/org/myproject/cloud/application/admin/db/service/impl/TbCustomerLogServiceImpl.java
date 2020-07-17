package org.myproject.cloud.application.admin.db.service.impl;

import org.myproject.cloud.application.admin.db.mapper.TbCustomerLogMapper;
import org.myproject.cloud.application.admin.db.pojo.TbCustomerLog;
import org.myproject.cloud.application.admin.db.pojo.TbCustomerLogExample;
import org.myproject.cloud.application.admin.db.service.TbCustomerLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbCustomerLogServiceImpl implements TbCustomerLogService {

    @Resource
    private TbCustomerLogMapper tbCustomerLogMapper;

    @Override
    public long countByExample(TbCustomerLogExample example) {
        return tbCustomerLogMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbCustomerLogExample example) {
        return tbCustomerLogMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbCustomerLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbCustomerLog record) {
        return tbCustomerLogMapper.insert(record);
    }

    @Override
    public int insertSelective(TbCustomerLog record) {
        return tbCustomerLogMapper.insertSelective(record);
    }

    @Override
    public List<TbCustomerLog> selectByExample(TbCustomerLogExample example) {
        return tbCustomerLogMapper.selectByExample(example);
    }

    @Override
    public TbCustomerLog selectByPrimaryKey(Long id) {
        return tbCustomerLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbCustomerLog record, TbCustomerLogExample example) {
        return tbCustomerLogMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbCustomerLog record, TbCustomerLogExample example) {
        return tbCustomerLogMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbCustomerLog record) {
        return tbCustomerLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbCustomerLog record) {
        return tbCustomerLogMapper.updateByPrimaryKey(record);
    }

}

