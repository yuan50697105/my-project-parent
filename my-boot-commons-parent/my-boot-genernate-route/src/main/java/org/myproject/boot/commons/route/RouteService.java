package org.myproject.boot.commons.route;

import org.myproject.boot.commons.route.pojo.UrlRoute;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-28 21:25
 */
public interface RouteService {
    List<UrlRoute> allRoutes();

    void saveRoute(UrlRoute route);

    @Transactional
    default void saveRoutes(List<UrlRoute> routes) {
        for (UrlRoute route : routes) {
            saveRoute(route);
        }
    }
}