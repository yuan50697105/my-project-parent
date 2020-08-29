package org.myproject.app.bill.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.bill.pojo.BillItem;
import org.myproject.app.bill.pojo.BillItemExample;

import java.util.List;

@Mapper
public interface BillItemMapper {
    long countByExample(BillItemExample example);

    int deleteByExample(BillItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillItem record);

    int insertOrUpdate(BillItem record);

    int insertOrUpdateSelective(BillItem record);

    int insertSelective(BillItem record);

    List<BillItem> selectByExample(BillItemExample example);

    BillItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillItem record, @Param("example") BillItemExample example);

    int updateByExample(@Param("record") BillItem record, @Param("example") BillItemExample example);

    int updateByPrimaryKeySelective(BillItem record);

    int updateByPrimaryKey(BillItem record);

    List<BillItem> selectAllByBillId(@Param("billId") Long billId);

    int updateBatch(List<BillItem> list);

    int updateBatchSelective(List<BillItem> list);

    int batchInsert(@Param("list") List<BillItem> list);
}