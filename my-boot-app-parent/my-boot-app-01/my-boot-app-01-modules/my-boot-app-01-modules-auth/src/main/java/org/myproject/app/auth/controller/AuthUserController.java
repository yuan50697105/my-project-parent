package org.myproject.app.auth.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.alibaba.fastjson.support.spring.annotation.FastJsonFilter;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.myproject.app.auth.pojo.AuthUser;
import org.myproject.app.auth.pojo.AuthUserDetail;
import org.myproject.app.auth.pojo.AuthUserQuery;
import org.myproject.app.auth.pojo.AuthUserVo;
import org.myproject.app.auth.service.AuthUserService;
import org.myproject.app.commons.pojo.IPage;
import org.springframework.web.bind.annotation.*;
import wiki.xsx.core.log.Log;

import java.util.Arrays;
import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 14:47
 */
@Api(value = "认证用户")
@RestController
@RequestMapping("auth/users")
@AllArgsConstructor
@Slf4j
public class AuthUserController {
    public static final String API_QUERY = "查询角色";
    public static final String API_ID_GET = "ID获取用户";
    public static final String API_INSERT = "增加用户";
    public static final String API_UPDATE = "更新用户";
    public static final String API_REMOVE = "删除用户";
    public static final String API_USERNAME_GET = "账户获取用户";
    private static final String API_ID_GET_DETAIL = "ID获取用户详情";
    private final AuthUserService userService;

    @GetMapping
    @ApiOperation(API_QUERY)
    @Log(API_QUERY)
    @FastJsonView(exclude = @FastJsonFilter(clazz = AuthUser.class, props = "password"))
    public Result<List<AuthUser>> list(AuthUserQuery query) {
        IPage<AuthUser> iPage = userService.selectPageByQuery(query);
        return ResultInfo.success(iPage.getTotal(), iPage.getList());
    }

    @PostMapping
    @ApiOperation(API_INSERT)
    @Log(API_INSERT)
    public Result<?> insert(@RequestBody AuthUserVo authUserVo) {
        userService.insert(authUserVo);
        return ResultInfo.success();
    }

    @GetMapping({"/{id}", "/{id}/basic"})
    @ApiOperation(API_ID_GET)
    @Log(API_ID_GET)
    @FastJsonView(exclude = @FastJsonFilter(clazz = AuthUser.class, props = "password"))
    public Result<AuthUser> get(@PathVariable Long id) {
        AuthUser authUser = userService.selectByPrimaryKey(id);
        return ResultInfo.success(authUser);
    }

    @GetMapping("/{id}/detail")
    @ApiOperation(API_ID_GET_DETAIL)
    @Log(API_ID_GET_DETAIL)
    @FastJsonView(exclude = @FastJsonFilter(clazz = AuthUser.class, props = "password"))
    public Result<AuthUserDetail> getDetail(@PathVariable Long id) {
        AuthUserDetail authUserDetail = userService.selectDetailById(id);
        return ResultInfo.success(authUserDetail);
    }

    @GetMapping("/username/{username}")
    @ApiOperation(API_USERNAME_GET)
    @Log(API_USERNAME_GET)
    @FastJsonView(exclude = @FastJsonFilter(clazz = AuthUser.class, props = "password"))
    public Result<AuthUser> getByUsername(@PathVariable String username) {
        AuthUser authUser = userService.selectOneByUsername(username);
        return ResultInfo.success(authUser);
    }

    @PutMapping
    @ApiOperation(API_UPDATE)
    @Log(API_UPDATE)
    public Result<?> update(@RequestBody AuthUserVo authUserVo) {
        userService.updateByPrimaryKeySelective(authUserVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(API_REMOVE)
    @Log(API_REMOVE)
    public Result<?> delete(@PathVariable Long[] id) {
        userService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}