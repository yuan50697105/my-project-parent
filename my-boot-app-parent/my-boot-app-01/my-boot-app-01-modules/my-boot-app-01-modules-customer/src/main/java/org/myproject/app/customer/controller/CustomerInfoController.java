package org.myproject.app.customer.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.commons.pojo.IPage;
import org.myproject.app.customer.pojo.CustomerInfo;
import org.myproject.app.customer.pojo.CustomerInfoQuery;
import org.myproject.app.customer.pojo.CustomerInfoVo;
import org.myproject.app.customer.service.CustomerInfoService;
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
@Api(value = "客户信息")
@RestController
@RequestMapping("customer/info")
@AllArgsConstructor
public class CustomerInfoController {
    public static final String API_QUERY = "查询客户";
    public static final String API_ID_GET = "ID获取客户信息";
    public static final String API_INSERT = "增加客户";
    public static final String API_UPDATE = "更新客户";
    public static final String API_REMOVE = "删除客户";
    private final CustomerInfoService service;

    @GetMapping
    @ApiOperation(API_QUERY)
    @Log(API_QUERY)
    public Result<List<CustomerInfo>> list(CustomerInfoQuery query) {
        IPage<CustomerInfo> pageInfo = service.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation(API_ID_GET)
    @Log(API_ID_GET)
    public Result<CustomerInfo> get(@PathVariable Long id) {
        CustomerInfo CustomerInfo = service.selectByPrimaryKey(id);
        return ResultInfo.success(CustomerInfo);
    }

    @PostMapping
    @ApiOperation(API_INSERT)
    @Log(API_INSERT)
    public Result<?> insert(@RequestBody CustomerInfoVo customerInfoVo) {
        service.insert(customerInfoVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(API_UPDATE)
    @Log(API_UPDATE)
    public Result<?> update(CustomerInfoVo customerInfoVo) {
        service.updateByPrimaryKeySelective(customerInfoVo);
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