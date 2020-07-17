package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbOrderInfo;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbOrderInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbOrderInfoQuery;

public interface TbOrderInfoService{


    long countByExample(TbOrderInfoExample example);

    int deleteByExample(TbOrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbOrderInfo record);

    int insertSelective(TbOrderInfo record);

    List<TbOrderInfo> selectByExample(TbOrderInfoExample example);

    TbOrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbOrderInfo record,TbOrderInfoExample example);

    int updateByExample(TbOrderInfo record,TbOrderInfoExample example);

    int updateByPrimaryKeySelective(TbOrderInfo record);

    int updateByPrimaryKey(TbOrderInfo record);

    PageInfo<TbOrderInfo> selectByExample(TbOrderInfoExample example, int page, int pageSize);

    List<TbOrderInfo> selectByQuery(TbOrderInfoQuery query);

    PageInfo<TbOrderInfo> selectByQuery(TbOrderInfoQuery query, int page, int pageSize);
}