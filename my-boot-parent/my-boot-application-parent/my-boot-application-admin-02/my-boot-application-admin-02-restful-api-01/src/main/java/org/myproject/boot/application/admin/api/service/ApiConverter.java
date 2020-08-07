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
    SysUserQueryDTO sysUserQuery(SysUsersQuery query);

    @Mapping(target = "event", ignore = true)
    SysUserVoDTO sysUsers(SysUsersVo sysUsersVo);

    SysUsersAo sysUsers(SysUserAoDTO sysUserAoDTO);

    List<SysUsersAo> sysUsers(List<SysUserAoDTO> list);

    IPages<SysUsersAo> sysUsers(IPage<SysUserAoDTO> iPage);

    List<SysRolesAo> sysRoles(List<SysRoleAoDTO> sysRoleAoDTOS);

    SysRolesAo sysRoles(SysRolesAo role);
}
