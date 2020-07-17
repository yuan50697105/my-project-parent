package org.myproject.cloud.application.admin.db.service;

import org.myproject.cloud.application.admin.db.pojo.TbCustomerLog;
import org.myproject.cloud.application.admin.db.pojo.TbCustomerLogExample;

import java.util.List;

public interface TbCustomerLogService {


    long countByExample(TbCustomerLogExample example);

    int deleteByExample(TbCustomerLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCustomerLog record);

    int insertSelective(TbCustomerLog record);

    List<TbCustomerLog> selectByExample(TbCustomerLogExample example);

    TbCustomerLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbCustomerLog record, TbCustomerLogExample example);

    int updateByExample(TbCustomerLog record, TbCustomerLogExample example);

    int updateByPrimaryKeySelective(TbCustomerLog record);

    int updateByPrimaryKey(TbCustomerLog record);

}

