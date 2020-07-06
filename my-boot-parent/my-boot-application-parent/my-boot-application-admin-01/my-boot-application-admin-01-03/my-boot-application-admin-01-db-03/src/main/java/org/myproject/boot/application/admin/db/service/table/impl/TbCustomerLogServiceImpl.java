package org.myproject.boot.application.admin.db.service.table.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbCustomerLogMapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLog;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLogExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLogQuery;
import org.myproject.boot.application.admin.db.service.table.TbCustomerLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbCustomerLogServiceImpl extends ServiceImpl<TbCustomerLogMapper, TbCustomerLog> implements TbCustomerLogService {

    @Autowired
    private TbCustomerLogMapper tbCustomerLogMapper;

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

    @Override
    public PageInfo<TbCustomerLog> selectByQueryWithPage(int page, int size, TbCustomerLogQuery query) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(baseMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<TbCustomerLog> selectByQuery(TbCustomerLogQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }

    @Override
    public PageInfo<TbCustomerLog> selectByExampleWithPage(int page, int pageSize, TbCustomerLogExample example) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<>(tbCustomerLogMapper.selectByExample(example));
    }
}
