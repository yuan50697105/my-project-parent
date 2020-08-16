package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysPermissionMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysPermission;
import org.myproject.boot.application.admin.db.service.TbSysPermissionService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;

import javax.annotation.Resource;

@Service
public class TbSysPermissionServiceImpl implements TbSysPermissionService {

    @Resource
    private TbSysPermissionMapper tbSysPermissionMapper;

    @Override
    public void deleteByRoleId(Long roleId) {
        Example.Builder builder = Example.builder(TbSysPermission.class);
        builder.where(WeekendSqls.<TbSysPermission>custom().andEqualTo(TbSysPermission::getRoleId, roleId));
        tbSysPermissionMapper.deleteByExample(builder.build());
    }
}
