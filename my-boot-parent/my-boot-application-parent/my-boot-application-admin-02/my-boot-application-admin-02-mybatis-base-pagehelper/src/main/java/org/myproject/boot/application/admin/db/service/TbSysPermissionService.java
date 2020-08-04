package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbSysPermission;
import org.myproject.boot.application.admin.db.pojo.TbSysPermissionExample;

import java.util.List;

public interface TbSysPermissionService {


    long countByExample(TbSysPermissionExample example);

    int deleteByExample(TbSysPermissionExample example);

    int insert(TbSysPermission record);

    int insertSelective(TbSysPermission record);

    List<TbSysPermission> selectByExample(TbSysPermissionExample example);

    int updateByExampleSelective(TbSysPermission record, TbSysPermissionExample example);

    int updateByExample(TbSysPermission record, TbSysPermissionExample example);

    int batchInsert(List<TbSysPermission> list);

}

