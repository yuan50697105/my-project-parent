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
@ComponentScan
@MapperScan
public class DbConfiguration {
}