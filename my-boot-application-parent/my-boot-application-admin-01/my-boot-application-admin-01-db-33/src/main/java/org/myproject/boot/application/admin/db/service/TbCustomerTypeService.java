package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;

import java.util.List;

public interface TbCustomerTypeService {


    PageInfo<TbCustomerType> selectByQuery(TbCustomerTypeQuery customerTypeQuery, int page, int size);

    List<TbCustomerType> selectByQuery(TbCustomerTypeQuery customerTypeQuery);

    TbCustomerType selectByPrimaryKey(Long id);

    int insert(TbCustomerType record);

    int updateByPrimaryKeySelective(TbCustomerType record);

    int deleteByPrimaryKey(Long id);
}

