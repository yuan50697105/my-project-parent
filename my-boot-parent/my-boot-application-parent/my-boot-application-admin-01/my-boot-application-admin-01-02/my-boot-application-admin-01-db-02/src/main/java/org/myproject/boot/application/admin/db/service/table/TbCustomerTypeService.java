package org.myproject.boot.application.admin.db.service.table;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;

import java.util.List;

public interface TbCustomerTypeService {


    long countByExample(TbCustomerTypeExample example);

    int deleteByExample(TbCustomerTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCustomerType record);

    int insertSelective(TbCustomerType record);

    List<TbCustomerType> selectByExample(TbCustomerTypeExample example);

    TbCustomerType selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbCustomerType record, TbCustomerTypeExample example);

    int updateByExample(TbCustomerType record, TbCustomerTypeExample example);

    int updateByPrimaryKeySelective(TbCustomerType record);

    int updateByPrimaryKey(TbCustomerType record);

    PageInfo<TbCustomerType> selectByExample(TbCustomerTypeExample example, int page, int pageSize);

    PageInfo<TbCustomerType> selectByQuery(TbCustomerTypeQuery query, int page, int pageSize);
    List<TbCustomerType> selectByQuery(TbCustomerTypeQuery query);
}
