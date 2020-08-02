package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;

import java.util.List;

public interface TbSysRoleService {


    int deleteByPrimaryKey(Long id);

    TbSysRole selectByPrimaryKey(Long id);

    PageInfo<TbSysRole> selectByQuery(TbSysRoleQuery tbQuery, int page, int limit);

    List<TbSysRole> selectByQuery(TbSysRoleQuery sysUserQuery);

    int insert(TbSysRole record);

    int updateByPrimaryKeySelective(TbSysRole tbSysRole);
}
