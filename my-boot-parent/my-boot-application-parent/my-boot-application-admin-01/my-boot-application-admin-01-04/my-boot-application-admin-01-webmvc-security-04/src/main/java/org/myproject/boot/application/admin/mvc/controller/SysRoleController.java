package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.jn.langx.expression.operator.compare.GE;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleExample;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.db.pojo.SysRoleVo;
import org.myproject.boot.application.admin.db.service.business.BSysRoleService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-27 14:16
 */
@RestController
@RequestMapping("sys/role")
public class SysRoleController {
    @Autowired
    private BSysRoleService sysRoleService;

    @RequestMapping(value = "data",method = {RequestMethod.GET})
    public Result<?> data(SysRoleQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        PageResult<SysRole> result = sysRoleService.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @RequestMapping(value = "list",method = {RequestMethod.GET})
    public Result<?> list(SysRoleQuery query) {
        List<SysRole> list = sysRoleService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @RequestMapping(value = "get",method = {RequestMethod.GET})
    public Result<?> get(Long id) {
        SysRole SysRole = sysRoleService.selectById(id);
        return ResultInfo.success(SysRole);
    }

    @RequestMapping(value = "save",method = {RequestMethod.POST})
    public Result<?> save(@RequestBody @Validated SysRoleVo SysRoleVo) {
        sysRoleService.save(SysRoleVo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.POST, RequestMethod.PUT,RequestMethod.PATCH})
    public Result<?> update(@RequestBody @Validated SysRoleVo SysRoleVo) {
        sysRoleService.update(SysRoleVo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "ids",method = {RequestMethod.GET,RequestMethod.DELETE})
    public Result<?> delete(List<Long> ids) {
        sysRoleService.delete(ids);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "id",method = {RequestMethod.GET,RequestMethod.DELETE})
    public Result<?> delete(Long id) {
        sysRoleService.delete(id);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        sysRoleService.delete(id);
        return ResultInfo.success();
    }

}