package org.myproject.boot.application.admin.db.service;

import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
public interface TbCustomerTypeService{


    long countByExample(TbCustomerTypeExample example);

    int deleteByExample(TbCustomerTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCustomerType record);

    int insertSelective(TbCustomerType record);

    List<TbCustomerType> selectByExample(TbCustomerTypeExample example);

    TbCustomerType selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbCustomerType record,TbCustomerTypeExample example);

    int updateByExample(TbCustomerType record,TbCustomerTypeExample example);

    int updateByPrimaryKeySelective(TbCustomerType record);

    int updateByPrimaryKey(TbCustomerType record);

}
