package org.myproject.boot.application.admin.db.service.table;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;

import java.util.List;

public interface TbCustomerTypeService extends IService<TbCustomerType>{


    PageInfo<TbCustomerType> selectByQuery(TbCustomerTypeQuery query, int page, int size);

    List<TbCustomerType> selectByQuery(TbCustomerTypeQuery query);
}
