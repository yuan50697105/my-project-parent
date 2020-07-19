package org.myproject.boot.application.admin.mvc.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.mvc.api.converter.Converter;
import org.myproject.boot.application.admin.mvc.api.pojo.VSysUserVo;
import org.myproject.boot.application.admin.api.api.BSysUserApi;
import org.myproject.boot.application.admin.api.pojo.BSysUser;
import org.myproject.boot.application.admin.api.pojo.BSysUserQuery;
import org.myproject.boot.application.admin.api.pojo.BSysUserVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.crypto.interfaces.PBEKey;
import java.util.ArrayList;
import java.util.Arrays;
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
    public Result<?> data(BSysUserQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<BSysUser> result = sysUserService.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping(value = "list")
    public Result<?> list(BSysUserQuery query) {
        List<BSysUser> list = sysUserService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping(value = "get")
    public Result<?> getOne(Long id) {
        BSysUser BSysUser = sysUserService.get(id);
        return ResultInfo.success(BSysUser);
    }

    @GetMapping("{id}")
    public Result<?> get(@PathVariable Long id) {
        BSysUser BSysUser = sysUserService.get(id);
        return ResultInfo.success(BSysUser);
    }

    @PostMapping
    public Result<?> save(@RequestBody @Validated BSysUserVo sysUser) {
        sysUserService.save(sysUser);
        return ResultInfo.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody @Validated BSysUserVo BSysUserVo) {
        sysUserService.update(BSysUserVo);
        return ResultInfo.success();
    }

    @PatchMapping
    public Result<?> modify(@RequestBody @Validated BSysUserVo BSysUserVo) {
        sysUserService.modify(BSysUserVo);
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

    @PostMapping("add")
    public Result<?> add(@RequestBody VSysUserVo sysUser) {
        sysUser.setOp(BSysUserVo.Op.ADD);
        return save(converter.vSysUser(sysUser));
    }

    @PatchMapping("info")
    public Result<?> modifyInfo(@RequestBody VSysUserVo sysUser) {
        sysUser.setOp(BSysUserVo.Op.UPDATE_INFO);
        return modify(converter.vSysUser(sysUser));
    }

    @PatchMapping("role")
    public Result<?> modifyRole(@RequestBody VSysUserVo sysUserVo) {
        sysUserVo.setOp(BSysUserVo.Op.UPDATE_ROLE);
        return modify(converter.vSysUser(sysUserVo));
    }
}