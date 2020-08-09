package org.myproject.boot.application.admin.service.converter;

import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.service.pojo.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-07 21:31
 */
@Mapper(componentModel = "spring")
public interface ConverterService {
    @Mapping(target = "roles", ignore = true)
    SysUserAoDTO sysUser(TbSysUser tbSysUser);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    TbSysUser sysUser(SysUserVoDTO sysUsers);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTimeStart", ignore = true)
    @Mapping(target = "createTimeEnd", ignore = true)
    TbSysUserQuery sysUser(SysUserQueryDTO queryDTO);

    List<SysUserAoDTO> sysUser(List<TbSysUser> selectByQuery);

    PageInfo<SysUserAoDTO> sysUsers(PageInfo<TbSysUser> pageInfo);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    @Mapping(target = "username", ignore = true)
    @Mapping(target = "password", ignore = true)
    void copySysUser(SysUserVoDTO sysUsers, @MappingTarget TbSysUser tbSysUser);

    List<SysRoleAoDTO> sysRoles(List<TbSysRole> selectByIds);

    @Mapping(target = "createTime", ignore = true)
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "creater", ignore = true)
    TbSysRole sysRoles(SysRoleVoDTO sysRoleVoDTO);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    void copySysRole(SysRoleVoDTO sysRoleVoDTO, @MappingTarget TbSysRole tbSysRole);

    SysRoleAoDTO sysRoles(TbSysRole tbSysRole);
}