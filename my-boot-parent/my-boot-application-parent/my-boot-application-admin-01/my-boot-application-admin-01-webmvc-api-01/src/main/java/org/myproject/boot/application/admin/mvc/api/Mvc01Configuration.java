package org.myproject.boot.application.admin.mvc.api;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-27 12:57
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = Mvc01Configuration.class)
public class Mvc01Configuration {

//    @Bean
//    public Docket createRestApi(){
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any()).build();
//    }
//
//    private ApiInfo apiInfo(){
//        return new ApiInfoBuilder()
//                .title("Kitty API Doc")
//                .description("This is a restful api document of Kitty.")
//                .version("1.0")
//                .build();
//    }
}