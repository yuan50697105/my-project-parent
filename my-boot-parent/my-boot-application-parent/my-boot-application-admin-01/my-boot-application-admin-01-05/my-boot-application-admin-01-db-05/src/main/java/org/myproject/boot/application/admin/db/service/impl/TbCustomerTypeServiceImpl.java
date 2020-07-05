package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbCustomerTypeMapper;
import org.myproject.boot.application.admin.db.service.TbCustomerTypeService;
@Service
public class TbCustomerTypeServiceImpl implements TbCustomerTypeService{

    @Resource
    private TbCustomerTypeMapper tbCustomerTypeMapper;

}
