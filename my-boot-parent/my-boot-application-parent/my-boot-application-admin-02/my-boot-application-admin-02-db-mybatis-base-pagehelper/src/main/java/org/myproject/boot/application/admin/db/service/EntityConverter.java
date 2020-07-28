package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.service.pojo.ao.SysRoleAo;
import org.myproject.boot.application.admin.service.pojo.ao.SysUserAo;
import org.myproject.boot.application.admin.service.pojo.query.SysRoleQuery;
import org.myproject.boot.application.admin.service.pojo.query.SysUserQuery;
import org.myproject.boot.application.admin.service.pojo.vo.SysRoleVo;
import org.myproject.boot.application.admin.service.pojo.vo.SysUserVo;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 09:27
 */
@Mapper(componentModel = "spring")
public interface EntityConverter {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    TbSysUser convertSysUserForAdd(SysUserVo vo);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    @Mapping(target = "username", ignore = true)
    @Mapping(target = "password", ignore = true)
    void convertSysUserForUpdateInfo(SysUserVo vo, @MappingTarget TbSysUser tbSysUser);

    SysUserAo convertSysUserForGet(TbSysUser tbSysUser);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTimeStart", ignore = true)
    @Mapping(target = "updateTimeEnd", ignore = true)
    @Mapping(target = "size", ignore = true)
    @Mapping(target = "page", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTimeStart", ignore = true)
    @Mapping(target = "createDateEnd", ignore = true)
    TbSysUserQuery convertSysUserForQuery(SysUserQuery query);

    PageInfo<SysUserAo> convertSysUserForPage(PageInfo<TbSysUser> pageInfo);

    List<SysUserAo> convertSysUserForList(List<TbSysUser> tbSysUsers);

    SysRoleAo convertSysRoleForGet(TbSysRole tbSysRole);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTimeStart", ignore = true)
    @Mapping(target = "updateTimeEnd", ignore = true)
    @Mapping(target = "size", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTimeStart", ignore = true)
    @Mapping(target = "createDateEnd", ignore = true)
    TbSysRoleQuery convertSysRoleForQuery(SysRoleQuery query);

    PageInfo<SysRoleAo> convertSysRoleForPage(PageInfo<TbSysRole> pageInfo);

    List<SysRoleAo> convertSysRoleForList(List<TbSysRole> tbSysRoles);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "description", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    TbSysRole convertSysRoleForAdd(SysRoleVo vo);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "description", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    void convertSysRoleForUpdateInfo(SysRoleVo vo, @MappingTarget TbSysRole tbSysRole);
}
