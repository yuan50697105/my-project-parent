package org.myproject.app.db.bill.service;

import org.myproject.app.db.bill.pojo.BillDeviceInfo;
import org.myproject.app.db.bill.pojo.BillDeviceInfoExample;

import java.util.List;

public interface BillDeviceInfoService {


    long countByExample(BillDeviceInfoExample example);

    int deleteByExample(BillDeviceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillDeviceInfo record);

    int insertOrUpdate(BillDeviceInfo record);

    int insertOrUpdateSelective(BillDeviceInfo record);

    int insertSelective(BillDeviceInfo record);

    List<BillDeviceInfo> selectByExample(BillDeviceInfoExample example);

    BillDeviceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(BillDeviceInfo record, BillDeviceInfoExample example);

    int updateByExample(BillDeviceInfo record, BillDeviceInfoExample example);

    int updateByPrimaryKeySelective(BillDeviceInfo record);

    int updateByPrimaryKey(BillDeviceInfo record);

    int updateBatch(List<BillDeviceInfo> list);

    int updateBatchSelective(List<BillDeviceInfo> list);

    int batchInsert(List<BillDeviceInfo> list);

    BillDeviceInfo selectOneByBillId(Long billId);
}

