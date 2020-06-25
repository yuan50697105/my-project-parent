package org.myproject.boot.application.admin.jersey.resource;

import org.myproject.boot.application.admin.jersey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 19:10
 */
@Component
@Path("user")
public class UserResource {
    @Autowired
    private UserService userService;

    @GET
    @Path("hello")
    public String hello(){
        return userService.hello();
    }

}