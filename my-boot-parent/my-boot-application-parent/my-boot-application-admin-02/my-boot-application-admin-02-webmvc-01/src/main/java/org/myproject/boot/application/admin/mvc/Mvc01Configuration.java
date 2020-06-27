package org.myproject.boot.application.admin.mvc;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-27 12:57
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = Mvc01Configuration.class)
public class Mvc01Configuration {
}