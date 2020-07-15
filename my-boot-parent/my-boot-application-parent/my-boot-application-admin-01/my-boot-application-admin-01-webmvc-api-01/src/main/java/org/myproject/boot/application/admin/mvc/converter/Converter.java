package org.myproject.boot.application.admin.mvc.converter;

import org.mapstruct.*;
import org.myproject.boot.application.admin.mvc.pojo.SysUserAddAo;
import org.myproject.boot.application.admin.service.pojo.ServiceRoute;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;
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
    ServiceRoute route(UrlRoute route);

    List<ServiceRoute> route(List<UrlRoute> routes);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    SysUserVo sysUser(SysUserAddAo userAddAo);
}