package org.myproject.app.db.customer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.db.customer.pojo.CustomerInfo;
import org.myproject.app.db.customer.pojo.CustomerInfoExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface CustomerInfoMapper {
    long countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerInfo record);

    int insertOrUpdate(CustomerInfo record);

    int insertOrUpdateSelective(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    CustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);

    List<CustomerInfo> selectAllByIdIn(@Param("idCollection") Collection<Long> idCollection);

    int updateBatch(List<CustomerInfo> list);

    int batchInsert(@Param("list") List<CustomerInfo> list);
}