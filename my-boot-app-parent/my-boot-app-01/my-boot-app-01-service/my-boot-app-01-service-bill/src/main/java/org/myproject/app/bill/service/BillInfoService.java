package org.myproject.app.bill.service;

import org.myproject.app.bill.pojo.*;
import org.myproject.app.db.commons.pojo.IPage;

import java.util.Collection;
import java.util.List;

public interface BillInfoService {


    long countByExample(BillInfoExample example);

    int deleteByExample(BillInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillInfo record);

    int insertSelective(BillInfo record);

    List<BillInfo> selectByExample(BillInfoExample example);

    BillInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(BillInfo record, BillInfoExample example);

    int updateByExample(BillInfo record, BillInfoExample example);

    int updateByPrimaryKeySelective(BillInfo record);

    int updateByPrimaryKey(BillInfo record);

    BillInfo selectAllByIdOrBillNoOrTransactionNo(Long id, String billNo, String transactionNo);

    int deleteByIdIn(Collection<Long> idCollection);

    IPage<BillInfo> selectPageByQuery(BillInfoQuery query);

    int insert(BillInfoVo vo);

    int updateByPrimaryKeySelective(BillInfoVo vo);

    BillInfoDetailResult selectDetailById(Long id);
}


