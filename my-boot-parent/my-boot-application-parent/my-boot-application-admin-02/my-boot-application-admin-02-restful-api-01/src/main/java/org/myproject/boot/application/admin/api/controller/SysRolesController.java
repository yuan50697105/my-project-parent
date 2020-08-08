package org.myproject.boot.application.admin.api.controller;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.admin.api.pojo.SysRolesAo;
import org.myproject.boot.application.admin.api.service.SysRolesService;
import org.myproject.boot.application.admin.service.pojo.SysRoleAoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-08 19:48
 */
@RestController
@RequestMapping("sys/roles")
public class SysRolesController {
    @Autowired
    private SysRolesService sysRolesService;

    @GetMapping("/{id}")
    public Result<?> get(@PathVariable Long id) {
        sysRolesService.get(id);
    }
}