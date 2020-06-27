package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserExample;import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface SysUserService extends IService<SysUser> {


    int updateByPrimaryKey(SysUser record);

    PageInfo<SysUser> selectByQueryWithPage(int page, int size, SysUserQuery query);

    PageInfo<SysUser> selectByExampleWithPage(int page, int size, Example example);

    List<SysUser> selectByQuery(SysUserQuery query);

    List<SysUser> selectByExample(Example example);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int insert(SysUser sysUser);

    int updateByPrimaryKeySelective(SysUser sysUser);

    int deleteByExample(Example example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    long countByExample(SysUserExample example);

    int updateByExampleSelective(SysUser record, SysUserExample example);

    int updateByExample(SysUser record, SysUserExample example);

    IPage<SysUser> pageByQuery(Page<SysUser> page, SysUserQuery query);

    PageInfo<SysUser> selectByExampleWithPage(int page, int pageSize, SysUserExample example);

    List<SysUser> listByQuery(SysUserQuery query);
}

