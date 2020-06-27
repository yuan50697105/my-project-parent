package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.myproject.boot.application.admin.db.converter.SysRoleConverter;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.db.pojo.SysRoleVo;
import org.myproject.boot.application.admin.db.service.SysRoleService;
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
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private SysRoleConverter sysRoleConverter;

    @GetMapping("data")
    public Result<?> data(SysRoleQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        PageResult<SysRole> result = new PageResult<>(sysRoleService.selectByQueryWithPage(page, size, query));
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping("data2")
    public Result<?> data2(SysRoleQuery query,
                           @RequestParam(defaultValue = "1") int page,
                           @RequestParam(defaultValue = "20") int size) {
        PageResult<SysRole> result = new PageResult<>(sysRoleService.pageByQuery(new Page<>(page, size), query));
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping("list")
    public Result<?> list(SysRoleQuery query) {
        List<SysRole> list = sysRoleService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping("list2")
    public Result<?> list2(SysRoleQuery query) {
        List<SysRole> list = sysRoleService.listByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping("get")
    public Result<?> get(Long id) {
        SysRole sysRole = sysRoleService.getById(id);
        return ResultInfo.success(sysRole);
    }

    @PostMapping("save")
    public Result<?> save(@RequestBody @Validated SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.voToPo(sysRoleVo);
        sysRoleService.save(sysRole);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.POST, RequestMethod.PUT})
    public Result<?> update(@RequestBody @Validated SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.voToPo(sysRoleVo);
        sysRoleService.updateById(sysRole);
        return ResultInfo.success();
    }

    @GetMapping(value = "delete", params = "ids")
    public Result<?> delete(List<Long> ids) {
        sysRoleService.removeByIds(ids);
        return ResultInfo.success();
    }

    @GetMapping(value = "delete", params = "id")
    public Result<?> delete(Long id) {
        sysRoleService.removeById(id);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        sysRoleService.removeById(id);
        return ResultInfo.success();
    }
}