package org.myproject.app.customer.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.commons.pojo.IPage;
import org.myproject.app.member.service.CustomerInfoService;
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
@Api(value = "客户信息", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("customer/info")
@AllArgsConstructor
public class CustomerInfoController {
    private final CustomerInfoService CustomerInfoService;

    @GetMapping
    @ApiOperation("查询")
    public Result<List<CustomerInfo>> list(CustomerInfoQuery query) {
        IPage<CustomerInfo> pageInfo = CustomerInfoService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation("ID获取")
    public Result<CustomerInfo> get(@PathVariable Long id) {
        CustomerInfo CustomerInfo = CustomerInfoService.selectByPrimaryKey(id);
        return ResultInfo.success(CustomerInfo);
    }

    @PostMapping
    @ApiOperation("增加")
    public Result<?> insert(@RequestBody CustomerInfoVo customerInfoVo) {
        CustomerInfoService.insert(customerInfoVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation("更新")
    public Result<?> update(CustomerInfoVo customerInfoVo) {
        CustomerInfoService.updateByPrimaryKeySelective(customerInfoVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result<?> delete(@PathVariable Long[] id) {
        CustomerInfoService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}