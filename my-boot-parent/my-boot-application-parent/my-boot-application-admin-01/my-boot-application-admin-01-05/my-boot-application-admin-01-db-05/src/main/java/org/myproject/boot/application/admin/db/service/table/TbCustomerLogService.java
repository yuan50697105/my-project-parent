package org.myproject.boot.application.admin.db.service.table;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLog;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLogQuery;

import java.util.List;

public interface TbCustomerLogService{


    PageInfo<TbCustomerLog> selectByQueryWithPage(int page, int size, TbCustomerLogQuery query);

    List<TbCustomerLog> selectByQuery(TbCustomerLogQuery query);
}
