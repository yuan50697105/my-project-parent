package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRoleExample;

import java.util.List;

public interface TbSysUserRoleService {


    long countByExample(TbSysUserRoleExample example);

    int deleteByExample(TbSysUserRoleExample example);

    int insert(TbSysUserRole record);

    int insertSelective(TbSysUserRole record);

    List<TbSysUserRole> selectByExample(TbSysUserRoleExample example);

    int updateByExampleSelective(TbSysUserRole record, TbSysUserRoleExample example);

    int updateByExample(TbSysUserRole record, TbSysUserRoleExample example);

}
