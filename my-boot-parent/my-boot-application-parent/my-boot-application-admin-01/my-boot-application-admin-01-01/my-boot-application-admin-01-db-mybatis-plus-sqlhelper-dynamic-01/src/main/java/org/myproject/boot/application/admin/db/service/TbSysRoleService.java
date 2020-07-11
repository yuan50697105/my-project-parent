package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleExample;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;

import java.util.List;

public interface TbSysRoleService extends IService<TbSysRole> {


    long countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    int updateByExampleSelective(TbSysRole record, TbSysRoleExample example);

    int updateByExample(TbSysRole record, TbSysRoleExample example);

    PageInfo<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery, int page, int size);

    List<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery);
}
