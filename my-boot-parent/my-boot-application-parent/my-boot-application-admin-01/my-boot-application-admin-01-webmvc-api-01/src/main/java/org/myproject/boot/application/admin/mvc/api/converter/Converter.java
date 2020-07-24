package org.myproject.boot.application.admin.mvc.api.converter;

import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.api.pojo.BSysUserVo;
import org.myproject.boot.application.admin.mvc.api.pojo.VSysUserVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 20:05
 */
@Mapper(componentModel = "spring")
public interface Converter {
//    @Mapping(target = "name", ignore = true)
//    @Mapping(target = "method", ignore = true)
//    BServiceRoute route(UrlRoute route);
//
//    List<BServiceRoute> route(List<UrlRoute> routes);

    BSysUserVo vSysUser(VSysUserVo sysUser);

}