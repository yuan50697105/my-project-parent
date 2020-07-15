package org.myproject.boot.application.admin.mvc.api.converter;

import org.mapstruct.*;
import org.myproject.boot.application.admin.mvc.api.pojo.VSysUserAdd;
import org.myproject.boot.application.admin.service.pojo.BServiceRoute;
import org.myproject.boot.application.admin.service.pojo.BSysUserVo;
import org.myproject.boot.commons.route.pojo.UrlRoute;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 20:05
 */
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface Converter {
    @Mapping(target = "name", ignore = true)
    @Mapping(target = "method", ignore = true)
    BServiceRoute route(UrlRoute route);

    List<BServiceRoute> route(List<UrlRoute> routes);


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    BSysUserVo sysUserAdd(VSysUserAdd sysUser);
}