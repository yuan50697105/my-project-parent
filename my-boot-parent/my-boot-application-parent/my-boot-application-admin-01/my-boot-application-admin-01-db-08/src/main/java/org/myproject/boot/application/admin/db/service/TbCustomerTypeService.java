package org.myproject.boot.application.admin.db.service;

import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import com.baomidou.mybatisplus.extension.service.IService;
public interface TbCustomerTypeService extends IService<TbCustomerType>{


    long countByExample(TbCustomerTypeExample example);

    int deleteByExample(TbCustomerTypeExample example);

    List<TbCustomerType> selectByExample(TbCustomerTypeExample example);

    int updateByExampleSelective(TbCustomerType record,TbCustomerTypeExample example);

    int updateByExample(TbCustomerType record,TbCustomerTypeExample example);

}
