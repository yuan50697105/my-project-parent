package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbOrderItemMapper;
import org.myproject.boot.application.admin.db.pojo.TbOrderItem;
import org.myproject.boot.application.admin.db.pojo.TbOrderItemExample;
import org.myproject.boot.application.admin.db.service.TbOrderItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbOrderItemServiceImpl extends ServiceImpl<TbOrderItemMapper, TbOrderItem> implements TbOrderItemService {

    @Override
    public long countByExample(TbOrderItemExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbOrderItemExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbOrderItem> selectByExample(TbOrderItemExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbOrderItem record, TbOrderItemExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbOrderItem record, TbOrderItemExample example) {
        return baseMapper.updateByExample(record, example);
    }
}
