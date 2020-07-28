package org.myproject.boot.application.admin.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-27 22:05
 */
@SpringBootConfiguration
@ComponentScan
@MapperScan(basePackages = "org.myproject.boot.application.admin.db.mapper")
public class DbConfiguration {
}