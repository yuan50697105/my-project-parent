package org.myproject.app.auth.service;

import org.mapstruct.Mapper;
import org.myproject.app.auth.pojo.*;
import org.myproject.app.commons.service.BaseConverter;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 15:18
 */
@Mapper(componentModel = "spring")
public interface AuthPojoConverter extends BaseConverter {
    AuthUser convert(AuthUserVo record);

    AuthRole convert(AuthRoleVo authRoleVo);

    AuthPermission convert(AuthPermissionVo authPermissionVo);
}
