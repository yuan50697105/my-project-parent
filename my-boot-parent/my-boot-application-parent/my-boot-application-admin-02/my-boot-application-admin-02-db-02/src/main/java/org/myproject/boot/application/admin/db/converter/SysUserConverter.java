package org.myproject.boot.application.admin.db.converter;

import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-27 20:05
 */
@Mapper(componentModel = "spring")
public interface SysUserConverter {
    SysUser voToPo(SysUserVo sysUserVo);
}