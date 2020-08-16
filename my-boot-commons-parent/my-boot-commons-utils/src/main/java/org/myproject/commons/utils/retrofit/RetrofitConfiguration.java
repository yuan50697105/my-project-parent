package org.myproject.commons.utils.retrofit;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-21 15:48
 */
@SpringBootConfiguration
@ComponentScan
public class RetrofitConfiguration {
    @Bean
    RxJava3CallAdapterFactory rxJava3CallAdapterFactory() {
        return RxJava3CallAdapterFactory.create();
    }
}