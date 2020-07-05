package org.myproject.boot.application.admin.mvc.command;

import lombok.extern.slf4j.Slf4j;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;
import org.myproject.boot.application.admin.db.service.SysRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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
@Component
@Slf4j
public class ContextInitRouteListCommand implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;
    @Autowired
    private SysRouteService sysRouteService;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        log.info("自动加载路由");
        ArrayList<SysRoute> sysRoutes = new ArrayList<>();
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
                                SysRoute sysRoute = new SysRoute();
                                sysRoute.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        GetMapping requestMapping = method.getAnnotation(GetMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                SysRoute sysRoute = new SysRoute();
                                sysRoute.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        PostMapping requestMapping = method.getAnnotation(PostMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                SysRoute sysRoute = new SysRoute();
                                sysRoute.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        DeleteMapping requestMapping = method.getAnnotation(DeleteMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                SysRoute sysRoute = new SysRoute();
                                sysRoute.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        PutMapping requestMapping = method.getAnnotation(PutMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                SysRoute sysRoute = new SysRoute();
                                sysRoute.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }
                    for (Method method : value.getClass().getMethods()) {
                        PatchMapping requestMapping = method.getAnnotation(PatchMapping.class);
                        if (requestMapping != null) {
                            for (String url : requestMapping.value()) {
                                SysRoute sysRoute = new SysRoute();
                                sysRoute.setUrl(baseUrl + "/" + url.replaceFirst("/", ""));
                                sysRoutes.add(sysRoute);
                            }
                        }
                    }

                }
            }
        }
        List<SysRoute> routes = sysRouteService.selectByExample(new SysRouteExample());
        List<String> routeUrls = routes.stream().map(SysRoute::getUrl).collect(Collectors.toList());
        List<SysRoute> sysRouteList = sysRoutes.stream().filter(sysRoute -> !routeUrls.contains(sysRoute.getUrl())).collect(Collectors.toList());
        for (SysRoute sysRoute : sysRouteList) {
            sysRouteService.save(sysRoute);
        }
        log.info("加载路由完毕");
    }
}