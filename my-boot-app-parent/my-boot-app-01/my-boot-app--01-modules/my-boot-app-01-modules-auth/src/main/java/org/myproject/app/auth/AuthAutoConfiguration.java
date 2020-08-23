package org.myproject.app.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 16:39
 */
@SpringBootConfiguration
@ComponentScan
@MapperScan(basePackages = "org.myproject.app.*.mapper")
public class AuthAutoConfiguration {
}