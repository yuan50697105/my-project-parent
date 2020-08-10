package org.myproject.boot.application.goods.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-04 01:03
 */
@SpringBootConfiguration
@ComponentScan(basePackages = "org.myproject.boot.application.goods.service")
public class ServiceConfiguration {
}