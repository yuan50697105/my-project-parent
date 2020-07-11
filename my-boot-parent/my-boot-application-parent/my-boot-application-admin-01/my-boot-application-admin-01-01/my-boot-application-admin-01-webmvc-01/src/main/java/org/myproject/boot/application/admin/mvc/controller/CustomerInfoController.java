package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.ApiOperation;
import org.myproject.boot.application.admin.pojo.CustomerInfo;
import org.myproject.boot.application.admin.pojo.CustomerInfoQuery;
import org.myproject.boot.application.admin.pojo.CustomerInfoVo;
import org.myproject.boot.application.admin.api.BCustomerInfoApi;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-29 22:12
 */
@RestController
@RequestMapping("customer/info")
public class CustomerInfoController {
    @Autowired
    private BCustomerInfoApi customerInfoService;

    @ApiOperation(value = "客户信息表格", response = Result.class)
    @RequestMapping(value = "data", method = {RequestMethod.GET})
    public Result<?> data(CustomerInfoQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<CustomerInfo> pageResult = customerInfoService.selectByQuery(query, page, size);
        return ResultInfo.success(pageResult.getData(), pageResult.getTotalRows());
    }

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public Result<?> list(CustomerInfoQuery query) {
        List<CustomerInfo> list = customerInfoService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @RequestMapping(value = "get", params = "id", method = {RequestMethod.GET})
    public Result<?> get(Long id) {
        CustomerInfo customerInfo = customerInfoService.get(id);
        return ResultInfo.success(customerInfo);
    }

    @RequestMapping(value = "get/{id}", params = "id", method = {RequestMethod.GET})
    public Result<?> getRs(@PathVariable Long id) {
        CustomerInfo customerInfo = customerInfoService.get(id);
        return ResultInfo.success(customerInfo);
    }

    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public Result<?> save(@RequestBody @Validated CustomerInfoVo vo) {
        customerInfoService.insert(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.PUT, RequestMethod.POST, RequestMethod.PATCH})
    public Result<?> update(@RequestBody CustomerInfoVo vo) {
        customerInfoService.update(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "ids", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteList(List<Long> ids) {
        customerInfoService.delete(ids);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "id", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteOne(Long id) {
        customerInfoService.delete(id);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteRs(@PathVariable Long id) {
        customerInfoService.delete(id);
        return ResultInfo.success();
    }
}