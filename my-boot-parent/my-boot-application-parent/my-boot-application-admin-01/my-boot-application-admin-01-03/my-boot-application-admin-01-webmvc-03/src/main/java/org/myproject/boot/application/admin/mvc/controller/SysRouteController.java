package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.service.table.SysUserRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-30 18:11
 */
@RestController
@RequestMapping("sys/route")
public class SysRouteController {
    @Autowired
    private SysUserRouteService routeService;

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public Result<?> list(Long userId) {
        List<String> list = routeService.selectByUserId(userId);
        return ResultInfo.success(list);
    }
}