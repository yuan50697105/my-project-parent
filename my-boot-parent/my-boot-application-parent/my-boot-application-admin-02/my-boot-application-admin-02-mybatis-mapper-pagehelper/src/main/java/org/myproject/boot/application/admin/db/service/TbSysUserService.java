package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;

import java.util.List;

public interface TbSysUserService{


    TbSysUser selectByPrimaryKey(Long id);

    List<TbSysUser> selectByQuery(TbSysUserQuery query);

    PageInfo<TbSysUser> selectByQuery(TbSysUserQuery query, int page, int limit);

    void deleteByPrimaryKey(Long id);

    void updateByPrimaryKeySelective(TbSysUser tbSysUser);

    void insert(TbSysUser tbSysUser);
}
