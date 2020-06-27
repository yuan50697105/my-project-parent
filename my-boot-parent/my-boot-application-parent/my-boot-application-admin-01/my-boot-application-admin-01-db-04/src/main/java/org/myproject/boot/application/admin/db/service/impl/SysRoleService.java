package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysRoleExample;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;

public interface SysRoleService extends IService<SysRole>{


    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    List<SysRole> selectByExample(SysRoleExample example);

    int updateByExampleSelective(SysRole record,SysRoleExample example);

    int updateByExample(SysRole record,SysRoleExample example);

    PageInfo<SysRole> selectByExampleWithPage(int page, int pageSize, SysRoleExample example);

    PageInfo<SysRole> selectByQueryWithPage(int page, int pageSize, SysRoleQuery query);

    List<SysRole> selectByQuery(SysRoleQuery query);

    List<SysRole> listByQuery(SysRoleQuery query);

    IPage<SysRole> pageByQuery(Page<SysRole> page, SysRoleQuery query);
}
