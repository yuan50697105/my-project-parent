package org.myproject.commons.utils;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-boot-commons-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-04 17:11
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = CommonsUtilsConfiguration.class)
public class CommonsUtilsConfiguration {
}