package org.myproject.boot.application.admin.api.service;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.myproject.boot.application.admin.api.pojo.*;
import org.myproject.boot.application.admin.service.pojo.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-07 22:03
 */
@Mapper(componentModel = "spring")
public interface ApiConverter {
    SysUsersAo sysUser(SysUserAoDTO sysUserAoDTO);

    List<SysRolesAo> sysRoles(List<SysRoleAoDTO> sysRoleAoDTOS);

    SysRolesAo sysRole(SysRolesAo role);

    SysUserQueryDTO sysUserQuery(SysUsersQuery query);

    List<SysUsersAo> sysUsers(List<SysUserAoDTO> list);

    IPages<SysUsersAo> sysUsers(IPage<SysUserAoDTO> iPage);

    @Mapping(target = "event", ignore = true)
    SysUserVoDTO sysUsers(SysUsersVo sysUsersVo);
}
