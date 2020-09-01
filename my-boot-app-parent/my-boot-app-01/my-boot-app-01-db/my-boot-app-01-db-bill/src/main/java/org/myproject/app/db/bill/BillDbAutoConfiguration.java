package org.myproject.app.db.bill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-spring
 * @description:
 * @author: yuane
 * @create: 2020-09-01 23:57
 */
@SpringBootConfiguration
@ComponentScan
@MapperScan(basePackages = "org.myproject.app.db.*.mapper")
public class BillDbAutoConfiguration {
}