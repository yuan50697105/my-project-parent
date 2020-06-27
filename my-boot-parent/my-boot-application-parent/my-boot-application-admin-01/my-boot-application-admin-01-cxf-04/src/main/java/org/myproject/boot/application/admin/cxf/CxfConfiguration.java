package org.myproject.boot.application.admin.cxf;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-26 12:40
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = CxfConfiguration.class)
public class CxfConfiguration {
}