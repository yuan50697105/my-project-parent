package org.myproject.app.db.bill.service.impl;

import org.myproject.app.db.bill.mapper.BillDeviceInfoMapper;
import org.myproject.app.db.bill.pojo.BillDeviceInfo;
import org.myproject.app.db.bill.pojo.BillDeviceInfoExample;
import org.myproject.app.db.bill.service.BillDeviceInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BillDeviceInfoServiceImpl implements BillDeviceInfoService {

    @Resource
    private BillDeviceInfoMapper billDeviceInfoMapper;

    @Override
    public long countByExample(BillDeviceInfoExample example) {
        return billDeviceInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BillDeviceInfoExample example) {
        return billDeviceInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return billDeviceInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BillDeviceInfo record) {
        return billDeviceInfoMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(BillDeviceInfo record) {
        return billDeviceInfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BillDeviceInfo record) {
        return billDeviceInfoMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(BillDeviceInfo record) {
        return billDeviceInfoMapper.insertSelective(record);
    }

    @Override
    public List<BillDeviceInfo> selectByExample(BillDeviceInfoExample example) {
        return billDeviceInfoMapper.selectByExample(example);
    }

    @Override
    public BillDeviceInfo selectByPrimaryKey(Long id) {
        return billDeviceInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(BillDeviceInfo record, BillDeviceInfoExample example) {
        return billDeviceInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(BillDeviceInfo record, BillDeviceInfoExample example) {
        return billDeviceInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(BillDeviceInfo record) {
        return billDeviceInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BillDeviceInfo record) {
        return billDeviceInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<BillDeviceInfo> list) {
        return billDeviceInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<BillDeviceInfo> list) {
        return billDeviceInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<BillDeviceInfo> list) {
        return billDeviceInfoMapper.batchInsert(list);
    }

    @Override
    public BillDeviceInfo selectOneByBillId(Long billId) {
        return billDeviceInfoMapper.selectOneByBillId(billId);
    }
}

