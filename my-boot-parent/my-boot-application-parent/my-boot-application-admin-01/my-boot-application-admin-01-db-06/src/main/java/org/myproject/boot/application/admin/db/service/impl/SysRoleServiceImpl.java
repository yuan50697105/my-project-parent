package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.SysRoleMapper;
import org.myproject.boot.application.admin.db.service.impl.SysRoleService;
@Service
public class SysRoleServiceImpl implements SysRoleService{

    @Resource
    private SysRoleMapper sysRoleMapper;

}
