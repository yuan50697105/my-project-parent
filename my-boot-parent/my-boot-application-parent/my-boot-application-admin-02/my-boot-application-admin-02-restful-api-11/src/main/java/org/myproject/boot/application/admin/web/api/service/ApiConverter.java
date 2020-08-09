package org.myproject.boot.application.admin.web.api.service;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.myproject.boot.application.admin.service.pojo.SysRoleAoDTO;
import org.myproject.boot.application.admin.service.pojo.SysUserAoDTO;
import org.myproject.boot.application.admin.service.pojo.SysUserQueryDTO;
import org.myproject.boot.application.admin.service.pojo.SysUserVoDTO;
import org.myproject.boot.application.admin.web.api.pojo.SysRolesAo;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersAo;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersQuery;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersVo;
import org.myproject.boot.application.commons.pojo.IPage;

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

    IPage<SysUsersAo> sysUsers(IPage<SysUserAoDTO> iPage);

    List<SysRolesAo> sysRoles(List<SysRoleAoDTO> objects);

    SysRolesAo sysRoles(SysRolesAo role);

    SysRolesAo sysRoles(SysRoleAoDTO sysRoleAoDTO);

}
