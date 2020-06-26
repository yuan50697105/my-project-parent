package org.myproject.boot.application.admin.db.base.sqlhelper.converter;

import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.base.sqlhelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.base.sqlhelper.pojo.SysUserVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 23:16
 */
@Mapper(componentModel = "spring")
public interface SysUserConverter {
    SysUser voToPo(SysUserVo sysUserVo);
}
