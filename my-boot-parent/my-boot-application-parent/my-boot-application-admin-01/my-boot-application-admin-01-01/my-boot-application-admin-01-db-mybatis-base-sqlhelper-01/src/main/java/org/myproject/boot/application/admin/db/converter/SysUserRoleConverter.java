package org.myproject.boot.application.admin.db.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserRole;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:24
 */
@Mapper(componentModel = "spring")
public interface SysUserRoleConverter {
    default List<SysUserRole> create(SysUser sysUser, List<SysRole> sysRoles) {
        return sysRoles.stream().map(sysRole -> new SysUserRole(sysUser.getId(), sysRole.getId())).collect(Collectors.toList());
    }

    default List<SysUserRole> convert(SysUser sysUser, List<SysRole> sysRoles) {
        ArrayList<SysUserRole> sysUserRoles = new ArrayList<>();
        for (SysRole sysRole : sysRoles) {
            sysUserRoles.add(convert(sysUser, sysRole));
        }
        return sysUserRoles;
    }

    @Mapping(target = "userId", source = "sysUser.id")
    @Mapping(target = "roleId", source = "sysRole.id")
    SysUserRole convert(SysUser sysUser, SysRole sysRole);
}
