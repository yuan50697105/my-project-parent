package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbOrderItem;
import org.myproject.boot.application.admin.db.pojo.TbOrderItemExample;

import java.util.List;

public interface TbOrderItemService extends IService<TbOrderItem> {


    long countByExample(TbOrderItemExample example);

    int deleteByExample(TbOrderItemExample example);

    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    int updateByExampleSelective(TbOrderItem record, TbOrderItemExample example);

    int updateByExample(TbOrderItem record, TbOrderItemExample example);

}
