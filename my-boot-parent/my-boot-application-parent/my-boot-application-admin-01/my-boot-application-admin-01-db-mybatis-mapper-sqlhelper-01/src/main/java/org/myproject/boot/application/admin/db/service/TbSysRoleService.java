package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;

import java.util.List;

public interface TbSysRoleService {


    List<TbSysRole> selectByIds(List<Long> roleIds);

    PageInfo<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery, int page, int size);

    List<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery);

    TbSysRole selectByPrimaryKey(Long id);

    int insert(TbSysRole sysRole);

    int updateByPrimaryKeySelective(TbSysRole sysRole);

    int deleteByPrimaryKey(Long id);
}

