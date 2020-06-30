package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoExample;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;

public interface TbCustomerInfoService extends IService<TbCustomerInfo>{


    long countByExample(TbCustomerInfoExample example);

    int deleteByExample(TbCustomerInfoExample example);

    List<TbCustomerInfo> selectByExample(TbCustomerInfoExample example);

    int updateByExampleSelective(TbCustomerInfo record,TbCustomerInfoExample example);

    int updateByExample(TbCustomerInfo record,TbCustomerInfoExample example);

    PageInfo<TbCustomerInfo> selectByQueryWithPage(int page, int size, TbCustomerInfoQuery query);

    List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query);

}
