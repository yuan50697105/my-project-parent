package org.myproject.boot.application.admin.mvc.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.api.impl.BCustomerTypeApi;
import org.myproject.boot.application.admin.api.pojo.BCustomerType;
import org.myproject.boot.application.admin.api.pojo.BCustomerTypeQuery;
import org.myproject.boot.application.admin.api.pojo.BCustomerTypeVo;
import org.myproject.boot.application.admin.api.pojo.IPage;
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
    public Result<?> data(BCustomerTypeQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<BCustomerType> result = customerTypeApi.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping(value = "list")
    public Result<?> list(BCustomerTypeQuery query) {
        List<BCustomerType> list = customerTypeApi.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping(value = "get")
    public Result<?> getOne(Long id) {
        BCustomerType sysUser = customerTypeApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @GetMapping("{id}")
    public Result<?> get(@PathVariable Long id) {
        BCustomerType sysUser = customerTypeApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @PostMapping
    public Result<?> save(@RequestBody @Validated BCustomerTypeVo sysUserVo) {
        customerTypeApi.save(sysUserVo);
        return ResultInfo.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody @Validated BCustomerTypeVo sysUserVo) {
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