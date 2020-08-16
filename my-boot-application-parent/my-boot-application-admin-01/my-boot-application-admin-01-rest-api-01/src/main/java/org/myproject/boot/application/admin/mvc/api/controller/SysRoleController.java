package org.myproject.boot.application.admin.mvc.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.api.api.BSysRoleApi;
import org.myproject.boot.application.admin.api.pojo.BSysRole;
import org.myproject.boot.application.admin.api.pojo.BSysRoleQuery;
import org.myproject.boot.application.admin.api.pojo.BSysRoleVo;
import org.myproject.boot.application.admin.api.pojo.IPage;
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
@RequestMapping("sys/role")
public class SysRoleController {
    @Autowired
    private BSysRoleApi sysRoleApi;

    @GetMapping(value = "data")
    public Result<?> data(BSysRoleQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<BSysRole> result = sysRoleApi.selectByQuery(query, page, size);
        return ResultInfo.success(result.getTotalRows(), result.getData());
    }

    @GetMapping(value = "list")
    public Result<?> list(BSysRoleQuery query) {
        List<BSysRole> list = sysRoleApi.selectByQuery(query);
        return ResultInfo.success((long) list.size(), list);
    }

    @GetMapping(value = "get", params = "id")
    public Result<?> getOne(Long id) {
        BSysRole sysUser = sysRoleApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @GetMapping("{id}")
    public Result<?> get(@PathVariable Long id) {
        BSysRole sysUser = sysRoleApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @PostMapping
    public Result<?> save(@RequestBody @Validated BSysRoleVo sysUserVo) {
        sysRoleApi.save(sysUserVo);
        return ResultInfo.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody @Validated BSysRoleVo sysUserVo) {
        sysUserVo.setOp(BSysRoleVo.Op.UPDATE);
        sysRoleApi.update(sysUserVo);
        return ResultInfo.success();
    }

    @PutMapping("route")
    public Result<?> updateRoute(@RequestBody @Validated BSysRoleVo sysRoleVo) {
        sysRoleVo.setOp(BSysRoleVo.Op.UPDATE_ROUTE);
        sysRoleApi.update(sysRoleVo);
        return ResultInfo.success();
    }

    @PutMapping("info")
    public Result<?> updateInfo(@RequestBody @Validated BSysRoleVo sysRoleVo) {
        sysRoleVo.setOp(BSysRoleVo.Op.UPDATE_INFO);
        sysRoleApi.update(sysRoleVo);
        return ResultInfo.success();
    }

    @DeleteMapping(params = "ids")
    public Result<?> deleteList(List<Long> ids) {
        sysRoleApi.delete(ids);
        return ResultInfo.success();
    }

    @DeleteMapping(params = "id")
    public Result<?> deleteOne(Long id) {
        sysRoleApi.delete(id);
        return ResultInfo.success();
    }

    @DeleteMapping("{id}")
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        sysRoleApi.delete(id);
        return ResultInfo.success();
    }
}