package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleExample;

import java.util.List;

public interface TbSysRoleService extends IService<TbSysRole> {


    long countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    int updateByExampleSelective(TbSysRole record, TbSysRoleExample example);

    int updateByExample(TbSysRole record, TbSysRoleExample example);

    List<Long> listRoleIdByIds(List<Long> roleIds);
}