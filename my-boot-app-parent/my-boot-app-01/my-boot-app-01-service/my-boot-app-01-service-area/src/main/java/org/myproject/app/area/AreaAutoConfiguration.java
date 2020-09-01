package org.myproject.app.area;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 20:42
 */
@SpringBootConfiguration
@EnableCaching
@ComponentScan
@MapperScan(basePackages = "org.myproject.app.db.area.mapper")
public class AreaAutoConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(AreaAutoConfiguration.class, args);
    }
}