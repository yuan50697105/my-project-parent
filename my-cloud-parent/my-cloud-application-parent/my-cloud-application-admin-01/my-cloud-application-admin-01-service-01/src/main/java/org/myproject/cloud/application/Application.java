package org.myproject.cloud.application;

import org.myproject.cloud.application.service.BSysUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-17 23:44
 */
@SpringCloudApplication
@EnableFeignClients(basePackageClasses = BSysUserService.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}