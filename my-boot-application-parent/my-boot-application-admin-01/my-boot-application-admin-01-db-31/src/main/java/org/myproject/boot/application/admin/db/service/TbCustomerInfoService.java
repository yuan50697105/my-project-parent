package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;

import java.util.List;

public interface TbCustomerInfoService {


    PageInfo<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery customerInfoQuery, int page, int size);

    List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery customerInfoQuery);

    TbCustomerInfo selectByPrimaryKey(Long id);

    int insert(TbCustomerInfo customerInfo);

    int updateByPrimaryKeySelective(TbCustomerInfo customerInfo);

    int deleteByPrimaryKey(Long id);
}

