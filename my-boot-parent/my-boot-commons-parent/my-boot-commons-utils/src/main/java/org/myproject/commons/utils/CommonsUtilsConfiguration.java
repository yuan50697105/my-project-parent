package org.myproject.commons.utils;

import cn.hutool.extra.spring.SpringUtil;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @program: my-boot-commons-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-04 17:11
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = CommonsUtilsConfiguration.class)
@Import(SpringUtil.class)
public class CommonsUtilsConfiguration {
}