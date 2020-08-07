package org.myproject.boot.application.admin.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.api.pojo.*;
import org.myproject.boot.application.admin.api.service.SysUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-07 21:36
 */

@RestController
@RequestMapping("sys/users")
public class SysUsersController {
    @Autowired
    private SysUsersService sysUsersService;

    @GetMapping("/{id}")
    public Result<?> get(@PathVariable Long id) {
        SysUsersAo sysUsersAo = sysUsersService.get(id);
        return ResultInfo.success(sysUsersAo);
    }

    @GetMapping("/{userId}/roles")
    public Result<?> getRoles(@PathVariable("userId") Long userId) {
        List<SysRolesAo> roles = sysUsersService.getRoles(userId);
        return ResultInfo.success(roles);
    }

    @GetMapping("/{userId}/roles/{roleId}")
    public Result<?> getRoles(@PathVariable("userId") Long userId, @PathVariable("roleId") Long roleId) {
        List<SysRolesAo> roles = sysUsersService.getRoles(userId, roleId);
        return ResultInfo.success(roles);
    }

    @GetMapping(params = {"page", "limit"})
    public Result<?> list(SysUsersQuery query, int page, int limit) {
        IPages<SysUsersAo> iPages = sysUsersService.list(query, page, limit);
        return ResultInfo.success(iPages.getList(), iPages.getTotalRows());
    }

    @GetMapping
    public Result<?> list(SysUsersQuery query) {
        List<SysUsersAo> list = sysUsersService.list(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @PostMapping
    public Result<?> add(@RequestBody SysUsersVo sysUsersAo) {
        sysUsersService.add(sysUsersAo);
        return ResultInfo.success();
    }

    @PutMapping("/{id}")
    public Result<?> update(@PathVariable Long id, @RequestBody SysUsersVo sysUsersVo) {
        sysUsersService.update(sysUsersVo.withId(id));
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        sysUsersService.delete(id);
        return ResultInfo.success();
    }

}