package org.myproject.boot.application.admin.web.db.service;

import java.util.List;
import org.myproject.boot.application.admin.web.db.pojo.TbSysPermissionExample;
import org.myproject.boot.application.admin.web.db.pojo.TbSysPermission;
import com.baomidou.mybatisplus.extension.service.IService;

public interface TbSysPermissionService extends IService<TbSysPermission>{


    long countByExample(TbSysPermissionExample example);

    int deleteByExample(TbSysPermissionExample example);

    List<TbSysPermission> selectByExample(TbSysPermissionExample example);

    int updateByExampleSelective(TbSysPermission record,TbSysPermissionExample example);

    int updateByExample(TbSysPermission record,TbSysPermissionExample example);

    void removeByRoleId(Long roleId);
}
