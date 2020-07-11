package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbCustomerLogMapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLog;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLogExample;
import org.myproject.boot.application.admin.db.service.TbCustomerLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbCustomerLogServiceImpl extends ServiceImpl<TbCustomerLogMapper, TbCustomerLog> implements TbCustomerLogService {

    @Override
    public long countByExample(TbCustomerLogExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbCustomerLogExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbCustomerLog> selectByExample(TbCustomerLogExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbCustomerLog record, TbCustomerLogExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbCustomerLog record, TbCustomerLogExample example) {
        return baseMapper.updateByExample(record, example);
    }
}
