package org.myproject.boot.application.admin.service;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 21:12
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = ServiceConfiguration.class)
public class ServiceConfiguration {
}