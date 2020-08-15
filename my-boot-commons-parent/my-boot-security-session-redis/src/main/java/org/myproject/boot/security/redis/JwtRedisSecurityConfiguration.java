package org.myproject.boot.security.redis;

import org.myproject.boot.security.JwtSecurityConfiguration;
import org.myproject.boot.security.service.UserDetailsAndRouteService;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 23:00
 */
@SpringBootConfiguration
@ConditionalOnBean(UserDetailsAndRouteService.class)
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, jsr250Enabled = true, securedEnabled = true)
@ComponentScan(basePackageClasses = JwtSecurityConfiguration.class)
public class JwtRedisSecurityConfiguration extends JwtSecurityConfiguration {
}