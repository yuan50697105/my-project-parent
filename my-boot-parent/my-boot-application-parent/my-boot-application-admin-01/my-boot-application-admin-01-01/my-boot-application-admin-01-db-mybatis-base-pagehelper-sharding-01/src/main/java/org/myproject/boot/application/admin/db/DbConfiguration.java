package org.myproject.boot.application.admin.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 19:47
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = DbConfiguration.class)
@MapperScan(basePackageClasses = DbConfiguration.class)
public class DbConfiguration {
}