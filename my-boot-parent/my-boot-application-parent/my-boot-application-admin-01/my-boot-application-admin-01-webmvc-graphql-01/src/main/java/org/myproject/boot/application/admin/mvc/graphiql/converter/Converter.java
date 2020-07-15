package org.myproject.boot.application.admin.mvc.graphiql.converter;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.myproject.boot.application.admin.mvc.graphiql.pojo.SysUser;
import org.myproject.boot.application.admin.mvc.graphiql.pojo.SysUserInput;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-15 12:23
 */
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface Converter {
    SysUser convert(SysUserInput sysUser);
}
