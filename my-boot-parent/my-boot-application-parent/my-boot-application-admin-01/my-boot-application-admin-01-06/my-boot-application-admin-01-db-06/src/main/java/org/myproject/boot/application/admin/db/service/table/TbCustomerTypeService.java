package org.myproject.boot.application.admin.db.service.table;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;

import java.util.List;

public interface TbCustomerTypeService{


    PageInfo<TbCustomerType> selectByQuery(TbCustomerTypeQuery query, int page, int size);

    List<TbCustomerType> selectByQuery(TbCustomerTypeQuery query);

    TbCustomerType selectById(Long id);

    void insert(TbCustomerType convert);

    void updateSelective(TbCustomerType convert);

    void deleteByExample(Object o);

    void deleteById(Long id);
}
