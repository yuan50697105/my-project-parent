package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbOrderInfo;
import org.myproject.boot.application.admin.db.pojo.TbOrderInfoExample;

import java.util.List;

public interface TbOrderInfoService extends IService<TbOrderInfo> {


    long countByExample(TbOrderInfoExample example);

    int deleteByExample(TbOrderInfoExample example);

    List<TbOrderInfo> selectByExample(TbOrderInfoExample example);

    int updateByExampleSelective(TbOrderInfo record, TbOrderInfoExample example);

    int updateByExample(TbOrderInfo record, TbOrderInfoExample example);

}
