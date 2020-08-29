package org.myproject.app.auth.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.auth.pojo.AuthPermission;
import org.myproject.app.auth.pojo.AuthPermissionQuery;
import org.myproject.app.auth.pojo.AuthPermissionVo;
import org.myproject.app.auth.service.AuthPermissionService;
import org.myproject.app.commons.pojo.IPage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import wiki.xsx.core.log.Log;

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
    public static final String QUERY_PERMISSIONS = "查询权限";
    public static final String ID_GET_PERMISSION = "ID获取权限";
    public static final String INCREASE_PERMISSIONS = "增加权限";
    public static final String UPDATE_PERMISSIONS = "更新权限";
    public static final String REMOVE_PERMISSION = "删除权限";
    private final AuthPermissionService permissionService;

    @GetMapping
    @ApiOperation(QUERY_PERMISSIONS)
    @Log(QUERY_PERMISSIONS)
    public Result<List<AuthPermission>> list(AuthPermissionQuery query) {
        IPage<AuthPermission> pageInfo = permissionService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation(ID_GET_PERMISSION)
    @Log(ID_GET_PERMISSION)
    public Result<AuthPermission> get(@PathVariable Long id) {
        AuthPermission authPermission = permissionService.selectByPrimaryKey(id);
        return ResultInfo.success(authPermission);
    }

    @PostMapping
    @ApiOperation(INCREASE_PERMISSIONS)
    @Log(INCREASE_PERMISSIONS)
    public Result<?> insert(@RequestBody AuthPermissionVo authPermissionVo) {
        permissionService.insert(authPermissionVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(UPDATE_PERMISSIONS)
    @Log(UPDATE_PERMISSIONS)
    public Result<?> update(@RequestBody AuthPermissionVo authPermissionVo) {
        permissionService.updateByPrimaryKeySelective(authPermissionVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(REMOVE_PERMISSION)
    @Log(REMOVE_PERMISSION)
    public Result<?> delete(@PathVariable Long[] id) {
        permissionService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }

}