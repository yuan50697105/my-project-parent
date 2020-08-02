package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysPermissionMapper;
import org.myproject.boot.application.admin.db.service.TbSysPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbSysPermissionServiceImpl implements TbSysPermissionService {

    @Resource
    private TbSysPermissionMapper tbSysPermissionMapper;

}
