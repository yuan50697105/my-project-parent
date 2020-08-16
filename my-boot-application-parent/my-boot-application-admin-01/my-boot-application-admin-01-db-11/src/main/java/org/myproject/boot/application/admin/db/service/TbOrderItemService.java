package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbOrderItem;
import org.myproject.boot.application.admin.db.pojo.TbOrderItemExample;

import java.util.List;

public interface TbOrderItemService {


    long countByExample(TbOrderItemExample example);

    int deleteByExample(TbOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    TbOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbOrderItem record, TbOrderItemExample example);

    int updateByExample(TbOrderItem record, TbOrderItemExample example);

    int updateByPrimaryKeySelective(TbOrderItem record);

    int updateByPrimaryKey(TbOrderItem record);

}
