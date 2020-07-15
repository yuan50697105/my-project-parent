package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbOrderInfo;

import java.util.List;

import org.myproject.boot.application.admin.db.pojo.TbOrderInfoExample;

public interface TbOrderInfoService {


    long countByExample(TbOrderInfoExample example);

    int deleteByExample(TbOrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbOrderInfo record);

    int insertSelective(TbOrderInfo record);

    List<TbOrderInfo> selectByExample(TbOrderInfoExample example);

    TbOrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbOrderInfo record, TbOrderInfoExample example);

    int updateByExample(TbOrderInfo record, TbOrderInfoExample example);

    int updateByPrimaryKeySelective(TbOrderInfo record);

    int updateByPrimaryKey(TbOrderInfo record);

}

