package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.pojo.SysUserVo;
import org.myproject.boot.application.admin.db.service.business.BSysUserService;
import org.myproject.boot.mybatis.pojo.PageResult;
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
    private BSysUserService sysUserService;

    @GetMapping("data")
    public Result<?> data(SysUserQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        PageResult<SysUser> result = sysUserService.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping("list")
    public Result<?> list(SysUserQuery query) {
        List<SysUser> list = sysUserService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping("get")
    public Result<?> get(Long id) {
        SysUser sysUser = sysUserService.selectById(id);
        return ResultInfo.success(sysUser);
    }

    @PostMapping("save")
    public Result<?> save(@RequestBody @Validated SysUserVo sysUserVo) {
        sysUserService.save(sysUserVo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.POST, RequestMethod.PUT})
    public Result<?> update(@RequestBody @Validated SysUserVo sysUserVo) {
        sysUserService.update(sysUserVo);
        return ResultInfo.success();
    }

    @GetMapping(value = "delete", params = "ids")
    public Result<?> delete(List<Long> ids) {
        sysUserService.delete(ids);
        return ResultInfo.success();
    }

    @GetMapping(value = "delete", params = "id")
    public Result<?> delete(Long id) {
        sysUserService.delete(id);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        sysUserService.delete(id);
        return ResultInfo.success();
    }
}