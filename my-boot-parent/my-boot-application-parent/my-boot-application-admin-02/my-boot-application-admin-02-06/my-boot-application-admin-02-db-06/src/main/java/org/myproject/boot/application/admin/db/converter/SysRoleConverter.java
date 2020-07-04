package org.myproject.boot.application.admin.db.converter;

import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 23:16
 */
@Mapper(componentModel = "spring")
public interface SysRoleConverter {
    SysRole voToPo(SysRoleVo sysUserVo);
}
