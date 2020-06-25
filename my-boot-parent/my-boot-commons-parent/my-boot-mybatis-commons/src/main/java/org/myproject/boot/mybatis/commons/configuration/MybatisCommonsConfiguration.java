package org.myproject.boot.mybatis.commons.configuration;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 00:11
 */
@SpringBootConfiguration
@AutoConfigureAfter(MybatisAutoConfiguration.class)
public class MybatisCommonsConfiguration {
}