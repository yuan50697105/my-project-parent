package org.myproject.boot.commons.route;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-26 17:03
 */
@ConditionalOnClass(RouteService.class)
@Component
@Slf4j
public class ContextInitRouteListCommand implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;
    @Autowired
    private RouteService routeService;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        log.info("自动加载路由");
        ArrayList<Route> sysRoutes = new ArrayList<>();
        Map<String, Object> beans = context.getBeansWithAnnotation(Controller.class);
        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value.getClass().isAnnotationPresent(RequestMapping.class)) {
                RequestMapping annotation = value.getClass().getAnnotation(RequestMapping.class);
                String[] urls = annotation.value();
                for (String baseUrl : urls) {
                    for (Method method : value.getClass().getMethods()) {
                        RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                Route route = new Route();
                                route.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(route);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        GetMapping requestMapping = method.getAnnotation(GetMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                Route route = new Route();
                                route.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(route);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        PostMapping requestMapping = method.getAnnotation(PostMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                Route route = new Route();
                                route.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(route);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        DeleteMapping requestMapping = method.getAnnotation(DeleteMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                Route route = new Route();
                                route.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(route);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        PutMapping requestMapping = method.getAnnotation(PutMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                Route route = new Route();
                                route.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(route);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        PatchMapping requestMapping = method.getAnnotation(PatchMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                Route route = new Route();
                                route.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(route);
                            }
                        }
                    }

                }
            }
        }
        List<Route> routes = routeService.selectAllRoutes();
        List<String> routeUrls = routes.stream().map(Route::getUrl).collect(Collectors.toList());
        List<Route> routeList = sysRoutes.stream().filter(route -> !routeUrls.contains(route.getUrl())).collect(Collectors.toList());
        for (Route route : routeList) {
            routeService.saveRoute(route);
        }
        log.info("加载路由完毕");
    }
}