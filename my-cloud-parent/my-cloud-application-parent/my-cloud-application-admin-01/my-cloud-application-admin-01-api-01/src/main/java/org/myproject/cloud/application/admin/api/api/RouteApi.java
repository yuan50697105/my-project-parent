package org.myproject.cloud.application.admin.api.api;


import org.myproject.cloud.application.admin.api.pojo.BServiceRoute;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 20:23
 */
public interface RouteApi {
    List<BServiceRoute> allRoutes();

    void saveRoute(BServiceRoute BServiceRoute);

    void saveRoute(List<BServiceRoute> BServiceRoute);
}
