package org.myproject.boot.application.admin.mvc.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.mvc.api.converter.Converter;
import org.myproject.boot.application.admin.service.api.BSysUserApi;
import org.myproject.boot.application.admin.service.pojo.SysUser;
import org.myproject.boot.application.admin.service.pojo.SysUserQuery;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;
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
@RequestMapping("sys/user")
public class SysUserController {
    @Autowired
    private BSysUserApi sysUserService;
    @Autowired
    private Converter converter;

    @GetMapping(value = "data")
    public Result<?> data(SysUserQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<SysUser> result = sysUserService.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping(value = "list")
    public Result<?> list(SysUserQuery query) {
        List<SysUser> list = sysUserService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping(value = "get")
    public Result<?> getOne(Long id) {
        SysUser sysUser = sysUserService.get(id);
        return ResultInfo.success(sysUser);
    }

    @GetMapping("{id}")
    public Result<?> get(@PathVariable Long id) {
        SysUser sysUser = sysUserService.get(id);
        return ResultInfo.success(sysUser);
    }

    @PostMapping
    public Result<?> save(@RequestBody @Validated SysUserVo sysUserVo) {
        sysUserService.save(sysUserVo);
        return ResultInfo.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody @Validated SysUserVo sysUserVo) {
        sysUserService.update(sysUserVo);
        return ResultInfo.success();
    }

    @PatchMapping
    public Result<?> modify(@RequestBody @Validated SysUserVo sysUserVo) {
        sysUserService.modify(sysUserVo);
        return ResultInfo.success();
    }

    @DeleteMapping(params = "ids")
    public Result<?> deleteList(List<Long> ids) {
        sysUserService.delete(ids);
        return ResultInfo.success();
    }

    @DeleteMapping(params = "id")
    public Result<?> deleteOne(Long id) {
        sysUserService.delete(id);
        return ResultInfo.success();
    }

    @DeleteMapping("{id}")
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        sysUserService.delete(id);
        return ResultInfo.success();
    }
}