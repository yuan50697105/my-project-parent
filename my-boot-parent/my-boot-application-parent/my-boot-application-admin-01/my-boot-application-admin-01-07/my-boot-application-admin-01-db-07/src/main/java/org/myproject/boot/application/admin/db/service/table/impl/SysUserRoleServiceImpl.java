package org.myproject.boot.application.admin.db.service.table.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.SysUserRoleMapper;
import org.myproject.boot.application.admin.db.pojo.SysUserRole;
import org.myproject.boot.application.admin.db.service.table.SysUserRoleService;
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService{

}
