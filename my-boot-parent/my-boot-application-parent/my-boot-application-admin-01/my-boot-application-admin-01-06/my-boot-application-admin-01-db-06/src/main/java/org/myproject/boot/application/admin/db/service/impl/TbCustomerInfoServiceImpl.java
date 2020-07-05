package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbCustomerInfoMapper;
import org.myproject.boot.application.admin.db.service.TbCustomerInfoService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TbCustomerInfoServiceImpl implements TbCustomerInfoService{

    @Resource
    private TbCustomerInfoMapper tbCustomerInfoMapper;

    @Override
    public PageInfo<TbCustomerInfo> selectByQueryWithPage(int page, int size, TbCustomerInfoQuery query) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(tbCustomerInfoMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query) {
        return tbCustomerInfoMapper.selectByExample(query.toExample());
    }

    @Override
    public int insert(TbCustomerInfo customerInfo) {
        return tbCustomerInfoMapper.insert(customerInfo);
    }

    @Override
    public int updateByPrimaryKeySelective(TbCustomerInfo customerInfo) {
        return tbCustomerInfoMapper.updateByPrimaryKeySelective(customerInfo);
    }

    @Override
    public int deleteByExample(Object example) {
        return tbCustomerInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbCustomerInfoMapper.deleteByPrimaryKey(id);
    }
}
