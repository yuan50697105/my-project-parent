package org.myproject.boot.commons.route;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
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
public class ContextInitRouteListCommand implements ApplicationRunner {
    @Autowired
    private ApplicationContext context;
    @Autowired
    private RouteService routeService;


    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        Map<String, Object> beans = context.getBeansWithAnnotation(Controller.class);
        ArrayList<String> routes = new ArrayList<>();
        beans.putAll(context.getBeansWithAnnotation(RestController.class));
        List<String> adminRoutes = new ArrayList<>();
        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            Object value = entry.getValue();
            if (AopUtils.isAopProxy(value)) {
                Class<?> targetClass = AopUtils.getTargetClass(value);
                List<String> routeList = createControllerRoute(targetClass);
                adminRoutes.addAll(routeList);
            } else {
                List<String> routeList = createControllerRoute(value.getClass());
                adminRoutes.addAll(routeList);
            }
        }
        List<Route> routeList = routeService.selectAllRoutes();
        List<String> routeUrlList = routeList.stream().map(Route::getUrl).collect(Collectors.toList());
        adminRoutes = adminRoutes.stream().distinct().collect(Collectors.toList());
        if (routeUrlList.size() > 0) {
            for (String adminRoute : adminRoutes) {
                if (!routeUrlList.contains(adminRoute)) {
                    Route route = new Route();
                    route.setUrl(adminRoute);
                    routeService.saveRoute(route);
                }
            }
        } else {
            for (String adminRoute : adminRoutes) {
                Route route = new Route();
                route.setUrl(adminRoute);
                routeService.saveRoute(route);
            }
        }

    }

    private List<String> createControllerRoute(Class<?> targetClass) {
        ArrayList<String> adminRoutes = new ArrayList<>();
        String[] urls = null;
        if (targetClass.isAnnotationPresent(RequestMapping.class)) {
            urls = targetClass.getAnnotation(RequestMapping.class).value();
        } else if (targetClass.isAnnotationPresent(GetMapping.class)) {
            urls = targetClass.getAnnotation(GetMapping.class).value();
        } else if (targetClass.isAnnotationPresent(PostMapping.class)) {
            urls = targetClass.getAnnotation(PostMapping.class).value();
        } else if (targetClass.isAnnotationPresent(DeleteMapping.class)) {
            urls = targetClass.getAnnotation(DeleteMapping.class).value();
        } else if (targetClass.isAnnotationPresent(PutMapping.class)) {
            urls = targetClass.getAnnotation(PutMapping.class).value();
        } else if (targetClass.isAnnotationPresent(PatchMapping.class)) {
            urls = targetClass.getAnnotation(PatchMapping.class).value();
        }
        if (urls != null && urls.length > 0) {
            for (String url : urls) {
                createControllerMethodUrl(targetClass, adminRoutes, url);
            }
        } else {
            createControllerMethodUrl(targetClass, adminRoutes, "");
        }
        return adminRoutes;
    }

    private void createControllerMethodUrl(Class<?> targetClass, ArrayList<String> adminRoutes, String url) {
        for (Method method : targetClass.getMethods()) {
            String[] methodUrls = null;
            if (AopUtils.isAopProxy(method)) {
                Class<?> methodTargetClass = AopUtils.getTargetClass(method);
                if (methodTargetClass.isAnnotationPresent(RequestMapping.class)) {
                    methodUrls = methodTargetClass.getAnnotation(RequestMapping.class).value();
                } else if (methodTargetClass.isAnnotationPresent(GetMapping.class)) {
                    methodUrls = methodTargetClass.getAnnotation(GetMapping.class).value();
                } else if (methodTargetClass.isAnnotationPresent(PostMapping.class)) {
                    methodUrls = methodTargetClass.getAnnotation(PostMapping.class).value();
                } else if (methodTargetClass.isAnnotationPresent(DeleteMapping.class)) {
                    methodUrls = methodTargetClass.getAnnotation(DeleteMapping.class).value();
                } else if (methodTargetClass.isAnnotationPresent(PutMapping.class)) {
                    methodUrls = methodTargetClass.getAnnotation(PutMapping.class).value();
                } else if (targetClass.isAnnotationPresent(PatchMapping.class)) {
                    methodUrls = methodTargetClass.getAnnotation(PatchMapping.class).value();
                }
            } else {
                if (method.isAnnotationPresent(RequestMapping.class)) {
                    methodUrls = method.getAnnotation(RequestMapping.class).value();
                } else if (method.isAnnotationPresent(GetMapping.class)) {
                    methodUrls = method.getAnnotation(GetMapping.class).value();
                } else if (method.isAnnotationPresent(PostMapping.class)) {
                    methodUrls = method.getAnnotation(PostMapping.class).value();
                } else if (method.isAnnotationPresent(DeleteMapping.class)) {
                    methodUrls = method.getAnnotation(DeleteMapping.class).value();
                } else if (method.isAnnotationPresent(PutMapping.class)) {
                    methodUrls = method.getAnnotation(PutMapping.class).value();
                } else if (targetClass.isAnnotationPresent(PatchMapping.class)) {
                    methodUrls = method.getAnnotation(PatchMapping.class).value();
                }
            }
            if (methodUrls != null) {
                for (String methodUrl : methodUrls) {
                    adminRoutes.add(url + "/" + methodUrl);
                }
            } else {
                adminRoutes.add(url);
            }
        }
    }
}