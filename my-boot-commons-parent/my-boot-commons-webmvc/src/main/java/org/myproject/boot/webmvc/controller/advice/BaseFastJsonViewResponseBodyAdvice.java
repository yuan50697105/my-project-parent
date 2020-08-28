package org.myproject.boot.webmvc.controller.advice;

import com.alibaba.fastjson.support.spring.FastJsonViewResponseBodyAdvice;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-27 16:02
 */
@Component
@RestControllerAdvice
public class BaseFastJsonViewResponseBodyAdvice extends FastJsonViewResponseBodyAdvice {
}