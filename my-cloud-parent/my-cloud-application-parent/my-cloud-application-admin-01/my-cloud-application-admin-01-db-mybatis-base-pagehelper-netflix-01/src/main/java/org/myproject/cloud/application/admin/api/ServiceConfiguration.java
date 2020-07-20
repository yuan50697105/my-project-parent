package org.myproject.cloud.application.admin.api;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 21:12
 */
@SpringBootConfiguration
@ComponentScan(basePackages = {"org.myproject.cloud.application.admin.api"})
@EnableFeignClients(basePackages = {"org.myproject.cloud.application.admin.api.impl"})
public class ServiceConfiguration {
}