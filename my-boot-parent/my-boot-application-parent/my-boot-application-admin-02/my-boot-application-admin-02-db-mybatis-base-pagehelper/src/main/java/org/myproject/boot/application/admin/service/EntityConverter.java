package org.myproject.boot.application.admin.service;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 09:27
 */
@Mapper(componentModel = "spring")
public interface EntityConverter {

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    TbSysUser sysUserForAdd(SysUserVo vo);

    @Mapping(target = "version", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "modifier", ignore = true)
    @Mapping(target = "isDelete", ignore = true)
    @Mapping(target = "creater", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    @Mapping(target = "username", ignore = true)
    @Mapping(target = "password", ignore = true)
    TbSysUser sysUserForUpdateInfo(SysUserVo vo);
}
