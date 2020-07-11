package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRoleExample;

import java.util.List;

public interface TbSysUserRoleService{


    long countByExample(TbSysUserRoleExample example);

    int deleteByExample(TbSysUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysUserRole record);

    int insertSelective(TbSysUserRole record);

    List<TbSysUserRole> selectByExample(TbSysUserRoleExample example);

    TbSysUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbSysUserRole record,TbSysUserRoleExample example);

    int updateByExample(TbSysUserRole record,TbSysUserRoleExample example);

    int updateByPrimaryKeySelective(TbSysUserRole record);

    int updateByPrimaryKey(TbSysUserRole record);

}
