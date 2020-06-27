package org.myproject.boot.webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-26 17:38
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = MvcConfiguration.class)
public class MvcConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(MvcConfiguration.class, args);
    }
}