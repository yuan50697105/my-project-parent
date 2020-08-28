package org.myproject.app.auth.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.auth.pojo.AuthUser;
import org.myproject.app.auth.pojo.AuthUserQuery;
import org.myproject.app.auth.pojo.AuthUserVo;
import org.myproject.app.auth.service.AuthUserService;
import org.myproject.app.commons.pojo.IPage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 14:47
 */
@Api(value = "认证用户", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("auth/users")
@AllArgsConstructor
public class AuthUserController {
    private final AuthUserService userService;

    @GetMapping
    @ApiOperation("查询")
    public Result<List<AuthUser>> list(AuthUserQuery query) {
        IPage<AuthUser> pageInfo = userService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation("ID获取")
    public Result<AuthUser> get(@PathVariable Long id) {
        AuthUser authUser = userService.selectByPrimaryKey(id);
        return ResultInfo.success(authUser);
    }

    @PostMapping
    @ApiOperation("增加")
    public Result<?> insert(@RequestBody AuthUserVo authUserVo) {
        userService.insert(authUserVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation("更新")
    public Result<?> update(@RequestBody AuthUserVo authUserVo) {
        userService.updateByPrimaryKeySelective(authUserVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result<?> delete(@PathVariable Long[] id) {
        userService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}