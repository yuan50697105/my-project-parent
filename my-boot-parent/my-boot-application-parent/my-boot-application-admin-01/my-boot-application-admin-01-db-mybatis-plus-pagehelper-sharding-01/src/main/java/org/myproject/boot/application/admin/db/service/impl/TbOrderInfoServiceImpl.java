package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbOrderInfoMapper;
import org.myproject.boot.application.admin.db.pojo.TbOrderInfo;
import org.myproject.boot.application.admin.db.pojo.TbOrderInfoExample;
import org.myproject.boot.application.admin.db.service.TbOrderInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbOrderInfoServiceImpl extends ServiceImpl<TbOrderInfoMapper, TbOrderInfo> implements TbOrderInfoService {

    @Override
    public long countByExample(TbOrderInfoExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbOrderInfoExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbOrderInfo> selectByExample(TbOrderInfoExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbOrderInfo record, TbOrderInfoExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbOrderInfo record, TbOrderInfoExample example) {
        return baseMapper.updateByExample(record, example);
    }
}
