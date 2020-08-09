package org.myproject.boot.application.admin.web.db.service;

import org.myproject.boot.application.admin.web.db.pojo.TbSysUserRole;

import java.util.List;

public interface TbSysUserRoleService{


    List<Long> selectRoleIdByUserId(Long id);

    void deleteByUserId(Long userId);

    void deleteByRoleId(Long roleId);

    void insert(TbSysUserRole tbSysUserRole);
}
