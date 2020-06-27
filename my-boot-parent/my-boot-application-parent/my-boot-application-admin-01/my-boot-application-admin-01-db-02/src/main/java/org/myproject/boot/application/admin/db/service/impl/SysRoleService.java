package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleExample;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;

import java.util.List;
public interface SysRoleService{


    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    List<SysRole> selectByQuery(SysRoleQuery query);

    SysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysRole record,SysRoleExample example);

    int updateByExample(SysRole record,SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    PageInfo<SysRole> selectByExampleWithPage(int page, int pageSize, SysRoleExample example);

    PageInfo<SysRole> selectByQueryWithPage(int page, int pageSize, SysRoleQuery query);
}