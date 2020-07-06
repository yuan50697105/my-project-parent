package org.myproject.boot.application.admin.mvc.service.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.service.table.SysRouteService;
import org.myproject.boot.commons.route.Route;
import org.myproject.boot.commons.route.RouteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

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
public class BaseRouteServiceImpl implements RouteService {
    private final SysRouteService sysRouteService;

    @Override
    public List<Route> selectAllRoutes() {
        List<SysRoute> sysRoutes = sysRouteService.selectByExample(Example.builder(SysRoute.class).build());
        return sysRoutes.stream().map(SysRoute::getUrl).map(Route::new).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void saveRoute(Route route) {
        sysRouteService.save(SysRoute.builder().url(route.getUrl()).build());
    }
}