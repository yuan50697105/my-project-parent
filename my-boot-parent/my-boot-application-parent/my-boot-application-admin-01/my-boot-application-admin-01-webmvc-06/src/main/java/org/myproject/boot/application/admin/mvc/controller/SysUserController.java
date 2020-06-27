package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.mapper.sqlhelper.converter.SysUserConverter;
import org.myproject.boot.application.admin.db.mapper.sqlhelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.mapper.sqlhelper.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.mapper.sqlhelper.pojo.SysUserVo;
import org.myproject.boot.application.admin.db.mapper.sqlhelper.service.SysUserService;
import org.myproject.mybatis.mapper.sqlhelper.pojo.PageResult;
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

    @GetMapping("list")
    public Result<?> list(SysUserQuery query) {
        List<SysUser> list = sysUserService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping("get")
    public Result<?> get(Long id) {
        SysUser sysUser = sysUserService.selectByPrimaryKey(id);
        return ResultInfo.success(sysUser);
    }

    @PostMapping("save")
    public Result<?> save(@RequestBody @Validated SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.voToPo(sysUserVo);
        sysUserService.insert(sysUser);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.POST, RequestMethod.PUT})
    public Result<?> update(@RequestBody @Validated SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.voToPo(sysUserVo);
        sysUserService.updateByPrimaryKeySelective(sysUser);
        return ResultInfo.success();
    }

    @GetMapping(value = "delete", params = "ids")
    public Result<?> delete(List<Long> ids) {
        Example.Builder where = Example.builder(SysUser.class).where(Sqls.custom().andIn("id", ids));
        sysUserService.deleteByExample(where.build());
        return ResultInfo.success();
    }

    @GetMapping(value = "delete", params = "id")
    public Result<?> delete(Long id) {
        sysUserService.deleteByPrimaryKey(id);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        sysUserService.deleteByPrimaryKey(id);
        return ResultInfo.success();
    }
}