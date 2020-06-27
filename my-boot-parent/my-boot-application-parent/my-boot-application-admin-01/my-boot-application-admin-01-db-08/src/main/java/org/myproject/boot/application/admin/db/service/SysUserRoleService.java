package org.myproject.boot.application.admin.db.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.pojo.SysUserRoleExample;
import org.myproject.boot.application.admin.db.pojo.SysUserRole;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysUserRoleService extends IService<SysUserRole>{


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

    PageInfo<SysUser> selectByExampleWithPage(int page, int pageSize, SysUserExample example);
}
