package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.service.api.BSysRoleApi;
import org.myproject.boot.application.admin.service.pojo.SysRole;
import org.myproject.boot.application.admin.service.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.service.pojo.SysRoleVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
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
    public Result<?> data(SysRoleQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<SysRole> result = sysRoleApi.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping(value = "list")
    public Result<?> list(SysRoleQuery query) {
        List<SysRole> list = sysRoleApi.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping(value = "get")
    public Result<?> getOne(Long id) {
        SysRole sysUser = sysRoleApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @GetMapping("{id}")
    public Result<?> get(@PathVariable Long id) {
        SysRole sysUser = sysRoleApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @PostMapping
    public Result<?> save(@RequestBody @Validated SysRoleVo sysUserVo) {
        sysRoleApi.save(sysUserVo);
        return ResultInfo.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody @Validated SysRoleVo sysUserVo) {
        sysRoleApi.update(sysUserVo);
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