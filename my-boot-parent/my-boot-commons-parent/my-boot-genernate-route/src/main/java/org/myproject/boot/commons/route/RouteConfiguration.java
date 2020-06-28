package org.myproject.boot.commons.route;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-28 21:35
 */
@Configuration
@ComponentScan(basePackageClasses = RouteConfiguration.class)
public class RouteConfiguration {
}