package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.SysRoleExample;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysRoleService extends IService<SysRole>{


    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    List<SysRole> selectByExample(SysRoleExample example);

    int updateByExampleSelective(SysRole record,SysRoleExample example);

    int updateByExample(SysRole record,SysRoleExample example);

}
