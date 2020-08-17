package org.myproject.boot.application.price.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.price.db.mapper.TbPriceInfoMapper;
import org.myproject.boot.application.price.db.service.TbPriceInfoService;

@Service
public class TbPriceInfoServiceImpl implements TbPriceInfoService {

    @Resource
    private TbPriceInfoMapper tbPriceInfoMapper;

    @Override
    public TbPriceInfo selectByPrimaryKey(Long id) {
        return tbPriceInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<TbPriceInfo> selectByQuery(TbPriceInfoQuery priceInfoQuery, int page, int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(tbPriceInfoMapper.selectByExample(priceInfoQuery.toExample()));
    }

    @Override
    public int updateByPrimaryKeySelective(TbPriceInfo priceInfo) {
        return tbPriceInfoMapper.updateByPrimaryKeySelective(priceInfo);
    }

    @Override
    public int insert(TbPriceInfo priceInfo) {
        return tbPriceInfoMapper.insert(priceInfo);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbPriceInfoMapper.deleteByPrimaryKey(id);
    }
}

