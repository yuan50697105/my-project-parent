package org.myproject.app.bill.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.bill.pojo.BillInfo;
import org.myproject.app.bill.pojo.BillInfoExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface BillInfoMapper {
    long countByExample(BillInfoExample example);

    int deleteByExample(BillInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillInfo record);

    int insertSelective(BillInfo record);

    List<BillInfo> selectByExample(BillInfoExample example);

    BillInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillInfo record, @Param("example") BillInfoExample example);

    int updateByExample(@Param("record") BillInfo record, @Param("example") BillInfoExample example);

    int updateByPrimaryKeySelective(BillInfo record);

    int updateByPrimaryKey(BillInfo record);

    BillInfo selectAllByIdOrBillNoOrTransactionNo(@Param("id") Long id, @Param("billNo") String billNo, @Param("transactionNo") String transactionNo);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);
}