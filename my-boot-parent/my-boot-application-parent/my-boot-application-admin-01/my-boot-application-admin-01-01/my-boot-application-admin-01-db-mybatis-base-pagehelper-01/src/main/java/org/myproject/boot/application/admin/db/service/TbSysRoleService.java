package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleExample;
public interface TbSysRoleService{


    long countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysRole record);

    int insertSelective(TbSysRole record);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    TbSysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbSysRole record,TbSysRoleExample example);

    int updateByExample(TbSysRole record,TbSysRoleExample example);

    int updateByPrimaryKeySelective(TbSysRole record);

    int updateByPrimaryKey(TbSysRole record);

}
