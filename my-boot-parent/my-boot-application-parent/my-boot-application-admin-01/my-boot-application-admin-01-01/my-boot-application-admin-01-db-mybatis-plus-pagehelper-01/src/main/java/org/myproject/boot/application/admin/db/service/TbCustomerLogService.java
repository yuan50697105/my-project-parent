package org.myproject.boot.application.admin.db.service;

import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLog;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLogExample;
import com.baomidou.mybatisplus.extension.service.IService;
public interface TbCustomerLogService extends IService<TbCustomerLog>{


    long countByExample(TbCustomerLogExample example);

    int deleteByExample(TbCustomerLogExample example);

    List<TbCustomerLog> selectByExample(TbCustomerLogExample example);

    int updateByExampleSelective(TbCustomerLog record,TbCustomerLogExample example);

    int updateByExample(TbCustomerLog record,TbCustomerLogExample example);

}
