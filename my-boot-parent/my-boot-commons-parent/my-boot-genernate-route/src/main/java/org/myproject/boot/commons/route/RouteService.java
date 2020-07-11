package org.myproject.boot.commons.route;

import org.myproject.boot.commons.route.pojo.Route;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-28 21:25
 */
public interface RouteService {
    List<Route> allRoutes();

    void saveRoute(Route route);

    @Transactional
    default void saveRoutes(List<Route> routes) {
        for (Route route : routes) {
            saveRoute(route);
        }
    }
}