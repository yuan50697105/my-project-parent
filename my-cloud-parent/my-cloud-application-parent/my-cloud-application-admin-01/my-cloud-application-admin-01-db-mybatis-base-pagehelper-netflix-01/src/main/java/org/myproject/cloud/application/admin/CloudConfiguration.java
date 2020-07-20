package org.myproject.cloud.application.admin;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-20 11:51
 */
@SpringBootConfiguration
@ComponentScan

public class CloudConfiguration {
}