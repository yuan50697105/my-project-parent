package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;

import java.util.List;

public interface TbCustomerInfoService{


    PageInfo<TbCustomerInfo> selectByQueryWithPage(int page, int size, TbCustomerInfoQuery query);

    List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query);

    int insert(TbCustomerInfo customerInfo);

    int updateByPrimaryKeySelective(TbCustomerInfo customerInfo);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(Long id);
}
