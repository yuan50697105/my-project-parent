package org.myproject.app.service.customer.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.db.commons.pojo.IPage;
import org.myproject.app.db.customer.pojo.CustomerType;
import org.myproject.app.db.customer.pojo.CustomerTypeQuery;
import org.myproject.app.db.customer.pojo.CustomerTypeVo;
import org.myproject.app.db.customer.service.CustomerTypeService;
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
@Api(value = "客户类型", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("customer/types")
@AllArgsConstructor
public class CustomerTypeController {
    public static final String API_QUERY = "查询客户类型";
    public static final String API_ID_GET = "ID获取客户类型信息";
    public static final String API_INSERT = "增加客户类型";
    public static final String API_UPDATE = "更新客户类型";
    public static final String API_REMOVE = "删除客户类型";
    private final CustomerTypeService customerTypeService;

    @GetMapping
    @ApiOperation(API_QUERY)
    @Log(API_QUERY)
    public Result<List<CustomerType>> list(CustomerTypeQuery query) {
        IPage<CustomerType> pageInfo = customerTypeService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation(API_ID_GET)
    @Log(API_ID_GET)
    public Result<CustomerType> get(@PathVariable Long id) {
        CustomerType CustomerType = customerTypeService.selectByPrimaryKey(id);
        return ResultInfo.success(CustomerType);
    }

    @PostMapping
    @ApiOperation(API_INSERT)
    @Log(API_INSERT)
    public Result<?> insert(@RequestBody CustomerTypeVo CustomerTypeVo) {
        customerTypeService.insert(CustomerTypeVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(API_UPDATE)
    @Log(API_UPDATE)
    public Result<?> update(CustomerTypeVo CustomerTypeVo) {
        customerTypeService.updateByPrimaryKeySelective(CustomerTypeVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(API_REMOVE)
    @Log(API_REMOVE)
    public Result<?> delete(@PathVariable Long[] id) {
        customerTypeService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}