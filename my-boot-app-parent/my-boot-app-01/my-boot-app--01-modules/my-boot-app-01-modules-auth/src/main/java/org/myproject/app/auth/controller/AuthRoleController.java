package org.myproject.app.auth.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.myproject.app.auth.pojo.AuthRole;
import org.myproject.app.auth.pojo.AuthRoleQuery;
import org.myproject.app.auth.pojo.AuthRoleVo;
import org.myproject.app.auth.service.AuthRoleService;
import org.myproject.app.commons.pojo.IPage;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 15:23
 */
@Api("认证角色")
@RestController
@RequestMapping("auth/roles")
@AllArgsConstructor
public class AuthRoleController {
    private final AuthRoleService roleService;

    @GetMapping
    public Result<?> list(AuthRoleQuery query) {
        IPage<AuthRole> pageInfo = roleService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    public Result<?> get(@PathVariable Long id) {
        AuthRole authRole = roleService.selectByPrimaryKey(id);
        return ResultInfo.success();
    }

    @PostMapping
    public Result<?> insert(@RequestBody AuthRoleVo authRoleVo) {
        roleService.insert(authRoleVo);
        return ResultInfo.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody AuthRoleVo authRoleVo) {
        roleService.updateByPrimaryKeySelective(authRoleVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long[] id) {
        roleService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }

}