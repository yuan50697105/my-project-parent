package org.myproject.app.auth.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.auth.pojo.AuthRole;
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
@Api(value = "认证角色", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("auth/roles")
@AllArgsConstructor
public class AuthRoleController {
    public static final String QUERY_ROLE = "查询角色";
    public static final String ID_GET_ROLE = "ID获取角色";
    public static final String ADD_ROLE = "增加角色";
    public static final String UPDATE_ROLE = "更新角色";
    public static final String DELETE_ROLE = "删除角色";
    private final AuthRoleService roleService;

    @GetMapping
    @ApiOperation(QUERY_ROLE)
    @Log(QUERY_ROLE)
    public Result<List<AuthRole>> list(AuthRoleQuery query) {
        IPage<AuthRole> pageInfo = roleService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation(ID_GET_ROLE)
    @Log(ID_GET_ROLE)
    public Result<AuthRole> get(@PathVariable Long id) {
        AuthRole authRole = roleService.selectByPrimaryKey(id);
        return ResultInfo.success(authRole);
    }

    @PostMapping
    @ApiOperation(ADD_ROLE)
    @Log(ADD_ROLE)
    public Result<?> insert(@RequestBody AuthRoleVo authRoleVo) {
        roleService.insert(authRoleVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(UPDATE_ROLE)
    @Log(UPDATE_ROLE)
    public Result<?> update(@RequestBody AuthRoleVo authRoleVo) {
        roleService.updateByPrimaryKeySelective(authRoleVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(DELETE_ROLE)
    @Log(DELETE_ROLE)
    public Result<?> delete(@PathVariable Long[] id) {
        roleService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }

}