package org.myproject.boot.application.admin.web.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersQuery;
import org.myproject.boot.application.admin.web.api.service.SysUsersService;
import org.myproject.boot.application.admin.web.api.pojo.SysRolesAo;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersAo;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersVo;
import org.myproject.boot.application.commons.pojo.IPage;
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
public class SysUsersController implements SysUsersApi {
    @Autowired
    private SysUsersService sysUsersService;

    @Override
    @GetMapping("/{id}")
    public Result<?> get(@PathVariable Long id) {
        SysUsersAo sysUsersAo = sysUsersService.get(id);
        return ResultInfo.success(sysUsersAo);
    }

    @Override
    @GetMapping("/{userId}/roles")
    public Result<?> getRoles(@PathVariable("userId") Long userId) {
        List<SysRolesAo> roles = sysUsersService.getRoles(userId);
        return ResultInfo.success(roles);
    }

    @Override
    @GetMapping("/{userId}/roles/{roleId}")
    public Result<?> getRoles(@PathVariable("userId") Long userId, @PathVariable("roleId") Long roleId) {
        List<SysRolesAo> roles = sysUsersService.getRoles(userId, roleId);
        return ResultInfo.success(roles);
    }

    @Override
    @GetMapping(value = {"","/list"},params = {"page", "limit"})
    public Result<?> list(SysUsersQuery query, int page, int limit) {
        IPage<SysUsersAo> iPage = sysUsersService.list(query, page, limit);
        return ResultInfo.success(iPage.getList(), iPage.getTotalRows());
    }

    @Override
    @GetMapping({"","/list"})
    public Result<?> list(SysUsersQuery query) {
        List<SysUsersAo> list = sysUsersService.list(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @Override
    @PostMapping({""})
    public Result<?> add(@RequestBody SysUsersVo sysUsersAo) {
        sysUsersService.add(sysUsersAo);
        return ResultInfo.success();
    }

    @Override
    @PutMapping({"/{id}"})
    public Result<?> update(@PathVariable Long id, @RequestBody SysUsersVo sysUsersVo) {
        sysUsersVo.setId(id);
        sysUsersService.update(sysUsersVo);
        return ResultInfo.success();
    }

    @Override
    @DeleteMapping({"/{id}"})
    public Result<?> delete(@PathVariable Long id) {
        sysUsersService.delete(id);
        return ResultInfo.success();
    }

}