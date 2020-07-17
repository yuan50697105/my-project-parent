package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbOrderItemMapper;
import org.myproject.boot.application.admin.db.pojo.TbOrderItemExample;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbOrderItem;
import org.myproject.boot.application.admin.db.service.TbOrderItemService;
@Service
public class TbOrderItemServiceImpl implements TbOrderItemService{

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Override
    public long countByExample(TbOrderItemExample example) {
        return tbOrderItemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbOrderItemExample example) {
        return tbOrderItemMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbOrderItem record) {
        return tbOrderItemMapper.insert(record);
    }

    @Override
    public int insertSelective(TbOrderItem record) {
        return tbOrderItemMapper.insertSelective(record);
    }

    @Override
    public List<TbOrderItem> selectByExample(TbOrderItemExample example) {
        return tbOrderItemMapper.selectByExample(example);
    }

    @Override
    public TbOrderItem selectByPrimaryKey(Long id) {
        return tbOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbOrderItem record,TbOrderItemExample example) {
        return tbOrderItemMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbOrderItem record,TbOrderItemExample example) {
        return tbOrderItemMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbOrderItem record) {
        return tbOrderItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbOrderItem record) {
        return tbOrderItemMapper.updateByPrimaryKey(record);
    }

}
