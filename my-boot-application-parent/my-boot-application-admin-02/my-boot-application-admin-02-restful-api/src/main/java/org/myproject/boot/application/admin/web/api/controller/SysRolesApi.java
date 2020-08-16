package org.myproject.boot.application.admin.web.api.controller;

import ai.yue.library.base.view.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 15:34
 */
@RequestMapping("sys/roles")
public interface SysRolesApi {
    @GetMapping("/{id}")
    Result<?> get(@PathVariable Long id);
}
