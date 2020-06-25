package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.base.pagehelper.service.SysUserService;
import org.myproject.mybatis.pagehelper.pojo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 19:06
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("data")
    public Result<?> data(SysUserQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        Page<SysUser> result = new Page<>(sysUserService.selectByQueryWithPage(page, size, query));
        return ResultInfo.success(result);
    }
}