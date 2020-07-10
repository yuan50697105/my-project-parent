package org.myproject.boot.application.admin.db.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.SysRoute;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 23:16
 */
@Mapper(componentModel = "spring")
public interface SysRoleRouteConverter {

    default List<SysRoleRoute> convert(SysRole sysRole, List<SysRoute> sysRoutes) {
        ArrayList<SysRoleRoute> sysRoleRoutes = new ArrayList<>();
        for (SysRoute sysRoute : sysRoutes) {
            sysRoleRoutes.add(convert(sysRole, sysRoute));
        }
        return sysRoleRoutes;
    }

    @Mapping(target = "routeId", source = "sysRoute.id")
    @Mapping(target = "roleId", source = "sysRole.id")
    SysRoleRoute convert(SysRole sysRole, SysRoute sysRoute);


}
