package org.myproject.boot.webmvc;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-26 17:38
 */
@SpringBootConfiguration
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
@ComponentScan(basePackageClasses = MvcConfiguration.class)
public class MvcConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(MvcConfiguration.class, args);
    }
}