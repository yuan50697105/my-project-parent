package org.myproject.app.bill.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.bill.pojo.BillInfo;
import org.myproject.app.bill.pojo.BillInfoQuery;
import org.myproject.app.bill.pojo.BillInfoVo;
import org.myproject.app.bill.service.BillInfoService;
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
 * @create: 2020-08-23 14:47
 */
@Api(value = "订单信息", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("bill/infos")
@AllArgsConstructor
public class BillInfoController {
    public static final String API_QUERY = "查询订单";
    public static final String API_ID_GET = "ID获取订单";
    public static final String API_INSERT = "增加订单";
    public static final String API_UPDATE = "更新订单";
    public static final String API_REMOVE = "删除订单";
    private final BillInfoService service;

    @GetMapping
    @ApiOperation(API_QUERY)
    @Log(API_QUERY)
    public Result<List<BillInfo>> list(BillInfoQuery query) {
        IPage<BillInfo> pageInfo = service.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping({"/{id}", "/{id}/basic"})
    @ApiOperation(API_ID_GET)
    @Log(API_ID_GET)
    public Result<BillInfo> get(@PathVariable Long id) {
        BillInfo authUser = service.selectByPrimaryKey(id);
        return ResultInfo.success(authUser);
    }

    @PostMapping
    @ApiOperation(API_INSERT)
    @Log(API_INSERT)
    public Result<?> insert(@RequestBody BillInfoVo vo) {
        service.insert(vo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(API_UPDATE)
    @Log(API_UPDATE)
    public Result<?> update(@RequestBody BillInfoVo vo) {
        service.updateByPrimaryKeySelective(vo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(API_REMOVE)
    @Log(API_REMOVE)
    public Result<?> delete(@PathVariable Long[] id) {
        service.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}