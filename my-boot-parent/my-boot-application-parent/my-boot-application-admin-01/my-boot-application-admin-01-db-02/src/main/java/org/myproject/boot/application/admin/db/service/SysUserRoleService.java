package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.SysUserRole;
import org.myproject.boot.application.admin.db.pojo.SysUserRoleExample;

import java.util.List;

public interface SysUserRoleService {


    long countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    List<SysUserRole> selectByExample(SysUserRoleExample example);

    SysUserRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(SysUserRole record, SysUserRoleExample example);

    int updateByExample(SysUserRole record, SysUserRoleExample example);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);

}

