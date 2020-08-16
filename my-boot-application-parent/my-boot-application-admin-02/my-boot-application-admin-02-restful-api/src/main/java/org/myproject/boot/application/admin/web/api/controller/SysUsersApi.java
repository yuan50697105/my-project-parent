package org.myproject.boot.application.admin.web.api.controller;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersQuery;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersVo;
import org.springframework.web.bind.annotation.*;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 15:35
 */
@RequestMapping("sys/users")
public interface SysUsersApi {
    @GetMapping("/{id}")
    Result<?> get(@PathVariable Long id);

    @GetMapping("/{userId}/roles")
    Result<?> getRoles(@PathVariable("userId") Long userId);

    @GetMapping("/{userId}/roles/{roleId}")
    Result<?> getRoles(@PathVariable("userId") Long userId, @PathVariable("roleId") Long roleId);

    @GetMapping(value = {"", "/list"}, params = {"page", "limit"})
    Result<?> list(SysUsersQuery query, int page, int limit);

    @GetMapping({"", "/list"})
    Result<?> list(SysUsersQuery query);

    @PostMapping({""})
    Result<?> add(@RequestBody SysUsersVo sysUsersAo);

    @PutMapping({"/{id}"})
    Result<?> update(@PathVariable Long id, @RequestBody SysUsersVo sysUsersVo);

    @DeleteMapping({"/{id}"})
    Result<?> delete(@PathVariable Long id);
}
