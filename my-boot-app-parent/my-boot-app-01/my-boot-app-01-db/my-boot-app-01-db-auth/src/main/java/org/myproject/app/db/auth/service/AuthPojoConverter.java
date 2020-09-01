package org.myproject.app.db.auth.service;

import org.mapstruct.Mapper;
import org.myproject.app.db.auth.pojo.*;
import org.myproject.app.db.commons.service.BaseConverter;

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
