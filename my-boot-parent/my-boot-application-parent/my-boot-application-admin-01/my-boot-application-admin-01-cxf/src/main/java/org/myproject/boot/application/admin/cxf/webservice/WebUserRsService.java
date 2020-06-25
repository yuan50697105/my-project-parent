package org.myproject.boot.application.admin.cxf.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 18:28
 */
@Path("web/user/rs/service")
public interface WebUserRsService {
    String SERVICE_NAME = "WebUserRsService";

    @GET
    @Path("aa")
    String aa();
}
