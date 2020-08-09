package org.myproject.boot.application.admin.web.db.service;

import org.myproject.boot.application.admin.web.db.pojo.TbSysUserRoleExample;
import java.util.List;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUserRole;
import com.baomidou.mybatisplus.extension.service.IService;

public interface TbSysUserRoleService extends IService<TbSysUserRole>{


    long countByExample(TbSysUserRoleExample example);

    int deleteByExample(TbSysUserRoleExample example);

    List<TbSysUserRole> selectByExample(TbSysUserRoleExample example);

    int updateByExampleSelective(TbSysUserRole record,TbSysUserRoleExample example);

    int updateByExample(TbSysUserRole record,TbSysUserRoleExample example);

    List<Long> listRoleIdByUserId(Long userId);

    void removeByUserId(Long userId);

    void removeByRoleId(Long roleId);
}
