package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.pojo.TbSysPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbSysPermissionMapper;
import org.myproject.boot.application.admin.db.service.TbSysPermissionService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendSqls;

@Service
public class TbSysPermissionServiceImpl implements TbSysPermissionService{

    @Resource
    private TbSysPermissionMapper tbSysPermissionMapper;

    @Override
    public void deleteByRoleId(Long roleId) {
        Example.Builder builder = Example.builder(TbSysPermission.class);
        builder.where(WeekendSqls.<TbSysPermission>custom().andEqualTo(TbSysPermission::getRoleId, roleId));
        tbSysPermissionMapper.deleteByExample(builder.build());
    }
}
