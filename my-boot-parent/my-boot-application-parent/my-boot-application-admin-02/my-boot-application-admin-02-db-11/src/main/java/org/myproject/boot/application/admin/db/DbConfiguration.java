package org.myproject.boot.application.admin.db;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-04 01:03
 */
@SpringBootConfiguration
@ComponentScan(basePackages = "org.myproject.boot.application.admin.db")
@MapperScan(basePackages = "org.myproject.boot.application.admin.db.mapper")
public class DbConfiguration {
}