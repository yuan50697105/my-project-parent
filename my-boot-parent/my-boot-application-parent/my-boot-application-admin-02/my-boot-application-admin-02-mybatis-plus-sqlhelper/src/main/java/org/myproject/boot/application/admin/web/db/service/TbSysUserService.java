package org.myproject.boot.application.admin.web.db.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUserExample;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUserQuery;

public interface TbSysUserService extends IService<TbSysUser>{


    long countByExample(TbSysUserExample example);

    int deleteByExample(TbSysUserExample example);

    List<TbSysUser> selectByExample(TbSysUserExample example);

    int updateByExampleSelective(TbSysUser record,TbSysUserExample example);

    int updateByExample(TbSysUser record,TbSysUserExample example);

    List<TbSysUser> selectByQuery(TbSysUserQuery query);

    PageInfo<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery, int page, int limit);
}
