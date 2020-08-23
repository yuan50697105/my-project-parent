package org.myproject.app.customer.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.commons.pojo.IPage;
import org.myproject.app.customer.pojo.CustomerType;
import org.myproject.app.customer.pojo.CustomerTypeQuery;
import org.myproject.app.customer.pojo.CustomerTypeVo;
import org.myproject.app.customer.service.CustomerTypeService;
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
@Api(value = "客户类型", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("auth/users")
@AllArgsConstructor
public class CustomerTypeController {
    private final CustomerTypeService customerTypeService;

    @GetMapping
    @ApiOperation("查询")
    public Result<List<CustomerType>> list(CustomerTypeQuery query) {
        IPage<CustomerType> pageInfo = customerTypeService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation("ID获取")
    public Result<CustomerType> get(@PathVariable Long id) {
        CustomerType CustomerType = customerTypeService.selectByPrimaryKey(id);
        return ResultInfo.success(CustomerType);
    }

    @PostMapping
    @ApiOperation("增加")
    public Result<?> insert(@RequestBody CustomerTypeVo CustomerTypeVo) {
        customerTypeService.insert(CustomerTypeVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation("更新")
    public Result<?> update(CustomerTypeVo CustomerTypeVo) {
        customerTypeService.updateByPrimaryKeySelective(CustomerTypeVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result<?> delete(@PathVariable Long[] id) {
        customerTypeService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}