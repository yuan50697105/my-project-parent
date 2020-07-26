package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleExample;

import java.util.List;

public interface TbSysRoleService {


    long countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    int insert(TbSysRole record);

    int insertSelective(TbSysRole record);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    int updateByExampleSelective(TbSysRole record, TbSysRoleExample example);

    int updateByExample(TbSysRole record, TbSysRoleExample example);

}
