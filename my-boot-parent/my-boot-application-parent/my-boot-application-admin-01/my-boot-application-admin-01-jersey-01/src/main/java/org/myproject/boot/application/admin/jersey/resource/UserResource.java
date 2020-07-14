package org.myproject.boot.application.admin.jersey.resource;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-12 09:07
 */
@Component
@Path("user")
public class UserResource {
    @GET
    @Path("aa")
    @Produces({MediaType.APPLICATION_JSON})
    public String aa() {
        return "aa";
    }
}