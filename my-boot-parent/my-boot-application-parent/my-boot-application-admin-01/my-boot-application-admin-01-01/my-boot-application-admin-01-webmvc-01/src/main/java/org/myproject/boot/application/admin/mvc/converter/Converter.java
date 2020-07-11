package org.myproject.boot.application.admin.mvc.converter;

import org.mapstruct.*;
import org.myproject.boot.application.admin.service.pojo.Route;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 20:05
 */
@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION,nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface Converter {
    @Mapping(target = "name", ignore = true)
    @Mapping(target = "method", ignore = true)
    Route route(org.myproject.boot.commons.route.pojo.Route route);

    List<Route> route(List<org.myproject.boot.commons.route.pojo.Route> routes);
}