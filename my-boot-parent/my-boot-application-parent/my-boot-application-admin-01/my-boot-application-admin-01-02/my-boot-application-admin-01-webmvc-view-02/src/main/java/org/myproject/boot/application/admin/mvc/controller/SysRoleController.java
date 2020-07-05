package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.converter.SysRoleConverter;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleExample;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.db.pojo.SysRoleVo;
import org.myproject.boot.application.admin.db.service.base.SysRoleService;
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
    private SysRoleService sysRoleService;
    @Autowired
    private SysRoleConverter sysRoleConverter;

    @RequestMapping(value = "data", method = {RequestMethod.GET})
    public Result<?> data(SysRoleQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        PageResult<SysRole> result = new PageResult<>(sysRoleService.selectByQuery(query, page, size));
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public Result<?> list(SysRoleQuery query) {
        List<SysRole> list = sysRoleService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @RequestMapping(value = "get", method = {RequestMethod.GET})
    public Result<?> get(Long id) {
        SysRole SysRole = sysRoleService.selectByPrimaryKey(id);
        return ResultInfo.success(SysRole);
    }

    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public Result<?> save(@RequestBody @Validated SysRoleVo SysRoleVo) {
        SysRole SysRole = sysRoleConverter.voToPo(SysRoleVo);
        sysRoleService.insert(SysRole);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.POST, RequestMethod.PUT})
    public Result<?> update(@RequestBody @Validated SysRoleVo SysRoleVo) {
        SysRole SysRole = sysRoleConverter.voToPo(SysRoleVo);
        sysRoleService.updateByPrimaryKeySelective(SysRole);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "ids", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteList(List<Long> ids) {
        SysRoleExample example = new SysRoleExample();
        example.or().andIdIn(ids);
        sysRoleService.deleteByExample(example);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "id", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteOne(Long id) {
        sysRoleService.deleteByPrimaryKey(id);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        sysRoleService.deleteByPrimaryKey(id);
        return ResultInfo.success();
    }

}