package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbCustomerLogMapper;
import org.myproject.boot.application.admin.db.service.TbCustomerLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbCustomerLogServiceImpl implements TbCustomerLogService {

    @Resource
    private TbCustomerLogMapper tbCustomerLogMapper;

}

