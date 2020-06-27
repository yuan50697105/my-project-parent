package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.mapper.plus.sqlhelper.converter.SysUserConverter;
import org.myproject.boot.application.admin.db.mapper.plus.sqlhelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.mapper.plus.sqlhelper.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.mapper.plus.sqlhelper.pojo.SysUserVo;
import org.myproject.boot.application.admin.db.mapper.plus.sqlhelper.service.SysUserService;
import org.myproject.mybatisplus.mapper.sqlhelper.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

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
        PageResult<SysUser> result = new PageResult<>(sysUserService.selectByQueryWithPage(page, size, query));
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping("data2")
    public Result<?> data2(SysUserQuery query,
                           @RequestParam(defaultValue = "1") int page,
                           @RequestParam(defaultValue = "20") int size) {
        PageResult<SysUser> userPageResult = new PageResult<>(sysUserService.pageByQuery(new com.baomidou.mybatisplus.extension.plugins.pagination.Page<>(page, size), query));
        return ResultInfo.success(userPageResult.getData(), userPageResult.getTotalRows());
    }

    @GetMapping("list")
    public Result<?> list(SysUserQuery query) {
        List<SysUser> list = sysUserService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping("list2")
    public Result<?> list2(SysUserQuery query) {
        List<SysUser> list = sysUserService.listByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping("get")
    public Result<?> get(Long id) {
        SysUser sysUser = sysUserService.getById(id);
        return ResultInfo.success(sysUser);
    }

    @PostMapping("save")
    public Result<?> save(@RequestBody @Validated SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.voToPo(sysUserVo);
        sysUserService.save(sysUser);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.POST, RequestMethod.PUT})
    public Result<?> update(@RequestBody @Validated SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.voToPo(sysUserVo);
        sysUserService.updateById(sysUser);
        return ResultInfo.success();
    }

    @GetMapping(value = "delete", params = "ids")
    public Result<?> delete(List<Long> ids) {
        Example.Builder where = Example.builder(SysUser.class).where(Sqls.custom().andIn("id", ids));
        sysUserService.removeByIds(ids);
        return ResultInfo.success();
    }

    @GetMapping(value = "delete", params = "id")
    public Result<?> delete(Long id) {
        sysUserService.removeById(id);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        sysUserService.removeById(id);
        return ResultInfo.success();
    }
}