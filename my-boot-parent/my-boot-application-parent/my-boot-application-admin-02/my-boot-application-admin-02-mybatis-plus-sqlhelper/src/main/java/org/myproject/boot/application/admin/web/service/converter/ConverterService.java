package org.myproject.boot.application.admin.web.service.converter;

import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUserQuery;
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
    SysUserAo sysUser(TbSysUser tbSysUser);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    TbSysUser sysUser(SysUserVo sysUsers);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTimeStart", ignore = true)
    @Mapping(target = "createTimeEnd", ignore = true)
    TbSysUserQuery sysUser(SysUserQuery query);

    List<SysUserAo> sysUser(List<TbSysUser> selectByQuery);

    PageInfo<SysUserAo> sysUsers(PageInfo<TbSysUser> pageInfo);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    @Mapping(target = "username", ignore = true)
    @Mapping(target = "password", ignore = true)
    void copySysUser(SysUserVo sysUsers, @MappingTarget TbSysUser tbSysUser);

    List<SysRoleAo> sysRoles(List<TbSysRole> selectByIds);

    @Mapping(target = "createTime", ignore = true)
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "creater", ignore = true)
    TbSysRole sysRoles(SysRoleVo sysRoleVo);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    void copySysRole(SysRoleVo sysRoleVo, @MappingTarget TbSysRole tbSysRole);

    SysRoleAo sysRoles(TbSysRole tbSysRole);
}