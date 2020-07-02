package org.myproject.boot.commons.route;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-28 21:35
 */
@ConditionalOnClass(RouteService.class)
@Configuration
@ComponentScan(basePackageClasses = RouteConfiguration.class)
public class RouteConfiguration {
}