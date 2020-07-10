package org.myproject.boot.application.admin.mvc.service;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;
import org.myproject.boot.application.admin.db.service.table.SysRouteService;
import org.myproject.boot.commons.route.pojo.Route;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-02 21:40
 */
@Service
@AllArgsConstructor
public class RouteService implements RouteService {
    private final SysRouteService sysRouteService;

    @Override
    public List<Route> selectAllRoutes() {
        List<SysRoute> sysRoutes = sysRouteService.selectByExample(new SysRouteExample());
        return sysRoutes.stream().map(SysRoute::getUrl).map(Route::new).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void saveRoute(Route route) {
        sysRouteService.insert(SysRoute.builder().url(route.getUrl()).build());
    }
}