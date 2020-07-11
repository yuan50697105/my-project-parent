package org.myproject.boot.application.admin.db.converter;

import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.pojo.SysUserVo;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 23:16
 */
@Mapper(componentModel = "spring")
public interface SysUserConverter {
    SysUser voToPo(SysUserVo sysUserVo);

    SysUserQuery convert(org.myproject.boot.application.admin.pojo.SysUserQuery query);

    PageInfo<org.myproject.boot.application.admin.pojo.SysUser> convert(PageInfo<SysUser> pageInfo);

    List<org.myproject.boot.application.admin.pojo.SysUser> convert(List<SysUser> list);

    org.myproject.boot.application.admin.pojo.SysUser convert(SysUser sysUser);

    SysUser convert(org.myproject.boot.application.admin.pojo.SysUserVo sysUserVo);
}
