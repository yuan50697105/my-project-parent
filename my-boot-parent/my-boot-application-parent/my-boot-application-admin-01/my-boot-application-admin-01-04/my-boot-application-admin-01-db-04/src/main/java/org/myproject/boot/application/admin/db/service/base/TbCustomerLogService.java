package org.myproject.boot.application.admin.db.service.base;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLog;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLogExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLogQuery;

import java.util.List;

public interface TbCustomerLogService extends IService<TbCustomerLog> {


    long countByExample(TbCustomerLogExample example);

    int deleteByExample(TbCustomerLogExample example);

    List<TbCustomerLog> selectByExample(TbCustomerLogExample example);

    int updateByExampleSelective(TbCustomerLog record, TbCustomerLogExample example);

    int updateByExample(TbCustomerLog record, TbCustomerLogExample example);

    PageInfo<TbCustomerLog> selectByQueryWithPage(int page, int size, TbCustomerLogQuery query);

    List<TbCustomerLog> selectByQuery(TbCustomerLogQuery query);

    PageInfo<TbCustomerLog> selectByExampleWithPage(int page, int pageSize, TbCustomerLogExample example);
}
