package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;

import java.util.List;

public interface TbSysUserService {


    int insert(TbSysUser record);

    TbSysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSysUser tbSysUser);

    int deleteByPrimaryKey(Long id);

    PageInfo<TbSysUser> selectByQuery(TbSysUserQuery tbQuery, int page, int limit);

    List<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery);
}
