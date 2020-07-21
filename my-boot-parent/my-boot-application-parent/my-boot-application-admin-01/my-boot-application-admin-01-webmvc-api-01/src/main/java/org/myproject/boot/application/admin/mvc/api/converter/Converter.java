package org.myproject.boot.application.admin.mvc.api.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.myproject.boot.application.admin.api.pojo.BServiceRoute;
import org.myproject.boot.application.admin.api.pojo.BSysUserVo;
import org.myproject.boot.application.admin.mvc.api.pojo.VSysUserVo;
import org.myproject.boot.commons.route.pojo.UrlRoute;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 20:05
 */
@Mapper(componentModel = "spring")
public interface Converter {
    @Mapping(target = "name", ignore = true)
    @Mapping(target = "method", ignore = true)
    BServiceRoute route(UrlRoute route);

    List<BServiceRoute> route(List<UrlRoute> routes);

    BSysUserVo vSysUser(VSysUserVo sysUser);

}