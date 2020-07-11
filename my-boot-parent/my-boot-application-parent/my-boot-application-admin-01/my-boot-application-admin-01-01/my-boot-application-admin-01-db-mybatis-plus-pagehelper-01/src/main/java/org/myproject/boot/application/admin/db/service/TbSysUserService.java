package org.myproject.boot.application.admin.db.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysUserExample;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.service.pojo.SysUserQuery;

public interface TbSysUserService extends IService<TbSysUser>{


    long countByExample(TbSysUserExample example);

    int deleteByExample(TbSysUserExample example);

    List<TbSysUser> selectByExample(TbSysUserExample example);

    int updateByExampleSelective(TbSysUser record,TbSysUserExample example);

    int updateByExample(TbSysUser record,TbSysUserExample example);

    PageInfo<TbSysUser> selectByQuery(TbSysUserQuery query, int page, int size);

    List<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery);
}
