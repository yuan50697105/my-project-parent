package org.myproject.boot.application.admin.mvc;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.minbox.framework.api.boot.autoconfigure.swagger.annotation.EnableApiBootSwagger;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-27 12:57
 */
@SpringBootConfiguration
@EnableApiBootSwagger
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
@ComponentScan(basePackageClasses = Mvc01Configuration.class)
public class Mvc01Configuration {
}