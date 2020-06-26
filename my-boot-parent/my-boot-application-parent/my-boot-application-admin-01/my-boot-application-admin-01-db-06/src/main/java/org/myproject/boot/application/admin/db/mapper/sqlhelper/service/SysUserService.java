package org.myproject.boot.application.admin.db.mapper.sqlhelper.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.sqlhelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.mapper.sqlhelper.pojo.SysUserQuery;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface SysUserService{


    PageInfo<SysUser> selectByQueryWithPage(int page, int size, SysUserQuery query);

    PageInfo<SysUser> selectByExampleWithPage(int page, int size, Example example);

    List<SysUser> selectByQuery(SysUserQuery query);

    List<SysUser> selectByExample(Example example);

    SysUser selectByPrimaryKey(Long id);

    int insert(SysUser sysUser);

    int updateByPrimaryKeySelective(SysUser sysUser);

    int deleteByExample(Example example);

    int deleteByPrimaryKey(Long id);
}
