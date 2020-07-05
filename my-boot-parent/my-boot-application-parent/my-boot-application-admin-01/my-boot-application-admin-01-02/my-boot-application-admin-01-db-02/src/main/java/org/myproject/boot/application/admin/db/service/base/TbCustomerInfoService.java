package org.myproject.boot.application.admin.db.service.base;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;

import java.util.List;

public interface TbCustomerInfoService {


    long countByExample(TbCustomerInfoExample example);

    int deleteByExample(TbCustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCustomerInfo record);

    int insertSelective(TbCustomerInfo record);

    List<TbCustomerInfo> selectByExample(TbCustomerInfoExample example);

    TbCustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbCustomerInfo record, TbCustomerInfoExample example);

    int updateByExample(TbCustomerInfo record, TbCustomerInfoExample example);

    int updateByPrimaryKeySelective(TbCustomerInfo record);

    int updateByPrimaryKey(TbCustomerInfo record);

    PageInfo<TbCustomerInfo> selectByExample(TbCustomerInfoExample example, int page, int pageSize);

    PageInfo<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query, int page, int pageSize);

    List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query);
}
