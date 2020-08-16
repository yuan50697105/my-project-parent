package org.myproject.boot.application.admin.cxf;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.Map;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-26 12:40
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = CxfConfiguration.class)
public class CxfConfiguration {

    @Bean
    public ApplicationListener<ContextRefreshedEvent> applicationListener() {
        return contextRefreshedEvent -> {
            ApplicationContext context = contextRefreshedEvent.getApplicationContext();
            Map<String, Object> beans = context.getBeansWithAnnotation(WebService.class);
            for (Map.Entry<String, Object> entry : beans.entrySet()) {
                Endpoint.publish("/" + entry.getKey().replace("Impl", ""), entry.getValue());
            }

        };
    }
}