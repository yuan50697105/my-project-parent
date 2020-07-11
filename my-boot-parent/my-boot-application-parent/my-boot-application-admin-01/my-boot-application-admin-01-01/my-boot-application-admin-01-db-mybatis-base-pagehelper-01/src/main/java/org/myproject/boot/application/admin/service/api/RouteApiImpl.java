package org.myproject.boot.application.admin.service.api;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbSysRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRouteExample;
import org.myproject.boot.application.admin.db.service.TbSysRouteService;
import org.myproject.boot.application.admin.service.pojo.ServiceRoute;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 20:31
 */
@Service
@AllArgsConstructor
@Transactional
@Primary
public class RouteApiImpl implements RouteApi {
    private final TbConverter converter;
    private final TbSysRouteService sysRouteService;

    @Override
    public List<ServiceRoute> allRoutes() {
        List<TbSysRoute> list = sysRouteService.selectByExample(new TbSysRouteExample());
        return converter.createRoutes(list);
    }

    @Override
    public void saveRoute(ServiceRoute serviceRoute) {
        TbSysRoute sysRoute = converter.routeForInsert(serviceRoute);
        sysRouteService.insert(sysRoute);
    }

    @Override
    public void saveRoute(List<ServiceRoute> serviceRoute) {
        List<TbSysRoute> sysRoutes = converter.routeForInsert(serviceRoute);
        sysRoutes.forEach(sysRouteService::insert);
    }
}