package org.myproject.app.bill.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.bill.pojo.BillDeviceInfo;
import org.myproject.app.bill.pojo.BillDeviceInfoExample;

import java.util.List;

@Mapper
public interface BillDeviceInfoMapper {
    long countByExample(BillDeviceInfoExample example);

    int deleteByExample(BillDeviceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillDeviceInfo record);

    int insertOrUpdate(BillDeviceInfo record);

    int insertOrUpdateSelective(BillDeviceInfo record);

    int insertSelective(BillDeviceInfo record);

    List<BillDeviceInfo> selectByExample(BillDeviceInfoExample example);

    BillDeviceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillDeviceInfo record, @Param("example") BillDeviceInfoExample example);

    int updateByExample(@Param("record") BillDeviceInfo record, @Param("example") BillDeviceInfoExample example);

    int updateByPrimaryKeySelective(BillDeviceInfo record);

    int updateByPrimaryKey(BillDeviceInfo record);

    BillDeviceInfo selectOneByBillId(@Param("billId") Long billId);

    int updateBatch(List<BillDeviceInfo> list);

    int updateBatchSelective(List<BillDeviceInfo> list);

    int batchInsert(@Param("list") List<BillDeviceInfo> list);
}