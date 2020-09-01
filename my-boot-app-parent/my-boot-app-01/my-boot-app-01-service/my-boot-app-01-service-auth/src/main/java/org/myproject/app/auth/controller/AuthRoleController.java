package org.myproject.app.auth.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.auth.pojo.AuthRole;
import org.myproject.app.auth.pojo.AuthRoleDetailResult;
import org.myproject.app.auth.pojo.AuthRoleQuery;
import org.myproject.app.auth.pojo.AuthRoleVo;
import org.myproject.app.auth.service.AuthRoleService;
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
@Api(value = "认证用户", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("auth/roles")
@AllArgsConstructor
public class AuthRoleController {
    public static final String API_QUERY = "查询用户";
    public static final String API_ID_GET = "ID获取用户";
    public static final String API_INSERT = "增加用户";
    public static final String API_UPDATE = "更新用户";
    public static final String API_REMOVE = "删除用户";
    private static final String API_ID_GET_DETAIL = "ID获取用户详情";
    private final AuthRoleService roleService;

    @GetMapping
    @ApiOperation(API_QUERY)
    @Log(API_QUERY)
    public Result<List<AuthRole>> list(AuthRoleQuery query) {
        IPage<AuthRole> pageInfo = roleService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping({"/{id}", "/{id}/basic"})
    @ApiOperation(API_ID_GET)
    @Log(API_ID_GET)
    public Result<AuthRole> get(@PathVariable Long id) {
        AuthRole authRole = roleService.selectByPrimaryKey(id);
        return ResultInfo.success(authRole);
    }

    @GetMapping("/{id}/detail")
    @ApiOperation(API_ID_GET_DETAIL)
    @Log(API_ID_GET_DETAIL)
    public Result<AuthRoleDetailResult> getDetail(@PathVariable Long id) {
        AuthRoleDetailResult authRoleDetailResult = roleService.selectDetailById(id);
        return ResultInfo.success(authRoleDetailResult);
    }

    @PostMapping
    @ApiOperation(API_INSERT)
    @Log(API_INSERT)
    public Result<?> insert(@RequestBody AuthRoleVo authRoleVo) {
        roleService.insert(authRoleVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(API_UPDATE)
    @Log(API_UPDATE)
    public Result<?> update(@RequestBody AuthRoleVo authRoleVo) {
        roleService.updateByPrimaryKeySelective(authRoleVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(API_REMOVE)
    @Log(API_REMOVE)
    public Result<?> delete(@PathVariable Long[] id) {
        roleService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }

}