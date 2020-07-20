package org.myproject.boot.application.admin.mvc.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.api.api.BCustomerInfoApi;
import org.myproject.boot.application.admin.api.pojo.BCustomerInfo;
import org.myproject.boot.application.admin.api.pojo.BCustomerInfoQuery;
import org.myproject.boot.application.admin.api.pojo.BCustomerInfoVo;
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
@RequestMapping("customer/info")
public class CustomerInfoController {
    @Autowired
    private BCustomerInfoApi customerInfoApi;

    @GetMapping(value = "data")
    public Result<?> data(BCustomerInfoQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<BCustomerInfo> result = customerInfoApi.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping(value = "list")
    public Result<?> list(BCustomerInfoQuery query) {
        List<BCustomerInfo> list = customerInfoApi.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping(value = "get")
    public Result<?> getOne(Long id) {
        BCustomerInfo sysUser = customerInfoApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @GetMapping("{id}")
    public Result<?> get(@PathVariable Long id) {
        BCustomerInfo sysUser = customerInfoApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @PostMapping
    public Result<?> save(@RequestBody @Validated BCustomerInfoVo sysUserVo) {
        customerInfoApi.save(sysUserVo);
        return ResultInfo.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody @Validated BCustomerInfoVo sysUserVo) {
        customerInfoApi.update(sysUserVo);
        return ResultInfo.success();
    }


    @DeleteMapping(params = "ids")
    public Result<?> deleteList(List<Long> ids) {
        customerInfoApi.delete(ids);
        return ResultInfo.success();
    }

    @DeleteMapping(params = "id")
    public Result<?> deleteOne(Long id) {
        customerInfoApi.delete(id);
        return ResultInfo.success();
    }

    @DeleteMapping("{id}")
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        customerInfoApi.delete(id);
        return ResultInfo.success();
    }
}