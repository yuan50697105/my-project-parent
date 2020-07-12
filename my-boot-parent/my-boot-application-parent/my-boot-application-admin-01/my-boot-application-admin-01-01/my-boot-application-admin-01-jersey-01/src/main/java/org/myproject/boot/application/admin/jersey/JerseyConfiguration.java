package org.myproject.boot.application.admin.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.ws.rs.Path;
import java.util.Map;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-12 09:02
 */
@SpringBootConfiguration
@ComponentScan
public class JerseyConfiguration {
    @Bean
    public ApplicationListener<ContextRefreshedEvent> applicationListener(){
        return contextRefreshedEvent -> {
            ResourceConfig jerseyConfig = new ResourceConfig();
            ApplicationContext context = contextRefreshedEvent.getApplicationContext();
            Map<String, Object> beans = context.getBeansWithAnnotation(Path.class);
            for (Map.Entry<String, Object> entry : beans.entrySet()) {
                jerseyConfig.register(entry.getValue().getClass());
            }
        };
    }
}