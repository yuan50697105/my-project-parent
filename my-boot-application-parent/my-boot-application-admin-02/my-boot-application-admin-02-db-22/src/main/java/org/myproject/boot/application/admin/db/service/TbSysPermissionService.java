package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbSysPermission;
import org.myproject.boot.application.admin.db.pojo.TbSysPermissionExample;

import java.util.List;

public interface TbSysPermissionService extends IService<TbSysPermission> {


    long countByExample(TbSysPermissionExample example);

    int deleteByExample(TbSysPermissionExample example);

    List<TbSysPermission> selectByExample(TbSysPermissionExample example);

    int updateByExampleSelective(TbSysPermission record, TbSysPermissionExample example);

    int updateByExample(TbSysPermission record, TbSysPermissionExample example);

    void removeByRoleId(Long roleId);
}
