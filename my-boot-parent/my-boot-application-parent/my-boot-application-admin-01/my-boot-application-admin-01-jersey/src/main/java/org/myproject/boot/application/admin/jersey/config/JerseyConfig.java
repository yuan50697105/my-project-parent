package org.myproject.boot.application.admin.jersey.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.myproject.boot.application.admin.jersey.resource.UserResource;
import org.springframework.stereotype.Component;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 19:15
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(UserResource.class);
    }
}