package org.myproject.boot.application.admin.mvc.api.service.impl;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.mvc.api.service.TestService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-24 09:51
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    @Async
    public Future<Result<?>> get() {
        return new AsyncResult<>(ResultInfo.success("成功"));
    }

}