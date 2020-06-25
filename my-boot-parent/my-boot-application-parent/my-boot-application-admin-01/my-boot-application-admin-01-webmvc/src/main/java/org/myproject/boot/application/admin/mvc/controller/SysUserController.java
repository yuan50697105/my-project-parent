package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUserVo;
import org.myproject.boot.application.admin.db.base.pagehelper.service.SysUserService;
import org.myproject.boot.application.admin.db.base.pagehelper.converter.SysUserConverter;
import org.myproject.mybatis.pagehelper.pojo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 19:06
 */
@RestController
@RequestMapping("sys/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private SysUserConverter sysUserConverter;

    @GetMapping("data")
    public Result<?> data(SysUserQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        Page<SysUser> result = new Page<>(sysUserService.selectByQueryWithPage(page, size, query));
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping("list")
    public Result<?> list(SysUserQuery query) {
        List<SysUser> list = sysUserService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @PostMapping("save")
    public Result<?> save(@RequestBody @Validated SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.voToPo(sysUserVo);
        sysUserService.insert(sysUser);
        return ResultInfo.success();
    }
}