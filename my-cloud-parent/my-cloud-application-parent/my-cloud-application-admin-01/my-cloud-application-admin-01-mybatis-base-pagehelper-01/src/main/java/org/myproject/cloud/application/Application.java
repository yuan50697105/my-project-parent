package org.myproject.cloud.application;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-13 00:07
 */
@EnableCircuitBreaker
@SpringCloudApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}