package org.myproject.cloud.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-17 11:48
 */
@EnableEurekaServer
@EnableCircuitBreaker
@SpringCloudApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}