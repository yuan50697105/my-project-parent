package org.myproject.boot.application.admin.mvc.service;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.service.api.RouteApi;
import org.myproject.boot.application.admin.mvc.converter.Converter;
import org.myproject.boot.application.admin.service.pojo.ServiceRoute;
import org.myproject.boot.commons.route.RouteService;
import org.myproject.boot.commons.route.pojo.UrlRoute;
import org.springframework.stereotype.Service;

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
public class MyRouteService implements RouteService {
    private final RouteApi routeApi;
    private final Converter converter;

    @Override
    public List<UrlRoute> allRoutes() {
        List<ServiceRoute> entities = routeApi.allRoutes();
        return entities.stream().map(ServiceRoute::getUrl).distinct().map(UrlRoute::new).collect(Collectors.toList());
    }

    @Override
    public void saveRoute(UrlRoute route) {
        routeApi.saveRoute(converter.route(route));
    }

    @Override
    public void saveRoutes(List<UrlRoute> routes) {
        routeApi.saveRoute(converter.route(routes));
    }
}