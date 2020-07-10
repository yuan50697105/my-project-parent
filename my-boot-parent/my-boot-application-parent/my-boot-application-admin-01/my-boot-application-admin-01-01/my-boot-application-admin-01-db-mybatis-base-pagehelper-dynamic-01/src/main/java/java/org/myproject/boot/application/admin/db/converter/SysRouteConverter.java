package java.org.myproject.boot.application.admin.db.converter;

import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteVo;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-28 20:14
 */
@Mapper(componentModel = "spring")
public interface SysRouteConverter {
    SysRoute voToPo(SysRouteVo sysRouteVo);
}