package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbSysLogMapper;
import org.myproject.boot.application.admin.db.service.TbSysLogService;

@Service
public class TbSysLogServiceImpl implements TbSysLogService {

    @Resource
    private TbSysLogMapper tbSysLogMapper;

}

