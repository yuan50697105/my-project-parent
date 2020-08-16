package org.myproject.boot.application.admin.web.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.web.api.service.SysRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-08 19:48
 */
@RestController
public class SysRolesController implements SysRolesApi {
    @Autowired
    private SysRolesService sysRolesService;

    @Override
    public Result<?> get(@PathVariable Long id) {
        sysRolesService.get(id);
        return ResultInfo.success();
    }
}