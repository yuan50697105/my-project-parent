package org.myproject.boot.application.admin.web.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRoleExample;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRoleQuery;

import java.util.List;

public interface TbSysRoleService {


    List<TbSysRole> selectByIds(List<Long> roleIds);

    PageInfo<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery, int page, int size);

    List<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery);

    TbSysRole selectByPrimaryKey(Long id);

    int insert(TbSysRole sysRole);

    int updateByPrimaryKeySelective(TbSysRole sysRole);

    int deleteByPrimaryKey(Long id);

    long countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    int insertSelective(TbSysRole record);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    int updateByExampleSelective(TbSysRole record, TbSysRoleExample example);

    int updateByExample(TbSysRole record, TbSysRoleExample example);

    int updateByPrimaryKey(TbSysRole record);

    int updateBatch(List<TbSysRole> list);

    int updateBatchSelective(List<TbSysRole> list);

    int batchInsert(List<TbSysRole> list);

    List<Long> selectIdtByIds(List<Long> roleIds);
}


