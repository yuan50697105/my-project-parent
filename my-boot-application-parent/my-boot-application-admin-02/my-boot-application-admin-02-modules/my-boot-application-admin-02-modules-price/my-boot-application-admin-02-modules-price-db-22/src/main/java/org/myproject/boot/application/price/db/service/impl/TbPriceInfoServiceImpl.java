package org.myproject.boot.application.price.db.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoQuery;
import org.springframework.stereotype.Service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.price.db.pojo.TbPriceInfo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoExample;
import org.myproject.boot.application.price.db.mapper.TbPriceInfoMapper;
import org.myproject.boot.application.price.db.service.TbPriceInfoService;

@Service
public class TbPriceInfoServiceImpl extends ServiceImpl<TbPriceInfoMapper, TbPriceInfo> implements TbPriceInfoService {

    @Override
    public long countByExample(TbPriceInfoExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbPriceInfoExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbPriceInfo> selectByExample(TbPriceInfoExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbPriceInfo record, TbPriceInfoExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbPriceInfo record, TbPriceInfoExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public PageInfo<TbPriceInfo> selectByQuery(TbPriceInfoQuery priceInfoQuery, int page, int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(baseMapper.selectByExample(priceInfoQuery.toExample()));
    }

    @Override
    public IPage<TbPriceInfo> selectByQuery(TbPriceInfoQuery query, IPage<TbPriceInfo> iPage) {
        return lambdaQuery()
                .likeRight(ObjectUtil.isNotEmpty(query.getCode()), TbPriceInfo::getCode, query.getCode())
                .likeRight(ObjectUtil.isNotEmpty(query.getName()), TbPriceInfo::getName, query.getName())
                .page(iPage);
    }

}
