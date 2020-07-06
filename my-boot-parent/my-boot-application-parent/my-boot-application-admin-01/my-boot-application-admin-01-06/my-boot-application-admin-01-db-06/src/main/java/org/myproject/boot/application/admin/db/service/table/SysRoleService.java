package org.myproject.boot.application.admin.db.service.table;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;

import java.util.List;

public interface SysRoleService{


    PageInfo<SysRole> selectByQuery(SysRoleQuery query, int page, int size);

    List<SysRole> selectByQuery(SysRoleQuery query);

    SysRole selectByPrimaryKey(Long id);

    int insert(SysRole sysRole);

    int updateByPrimaryKeySelective(SysRole sysRole);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(Long id);

}
