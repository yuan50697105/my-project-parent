package org.myproject.boot.application.admin.db.service.table.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLog;
import org.myproject.boot.application.admin.db.mapper.TbCustomerLogMapper;
import org.myproject.boot.application.admin.db.service.table.TbCustomerLogService;
@Service
public class TbCustomerLogServiceImpl extends ServiceImpl<TbCustomerLogMapper, TbCustomerLog> implements TbCustomerLogService{

}
