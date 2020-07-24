package org.myproject.boot.application.admin.mvc.api.service;

import ai.yue.library.base.view.Result;

import java.util.concurrent.Future;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-24 09:49
 */
public interface TestService {
    Future<Result<?>> get();
}
