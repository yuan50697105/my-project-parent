package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;

import java.util.List;

public interface TbCustomerTypeService extends IService<TbCustomerType> {


    long countByExample(TbCustomerTypeExample example);

    int deleteByExample(TbCustomerTypeExample example);

    List<TbCustomerType> selectByExample(TbCustomerTypeExample example);

    int updateByExampleSelective(TbCustomerType record, TbCustomerTypeExample example);

    int updateByExample(TbCustomerType record, TbCustomerTypeExample example);

    PageInfo<TbCustomerType> selectByQuery(TbCustomerTypeQuery customerTypeQuery, int page, int size);

    List<TbCustomerType> selectByQuery(TbCustomerTypeQuery customerTypeQuery);

}

