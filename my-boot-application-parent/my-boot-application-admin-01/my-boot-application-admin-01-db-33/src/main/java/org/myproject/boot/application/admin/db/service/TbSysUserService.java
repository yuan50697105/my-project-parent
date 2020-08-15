package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;

import java.util.List;

public interface TbSysUserService {


    PageInfo<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery, int page, int size);

    List<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery);

    TbSysUser selectByPrimaryKey(Long id);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(TbSysUser sysUser);

    int insert(TbSysUser sysUser);

    int updateByPrimaryKeySelective(TbSysUser sysUserUpdateInfo);
}

