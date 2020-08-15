package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserExample;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;

import java.util.List;

public interface TbSysUserService extends IService<TbSysUser> {


    long countByExample(TbSysUserExample example);

    int deleteByExample(TbSysUserExample example);

    List<TbSysUser> selectByExample(TbSysUserExample example);

    int updateByExampleSelective(TbSysUser record, TbSysUserExample example);

    int updateByExample(TbSysUser record, TbSysUserExample example);

    List<TbSysUser> selectByQuery(TbSysUserQuery query);

    PageInfo<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery, int page, int limit);
}
