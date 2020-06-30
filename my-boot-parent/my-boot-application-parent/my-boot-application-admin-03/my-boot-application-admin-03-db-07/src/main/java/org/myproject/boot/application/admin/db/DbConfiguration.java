package org.myproject.boot.application.admin.db;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-29 22:28
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = DbConfiguration.class)
public class DbConfiguration {
}