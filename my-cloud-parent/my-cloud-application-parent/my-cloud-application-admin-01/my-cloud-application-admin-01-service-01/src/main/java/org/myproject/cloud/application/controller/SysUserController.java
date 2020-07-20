package org.myproject.cloud.application.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.cloud.application.admin.api.pojo.BSysUser;
import org.myproject.cloud.application.admin.api.pojo.BSysUserQuery;
import org.myproject.cloud.application.admin.api.pojo.IPage;
import org.myproject.cloud.application.service.BSysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-17 23:45
 */
@RestController
@RequestMapping("sys/user")
public class SysUserController {
    @Autowired
    private BSysUserService sysUserService;

    @GetMapping("data")
    public Result<?> data(BSysUserQuery query) {
        IPage<BSysUser> iPage = sysUserService.selectPageByQuery(query);
        return ResultInfo.success(iPage.getData(), iPage.getTotalRows());
    }

}