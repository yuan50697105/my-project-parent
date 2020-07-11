package org.myproject.boot.application.admin.service.api;

import org.myproject.boot.application.admin.service.pojo.ServiceRoute;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 20:23
 */
public interface RouteApi {
    List<ServiceRoute> allRoutes();

    void saveRoute(ServiceRoute serviceRoute);

    void saveRoute(List<ServiceRoute> serviceRoute);
}
