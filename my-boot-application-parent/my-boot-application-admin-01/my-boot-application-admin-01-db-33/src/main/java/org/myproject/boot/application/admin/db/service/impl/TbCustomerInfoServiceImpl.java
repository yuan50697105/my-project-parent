package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbCustomerInfoMapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.myproject.boot.application.admin.db.service.TbCustomerInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbCustomerInfoServiceImpl implements TbCustomerInfoService {

    @Resource
    private TbCustomerInfoMapper tbCustomerInfoMapper;

    @Override
    public PageInfo<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery customerInfoQuery, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(tbCustomerInfoMapper.selectByExample(customerInfoQuery.toExample()));
    }

    @Override
    public List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery customerInfoQuery) {
        return tbCustomerInfoMapper.selectByExample(customerInfoQuery.toExample());
    }

    @Override
    public TbCustomerInfo selectByPrimaryKey(Long id) {
        return tbCustomerInfoMapper.selectByPrimaryKey(id);
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
    public int deleteByPrimaryKey(Long id) {
        return tbCustomerInfoMapper.deleteByPrimaryKey(id);
    }

}

