package org.myproject.boot.application.price.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-boot-application-admin-02-modules
 * @description:
 * @author: yuane
 * @create: 2020-08-17 20:53
 */
@SpringBootConfiguration
@ComponentScan
@MapperScan(basePackages = "org.myproject.boot.application.price.db.mapper")
public class DbConfiguration {
}