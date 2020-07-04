package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleExample;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;

import java.util.List;

public interface SysRoleService{


    PageInfo<SysRole> selectByQueryWithPage(int page, int size, SysRoleQuery query);

    List<SysRole> selectByQuery(SysRoleQuery query);

    SysRole selectByPrimaryKey(Long id);

    int insert(SysRole sysRole);

    int updateByPrimaryKeySelective(SysRole sysRole);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(Long id);

}
