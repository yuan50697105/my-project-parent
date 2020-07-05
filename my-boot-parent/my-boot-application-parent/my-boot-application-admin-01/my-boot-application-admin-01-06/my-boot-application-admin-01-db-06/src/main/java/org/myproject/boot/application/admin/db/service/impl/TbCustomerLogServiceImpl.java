package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLog;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLogQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbCustomerLogMapper;
import org.myproject.boot.application.admin.db.service.TbCustomerLogService;

import java.util.List;

@Service
public class TbCustomerLogServiceImpl implements TbCustomerLogService{

    @Resource
    private TbCustomerLogMapper tbCustomerLogMapper;

    @Override
    public PageInfo<TbCustomerLog> selectByQueryWithPage(int page, int size, TbCustomerLogQuery query) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(tbCustomerLogMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<TbCustomerLog> selectByQuery(TbCustomerLogQuery query) {
        return tbCustomerLogMapper.selectByExample(query.toExample());
    }
}
