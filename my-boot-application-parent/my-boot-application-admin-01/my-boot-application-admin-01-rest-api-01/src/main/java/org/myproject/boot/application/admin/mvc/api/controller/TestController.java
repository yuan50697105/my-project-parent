package org.myproject.boot.application.admin.mvc.api.controller;

import ai.yue.library.base.view.Result;
import io.reactivex.rxjava3.core.Single;
import org.myproject.boot.application.admin.mvc.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-24 09:50
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping
    public Single<Result<?>> test() {
        return Single.fromFuture(testService.get());
    }
}