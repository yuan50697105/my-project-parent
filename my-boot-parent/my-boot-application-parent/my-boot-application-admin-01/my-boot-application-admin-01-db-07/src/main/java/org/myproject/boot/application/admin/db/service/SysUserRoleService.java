package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.SysUserRole;
import org.myproject.boot.application.admin.db.pojo.SysUserRoleExample;

import java.util.List;

public interface SysUserRoleService extends IService<SysUserRole> {


    abstract long countByExample(SysUserRoleExample example);

    abstract int deleteByExample(SysUserRoleExample example);

    abstract int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    abstract List<SysUserRole> selectByExample(SysUserRoleExample example);

    SysUserRole selectByPrimaryKey(Long id);

    abstract int updateByExampleSelective(SysUserRole record, SysUserRoleExample example);

    abstract int updateByExample(SysUserRole record, SysUserRoleExample example);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}
