package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleExample;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;

public interface TbSysRoleService{


    long countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysRole record);

    int insertSelective(TbSysRole record);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    TbSysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbSysRole record,TbSysRoleExample example);

    int updateByExample(TbSysRole record,TbSysRoleExample example);

    int updateByPrimaryKeySelective(TbSysRole record);

    int updateByPrimaryKey(TbSysRole record);

    PageInfo<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery, int page, int size);

    List<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery);
}
