package org.myproject.app.auth.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.myproject.app.auth.pojo.AuthPermission;
import org.myproject.app.auth.pojo.AuthPermissionQuery;
import org.myproject.app.auth.pojo.AuthPermissionVo;
import org.myproject.app.auth.service.AuthPermissionService;
import org.myproject.app.commons.pojo.IPage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 15:23
 */
@Api(value = "认证权限", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("auth/permission")
@AllArgsConstructor
public class AuthPermissionController {
    private final AuthPermissionService permissionService;

    @GetMapping
    public Result<List<AuthPermission>> list(AuthPermissionQuery query) {
        IPage<AuthPermission> pageInfo = permissionService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    public Result<AuthPermission> get(@PathVariable Long id) {
        AuthPermission authPermission = permissionService.selectByPrimaryKey(id);
        return ResultInfo.success(authPermission);
    }

    @PostMapping
    public Result<?> insert(@RequestBody AuthPermissionVo authPermissionVo) {
        permissionService.insert(authPermissionVo);
        return ResultInfo.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody AuthPermissionVo authPermissionVo) {
        permissionService.updateByPrimaryKeySelective(authPermissionVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long[] id) {
        permissionService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }

}