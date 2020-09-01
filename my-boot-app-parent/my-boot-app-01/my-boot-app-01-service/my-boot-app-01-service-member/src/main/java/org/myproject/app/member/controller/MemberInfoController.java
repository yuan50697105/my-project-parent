package org.myproject.app.member.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.db.commons.pojo.IPage;
import org.myproject.app.db.member.pojo.MemberInfo;
import org.myproject.app.db.member.pojo.MemberInfoQuery;
import org.myproject.app.db.member.pojo.MemberInfoVo;
import org.myproject.app.db.member.service.MemberInfoService;
import org.springframework.http.MediaType;
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
@Api(value = "会员信息", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("member/infos")
@AllArgsConstructor
public class MemberInfoController {
    public static final String API_QUERY = "查询会员信息";
    public static final String API_ID_GET = "ID获取会员信息";
    public static final String API_INSERT = "增加会员信息";
    public static final String API_UPDATE = "更新会员信息";
    public static final String API_REMOVE = "删除会员信息";
    private final MemberInfoService deviceInfoService;

    @GetMapping
    @ApiOperation(API_QUERY)
    @Log(API_QUERY)
    public Result<List<MemberInfo>> list(MemberInfoQuery query) {
        IPage<MemberInfo> pageInfo = deviceInfoService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation(API_ID_GET)
    @Log(API_ID_GET)
    public Result<MemberInfo> get(@PathVariable Long id) {
        MemberInfo MemberInfo = deviceInfoService.selectByPrimaryKey(id);
        return ResultInfo.success(MemberInfo);
    }

    @PostMapping
    @ApiOperation(API_INSERT)
    @Log(API_INSERT)
    public Result<?> insert(@RequestBody MemberInfoVo MemberInfoVo) {
        deviceInfoService.insert(MemberInfoVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(API_UPDATE)
    @Log(API_UPDATE)
    public Result<?> update(@RequestBody MemberInfoVo MemberInfoVo) {
        deviceInfoService.updateByPrimaryKeySelective(MemberInfoVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(API_REMOVE)
    @Log(API_REMOVE)
    public Result<?> delete(@PathVariable Long[] id) {
        deviceInfoService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}