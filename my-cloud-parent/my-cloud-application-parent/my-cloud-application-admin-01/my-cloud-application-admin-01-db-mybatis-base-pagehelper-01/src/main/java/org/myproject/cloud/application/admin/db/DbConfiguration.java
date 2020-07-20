package org.myproject.cloud.application.admin.db;

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
@ComponentScan(basePackages = {"org.myproject.cloud.application.admin.db"})
@MapperScan(basePackages = {"org.myproject.cloud.application.admin.db.mapper"})
public class DbConfiguration {
}