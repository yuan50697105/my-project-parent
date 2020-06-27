package org.myproject.boot.application.admin.cxf.webservice;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUser;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;

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

    @POST
    @Path("save")
    Result<?> save(@Context SysUser sysUser);
}
