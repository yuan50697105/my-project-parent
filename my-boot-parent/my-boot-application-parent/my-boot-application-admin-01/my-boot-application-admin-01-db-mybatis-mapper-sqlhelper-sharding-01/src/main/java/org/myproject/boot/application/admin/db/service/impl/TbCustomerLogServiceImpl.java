package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbCustomerLogMapper;
import org.myproject.boot.application.admin.db.service.TbCustomerLogService;

@Service
public class TbCustomerLogServiceImpl implements TbCustomerLogService {

    @Resource
    private TbCustomerLogMapper tbCustomerLogMapper;

}

