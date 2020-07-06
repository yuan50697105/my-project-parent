package org.myproject.boot.application.admin.db.service.table;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;

import java.util.List;

public interface TbCustomerInfoService extends IService<TbCustomerInfo>{


    PageInfo<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query, int page, int size);

    List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query);
}
