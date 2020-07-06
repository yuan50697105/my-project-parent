package org.myproject.boot.application.admin.db.service.table;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;

import java.util.List;

public interface TbCustomerInfoService{


    PageInfo<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query, int page, int size);

    List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query);

    TbCustomerInfo selectById(Long id);

    int insert(TbCustomerInfo customerInfo);

    int updateByPrimaryKeySelective(TbCustomerInfo customerInfo);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(Long id);
}
