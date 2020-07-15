package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRoleExample;

import java.util.List;

public interface TbSysUserRoleService extends IService<TbSysUserRole> {


    long countByExample(TbSysUserRoleExample example);

    int deleteByExample(TbSysUserRoleExample example);

    List<TbSysUserRole> selectByExample(TbSysUserRoleExample example);

    int updateByExampleSelective(TbSysUserRole record, TbSysUserRoleExample example);

    int updateByExample(TbSysUserRole record, TbSysUserRoleExample example);

    boolean removeByUserId(Long userId);
}
