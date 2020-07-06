package org.myproject.boot.application.admin.db.service.table;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface TbCustomerTypeService{


    PageInfo<TbCustomerType> selectByQuery(TbCustomerTypeQuery query, int page, int size);

    List<TbCustomerType> selectByQuery(TbCustomerTypeQuery query);

    void insert(TbCustomerType convert);

    void updateSelective(TbCustomerType convert);

    void deleteByExample(Object example);

    void deleteById(Long id);
}
