package org.myproject.boot.application.admin.db.service.impl;

import java.util.List;
import org.myproject.boot.application.admin.db.pojo.SysUserRoleExample;
import org.myproject.boot.application.admin.db.pojo.SysUserRole;
import com.baomidou.mybatisplus.extension.service.IService;

public interface SysUserRoleService extends IService<SysUserRole> {


    long countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    List<SysUserRole> selectByExample(SysUserRoleExample example);

    int updateByExampleSelective(SysUserRole record, SysUserRoleExample example);

    int updateByExample(SysUserRole record, SysUserRoleExample example);

}

