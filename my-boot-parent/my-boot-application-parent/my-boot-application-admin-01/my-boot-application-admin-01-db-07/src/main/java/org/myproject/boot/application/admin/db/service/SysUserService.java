package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserExample;import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface SysUserService {


    PageInfo<SysUser> selectByQueryWithPage(int page, int size, SysUserQuery query);

    PageInfo<SysUser> selectByExampleWithPage(int page, int size, Example example);

    List<SysUser> selectByQuery(SysUserQuery query);

    List<SysUser> selectByExample(Example example);

    SysUser selectByPrimaryKey(Long id);

    int insert(SysUser sysUser);

    int updateByPrimaryKeySelective(SysUser sysUser);

    int deleteByExample(Example example);

    int deleteByPrimaryKey(Long id);

    long countByExample(SysUserExample example);

    int updateByExampleSelective(SysUser record, SysUserExample example);

    int updateByExample(SysUser record, SysUserExample example);
}

