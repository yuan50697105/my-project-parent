package org.myproject.boot.application.admin.jersey;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-12 09:02
 */
@SpringBootConfiguration
@ComponentScan
public class JerseyConfiguration {
//    @Bean
//    public ApplicationListener<ContextRefreshedEvent> applicationListener(){
//        return contextRefreshedEvent -> {
//            ResourceConfig jerseyConfig = new ResourceConfig();
//            ApplicationContext context = contextRefreshedEvent.getApplicationContext();
//            Map<String, Object> beans = context.getBeansWithAnnotation(Path.class);
//            for (Map.Entry<String, Object> entry : beans.entrySet()) {
//                jerseyConfig.register(entry.getValue().getClass());
//            }
//        };
//    }
}