package org.myproject.app.db.bill.service;

import org.myproject.app.db.bill.pojo.BillItem;
import org.myproject.app.db.bill.pojo.BillItemExample;

import java.util.List;

public interface BillItemService {


    long countByExample(BillItemExample example);

    int deleteByExample(BillItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillItem record);

    int insertOrUpdate(BillItem record);

    int insertOrUpdateSelective(BillItem record);

    int insertSelective(BillItem record);

    List<BillItem> selectByExample(BillItemExample example);

    BillItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(BillItem record, BillItemExample example);

    int updateByExample(BillItem record, BillItemExample example);

    int updateByPrimaryKeySelective(BillItem record);

    int updateByPrimaryKey(BillItem record);

    List<BillItem> selectAllByBillId(Long billId);

    int updateBatch(List<BillItem> list);

    int updateBatchSelective(List<BillItem> list);

    int batchInsert(List<BillItem> list);

}
