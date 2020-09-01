package org.myproject.app.auth.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.db.auth.pojo.AuthPermission;
import org.myproject.app.db.auth.pojo.AuthPermissionQuery;
import org.myproject.app.db.auth.pojo.AuthPermissionVo;
import org.myproject.app.db.auth.service.AuthPermissionService;
import org.myproject.app.db.commons.pojo.IPage;
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
    public static final String API_QUERY = "查询权限";
    public static final String API_ID_GET = "ID获取权限";
    public static final String API_INSERT = "增加权限";
    public static final String API_UPDATE = "更新权限";
    public static final String API_REMOVE = "删除权限";
    private final AuthPermissionService permissionService;

    @GetMapping
    @ApiOperation(API_QUERY)
    @Log(API_QUERY)
    public Result<List<AuthPermission>> list(AuthPermissionQuery query) {
        IPage<AuthPermission> pageInfo = permissionService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation(API_ID_GET)
    @Log(API_ID_GET)
    public Result<AuthPermission> get(@PathVariable Long id) {
        AuthPermission authPermission = permissionService.selectByPrimaryKey(id);
        return ResultInfo.success(authPermission);
    }

    @PostMapping
    @ApiOperation(API_INSERT)
    @Log(API_INSERT)
    public Result<?> insert(@RequestBody AuthPermissionVo authPermissionVo) {
        permissionService.insert(authPermissionVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(API_UPDATE)
    @Log(API_UPDATE)
    public Result<?> update(@RequestBody AuthPermissionVo authPermissionVo) {
        permissionService.updateByPrimaryKeySelective(authPermissionVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(API_REMOVE)
    @Log(API_REMOVE)
    public Result<?> delete(@PathVariable Long[] id) {
        permissionService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }

}