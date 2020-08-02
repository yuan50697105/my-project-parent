package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysUserRoleMapper;
import org.myproject.boot.application.admin.db.service.TbSysUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbSysUserRoleServiceImpl implements TbSysUserRoleService {

    @Resource
    private TbSysUserRoleMapper tbSysUserRoleMapper;

}
