package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleExample;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;

import java.util.List;

public interface SysRoleService extends IService<SysRole>{


    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysRole record, SysRoleExample example);

    int updateByExample(SysRole record,SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    PageInfo<SysRole> selectByQueryWithPage(int page, int size, SysRoleQuery query);


    IPage<SysRole> pageByQuery(Page<SysRole> objectPage, SysRoleQuery query);

    List<SysRole> selectByQuery(SysRoleQuery query);

    PageInfo<SysRole> selectByExampleWithPage(int page, int pageSize, SysRoleExample example);

    List<SysRole> listByQuery(SysRoleQuery query);
}
