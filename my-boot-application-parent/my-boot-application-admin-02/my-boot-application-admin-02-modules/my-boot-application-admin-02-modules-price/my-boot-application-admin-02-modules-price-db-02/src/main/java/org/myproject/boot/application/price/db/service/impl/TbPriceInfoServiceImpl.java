package org.myproject.boot.application.price.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.price.db.pojo.TbPriceInfo;
import java.util.List;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoExample;
import org.myproject.boot.application.price.db.mapper.TbPriceInfoMapper;
import org.myproject.boot.application.price.db.service.TbPriceInfoService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TbPriceInfoServiceImpl implements TbPriceInfoService {

    @Resource
    private TbPriceInfoMapper tbPriceInfoMapper;

    @Override
    public long countByExample(TbPriceInfoExample example) {
        return tbPriceInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbPriceInfoExample example) {
        return tbPriceInfoMapper.deleteByExample(example);
    }

    @Override
    public int insert(TbPriceInfo record) {
        return tbPriceInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(TbPriceInfo record) {
        return tbPriceInfoMapper.insertSelective(record);
    }

    @Override
    public List<TbPriceInfo> selectByExample(TbPriceInfoExample example) {
        return tbPriceInfoMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbPriceInfo record, TbPriceInfoExample example) {
        return tbPriceInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbPriceInfo record, TbPriceInfoExample example) {
        return tbPriceInfoMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<TbPriceInfo> list) {
        return tbPriceInfoMapper.batchInsert(list);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbPriceInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public TbPriceInfo selectByPrimaryKey(Long id) {
        return tbPriceInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TbPriceInfo record) {
        return tbPriceInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbPriceInfo record) {
        return tbPriceInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<TbPriceInfo> list) {
        return tbPriceInfoMapper.updateBatch(list);
    }

    @Override
    public PageInfo<TbPriceInfo> selectByQuery(TbPriceInfoQuery query, int page, int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(tbPriceInfoMapper.selectByExample(query.toExample()));
    }
}

