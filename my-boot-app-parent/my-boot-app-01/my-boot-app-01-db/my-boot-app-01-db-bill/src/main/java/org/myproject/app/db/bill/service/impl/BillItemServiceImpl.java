package org.myproject.app.db.bill.service.impl;

import org.myproject.app.db.bill.mapper.BillItemMapper;
import org.myproject.app.db.bill.pojo.BillItem;
import org.myproject.app.db.bill.pojo.BillItemExample;
import org.myproject.app.db.bill.service.BillItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BillItemServiceImpl implements BillItemService {

    @Resource
    private BillItemMapper billItemMapper;

    @Override
    public long countByExample(BillItemExample example) {
        return billItemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BillItemExample example) {
        return billItemMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return billItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BillItem record) {
        return billItemMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(BillItem record) {
        return billItemMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BillItem record) {
        return billItemMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(BillItem record) {
        return billItemMapper.insertSelective(record);
    }

    @Override
    public List<BillItem> selectByExample(BillItemExample example) {
        return billItemMapper.selectByExample(example);
    }

    @Override
    public BillItem selectByPrimaryKey(Long id) {
        return billItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(BillItem record, BillItemExample example) {
        return billItemMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(BillItem record, BillItemExample example) {
        return billItemMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(BillItem record) {
        return billItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BillItem record) {
        return billItemMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<BillItem> selectAllByBillId(Long billId) {
        return billItemMapper.selectAllByBillId(billId);
    }

    @Override
    public int updateBatch(List<BillItem> list) {
        return billItemMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<BillItem> list) {
        return billItemMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<BillItem> list) {
        return billItemMapper.batchInsert(list);
    }

}
