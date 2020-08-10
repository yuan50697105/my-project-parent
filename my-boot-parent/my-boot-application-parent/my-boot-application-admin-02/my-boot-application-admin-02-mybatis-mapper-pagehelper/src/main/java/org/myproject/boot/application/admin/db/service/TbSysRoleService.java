package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbSysRole;

import java.util.List;

public interface TbSysRoleService{


    List<TbSysRole> selectByIds(List<Long> roleIds);

    TbSysRole selectByPrimaryKey(Long id);

    void updateByPrimaryKeySelective(TbSysRole tbSysRole);

    void insert(TbSysRole sysRoles);

    void deleteByPrimaryKey(Long id);

    List<Long> selectIdtByIds(List<Long> roleIds);
}
