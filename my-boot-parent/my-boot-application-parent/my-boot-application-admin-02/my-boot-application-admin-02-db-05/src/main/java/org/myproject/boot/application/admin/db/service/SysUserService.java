package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;

import java.util.List;

public interface SysUserService {


    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysUser record, SysUserExample example);

    int updateByExample(SysUser record, SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    PageInfo<SysUser> selectByQueryWithPage(int page, int size, SysUserQuery query);

    List<SysUser> selectByQuery(SysUserQuery query);

    PageInfo<SysUser> selectByExampleWithPage(int page, int pageSize, SysUserExample example);
}

