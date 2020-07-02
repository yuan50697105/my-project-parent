package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface SysUserService{


    PageInfo<SysUser> selectByQueryWithPage(int page, int size, SysUserQuery query);

    List<SysUser> selectByQuery(SysUserQuery query);

    SysUser selectByPrimaryKey(Long id);

    int insert(SysUser sysUser);

    int updateByPrimaryKeySelective(SysUser sysUser);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(Long id);
}
