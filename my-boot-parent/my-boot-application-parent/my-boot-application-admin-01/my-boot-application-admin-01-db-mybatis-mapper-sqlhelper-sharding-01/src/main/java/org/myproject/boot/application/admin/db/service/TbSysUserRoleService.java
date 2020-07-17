package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;

public interface TbSysUserRoleService {


    int insert(TbSysUserRole tbSysUserRole);

    int deleteByUserId(Long userId);
}

