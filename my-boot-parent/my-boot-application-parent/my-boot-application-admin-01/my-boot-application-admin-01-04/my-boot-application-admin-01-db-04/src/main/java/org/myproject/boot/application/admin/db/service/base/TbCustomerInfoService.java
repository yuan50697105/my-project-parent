package org.myproject.boot.application.admin.db.service.base;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;

import java.util.List;

public interface TbCustomerInfoService extends IService<TbCustomerInfo> {


    long countByExample(TbCustomerInfoExample example);

    int deleteByExample(TbCustomerInfoExample example);

    List<TbCustomerInfo> selectByExample(TbCustomerInfoExample example);

    int updateByExampleSelective(TbCustomerInfo record, TbCustomerInfoExample example);

    int updateByExample(TbCustomerInfo record, TbCustomerInfoExample example);

    PageInfo<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query, int page, int size);

    List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query);
}