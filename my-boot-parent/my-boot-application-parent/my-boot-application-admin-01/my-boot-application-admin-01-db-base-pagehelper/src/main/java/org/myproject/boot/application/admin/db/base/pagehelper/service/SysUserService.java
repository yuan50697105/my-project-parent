package org.myproject.boot.application.admin.db.base.pagehelper.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUserQuery;

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

    PageInfo<SysUser> selectByExampleWithPage(int page, int pageSize, SysUserExample example);

    PageInfo<SysUser> selectByQueryWithPage(int page, int pageSize, SysUserQuery query);

    List<String> selectUsernameByEnabled(String enabled);

    List<SysUser> selectByQuery(SysUserQuery query);
}



