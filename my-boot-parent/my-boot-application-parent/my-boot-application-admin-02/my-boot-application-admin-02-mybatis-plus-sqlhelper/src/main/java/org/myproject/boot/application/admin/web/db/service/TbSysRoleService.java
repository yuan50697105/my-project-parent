package org.myproject.boot.application.admin.web.db.service;

import org.myproject.boot.application.admin.web.db.pojo.TbSysRole;
import java.util.List;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRoleExample;
import com.baomidou.mybatisplus.extension.service.IService;

public interface TbSysRoleService extends IService<TbSysRole>{


    long countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    int updateByExampleSelective(TbSysRole record,TbSysRoleExample example);

    int updateByExample(TbSysRole record,TbSysRoleExample example);

    List<Long> listRoleIdByIds(List<Long> roleIds);
}
