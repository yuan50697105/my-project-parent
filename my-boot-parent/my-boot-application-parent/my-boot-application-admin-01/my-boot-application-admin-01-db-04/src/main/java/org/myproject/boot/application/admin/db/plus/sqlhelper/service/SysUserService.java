package org.myproject.boot.application.admin.db.plus.sqlhelper.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.plus.sqlhelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.plus.sqlhelper.pojo.SysUserExample;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.plus.sqlhelper.pojo.SysUserQuery;

public interface SysUserService extends IService<SysUser>{


    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(SysUser record,SysUserExample example);

    int updateByExample(SysUser record,SysUserExample example);

    PageInfo<SysUser> selectByQueryWithPage(int page, int size, SysUserQuery query);

    List<SysUser> selectByQuery(SysUserQuery query);
}
