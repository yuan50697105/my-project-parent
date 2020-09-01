package org.myproject.app.customer.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.customer.pojo.*;
import org.myproject.app.customer.service.CustomerAddressService;
import org.myproject.app.customer.service.CustomerInfoService;
import org.myproject.app.db.commons.pojo.IPage;
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
    public static final String API_ADD_ADDRESS = "添加地址";
    private static final String API_UPDATE_ADDRESS = "更新地址";
    private static final String API_DELETE_ADDRESS = "删除地址";
    private final CustomerInfoService customerInfoService;
    private final CustomerAddressService customerAddressService;

    @GetMapping
    @ApiOperation(API_QUERY)
    @Log(API_QUERY)
    public Result<List<CustomerInfo>> list(CustomerInfoQuery query) {
        IPage<CustomerInfo> pageInfo = customerInfoService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation(API_ID_GET)
    @Log(API_ID_GET)
    public Result<CustomerInfo> get(@PathVariable Long id) {
        CustomerInfo CustomerInfo = customerInfoService.selectByPrimaryKey(id);
        return ResultInfo.success(CustomerInfo);
    }

    @PostMapping
    @ApiOperation(API_INSERT)
    @Log(API_INSERT)
    public Result<?> insert(@RequestBody CustomerInfoVo customerInfoVo) {
        customerInfoService.insert(customerInfoVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(API_UPDATE)
    @Log(API_UPDATE)
    public Result<?> update(CustomerInfoVo customerInfoVo) {
        customerInfoService.updateByPrimaryKeySelective(customerInfoVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(API_REMOVE)
    @Log(API_REMOVE)
    public Result<?> delete(@PathVariable Long[] id) {
        customerInfoService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }

    @GetMapping("/{customerId}/addresses")
    public Result<List<CustomerAddress>> listAddress(CustomerAddressQuery query, @PathVariable("customerId") Long customerId) {
        IPage<CustomerAddress> iPage = customerAddressService.selectPageByQuery(query.withCustomerId(customerId));
        return ResultInfo.success(iPage.getTotal(), iPage.getList());
    }

    @PostMapping("/addresses")
    @ApiOperation(API_ADD_ADDRESS)
    @Log(API_ADD_ADDRESS)
    public Result<?> insertAddress(@RequestBody CustomerAddressVo vo) {
        customerAddressService.insert(vo);
        return ResultInfo.success();
    }

    @PutMapping("/addresses")
    @ApiOperation(API_UPDATE_ADDRESS)
    @Log(API_UPDATE_ADDRESS)
    public Result<?> updateAddress(@RequestBody CustomerAddressVo vo) {
        customerAddressService.updateByPrimaryKeySelective(vo);
        return ResultInfo.success();
    }

    @DeleteMapping("/addresses/{id}")
    @ApiOperation(API_DELETE_ADDRESS)
    @Log(API_DELETE_ADDRESS)
    public Result<?> deleteAddress(@PathVariable("id") Long[] id) {
        customerAddressService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}