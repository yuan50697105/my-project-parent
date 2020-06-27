package org.myproject.boot.application.admin.db.mapperplus.pagehelper.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapperplus.pagehelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.mapperplus.pagehelper.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.mapperplus.pagehelper.pojo.SysUserQuery;

import java.util.List;

public interface SysUserService extends IService<SysUser> {


    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(SysUser record, SysUserExample example);

    int updateByExample(SysUser record, SysUserExample example);

    PageInfo<SysUser> selectByQueryWithPage(int page, int size, SysUserQuery query);

    List<SysUser> selectByQuery(SysUserQuery query);
}
