package org.myproject.boot.application.admin.mvc.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.service.api.BCustomerTypeApi;
import org.myproject.boot.application.admin.service.pojo.CustomerType;
import org.myproject.boot.application.admin.service.pojo.CustomerTypeQuery;
import org.myproject.boot.application.admin.service.pojo.CustomerTypeVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 19:06
 */
@RestController
@RequestMapping("customer/type")
public class CustomerTypeController {
    @Autowired
    private BCustomerTypeApi customerTypeApi;

    @GetMapping(value = "data")
    public Result<?> data(CustomerTypeQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<CustomerType> result = customerTypeApi.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping(value = "list")
    public Result<?> list(CustomerTypeQuery query) {
        List<CustomerType> list = customerTypeApi.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping(value = "get")
    public Result<?> getOne(Long id) {
        CustomerType sysUser = customerTypeApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @GetMapping("{id}")
    public Result<?> get(@PathVariable Long id) {
        CustomerType sysUser = customerTypeApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @PostMapping
    public Result<?> save(@RequestBody @Validated CustomerTypeVo sysUserVo) {
        customerTypeApi.save(sysUserVo);
        return ResultInfo.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody @Validated CustomerTypeVo sysUserVo) {
        customerTypeApi.update(sysUserVo);
        return ResultInfo.success();
    }

    @DeleteMapping(params = "ids")
    public Result<?> deleteList(List<Long> ids) {
        customerTypeApi.delete(ids);
        return ResultInfo.success();
    }

    @DeleteMapping(params = "id")
    public Result<?> deleteOne(Long id) {
        customerTypeApi.delete(id);
        return ResultInfo.success();
    }

    @DeleteMapping("{id}")
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        customerTypeApi.delete(id);
        return ResultInfo.success();
    }
}