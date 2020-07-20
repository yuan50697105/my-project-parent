package org.myproject.cloud.application.admin.api.impl;

import lombok.AllArgsConstructor;
import org.myproject.cloud.application.admin.api.base.RouteApi;
import org.myproject.cloud.application.admin.api.converter.TbConverter;
import org.myproject.cloud.application.admin.api.pojo.BServiceRoute;
import org.myproject.cloud.application.admin.db.pojo.TbSysRoute;
import org.myproject.cloud.application.admin.db.pojo.TbSysRouteExample;
import org.myproject.cloud.application.admin.db.service.TbSysRouteService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class RouteApiImpl implements RouteApi {
    private final TbConverter converter;
    private final TbSysRouteService sysRouteService;

    @Override
    public List<BServiceRoute> allRoutes() {
        List<TbSysRoute> list = sysRouteService.selectByExample(new TbSysRouteExample());
        return converter.createRoutes(list);
    }

    @Override
    public void saveRoute(BServiceRoute BServiceRoute) {
        TbSysRoute sysRoute = converter.routeForInsert(BServiceRoute);
        sysRouteService.insert(sysRoute);
    }

    @Override
    public void saveRoute(List<BServiceRoute> BServiceRoute) {
        List<TbSysRoute> sysRoutes = converter.routeForInsert(BServiceRoute);
        sysRoutes.forEach(sysRouteService::insert);
    }
}