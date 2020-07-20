package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbOrderItemMapper;
import org.myproject.boot.application.admin.db.service.TbOrderItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbOrderItemServiceImpl implements TbOrderItemService {

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

}

