package org.myproject.boot.commons.route;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-28 21:25
 */
public interface RouteService {
    List<Route> selectAllRoutes();

    void saveRoute(Route route);
}