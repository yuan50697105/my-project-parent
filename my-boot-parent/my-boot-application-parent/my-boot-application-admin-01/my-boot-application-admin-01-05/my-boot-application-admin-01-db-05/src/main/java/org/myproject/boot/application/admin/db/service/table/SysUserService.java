package org.myproject.boot.application.admin.db.service.table;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;

import java.util.List;

public interface SysUserService{


    PageInfo<SysUser> selectByQuery(SysUserQuery query, int page, int size);

    List<SysUser> selectByQuery(SysUserQuery query);

    SysUser selectByPrimaryKey(Long id);

    int insert(SysUser sysUser);

    int updateByPrimaryKeySelective(SysUser sysUser);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(Long id);
}
