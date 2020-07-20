package org.myproject.cloud.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.cloud.application.admin.db.mapper.TbOrderInfoMapper;
import org.myproject.cloud.application.admin.db.pojo.TbOrderInfo;
import org.myproject.cloud.application.admin.db.pojo.TbOrderInfoExample;
import org.myproject.cloud.application.admin.db.pojo.TbOrderInfoQuery;
import org.myproject.cloud.application.admin.db.service.TbOrderInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbOrderInfoServiceImpl implements TbOrderInfoService {

    @Resource
    private TbOrderInfoMapper tbOrderInfoMapper;

    @Override
    public long countByExample(TbOrderInfoExample example) {
        return tbOrderInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbOrderInfoExample example) {
        return tbOrderInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbOrderInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbOrderInfo record) {
        return tbOrderInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(TbOrderInfo record) {
        return tbOrderInfoMapper.insertSelective(record);
    }

    @Override
    public List<TbOrderInfo> selectByExample(TbOrderInfoExample example) {
        return tbOrderInfoMapper.selectByExample(example);
    }

    @Override
    public TbOrderInfo selectByPrimaryKey(Long id) {
        return tbOrderInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbOrderInfo record, TbOrderInfoExample example) {
        return tbOrderInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbOrderInfo record, TbOrderInfoExample example) {
        return tbOrderInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbOrderInfo record) {
        return tbOrderInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbOrderInfo record) {
        return tbOrderInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<TbOrderInfo> selectByExample(TbOrderInfoExample example, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<>(tbOrderInfoMapper.selectByExample(example));
    }

    @Override
    public List<TbOrderInfo> selectByQuery(TbOrderInfoQuery query) {
        return selectByExample(query.toExample());
    }

    @Override
    public PageInfo<TbOrderInfo> selectByQuery(TbOrderInfoQuery query, int page, int pageSize) {
        return selectByExample(query.toExample(), page, pageSize);
    }
}
