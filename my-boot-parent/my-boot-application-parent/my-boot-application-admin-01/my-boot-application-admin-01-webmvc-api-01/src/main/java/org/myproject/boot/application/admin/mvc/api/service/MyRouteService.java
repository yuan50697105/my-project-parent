//package org.myproject.boot.application.admin.mvc.api.service;
//
//import lombok.AllArgsConstructor;
//import org.myproject.boot.application.admin.api.api.RouteApi;
//import org.myproject.boot.application.admin.api.pojo.BServiceRoute;
//import org.myproject.boot.application.admin.mvc.api.converter.Converter;
//import org.myproject.boot.commons.route.RouteService;
//import org.myproject.boot.commons.route.pojo.UrlRoute;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * @program: my-boot-application-admin-01
// * @description:
// * @author: yuane
// * @create: 2020-07-02 21:40
// */
//@Service
//@AllArgsConstructor
//public class MyRouteService implements RouteService {
//    private final RouteApi routeApi;
//    private final Converter converter;
//
//    @Override
//    public List<UrlRoute> allRoutes() {
//        List<BServiceRoute> entities = routeApi.allRoutes();
//        return entities.stream().map(BServiceRoute::getUrl).distinct().map(UrlRoute::new).collect(Collectors.toList());
//    }
//
//    @Override
//    public void saveRoute(UrlRoute route) {
//        routeApi.saveRoute(converter.route(route));
//    }
//
//    @Override
//    public void saveRoutes(List<UrlRoute> routes) {
//        routeApi.saveRoute(converter.route(routes));
//    }
//}