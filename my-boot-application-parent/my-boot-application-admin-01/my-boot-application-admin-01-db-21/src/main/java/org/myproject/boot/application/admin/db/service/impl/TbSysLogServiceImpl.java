package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysLogMapper;
import org.myproject.boot.application.admin.db.service.TbSysLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbSysLogServiceImpl implements TbSysLogService {

    @Resource
    private TbSysLogMapper tbSysLogMapper;

}

