package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.pojo.CustomerType;
import org.myproject.boot.application.admin.pojo.CustomerTypeQuery;
import org.myproject.boot.application.admin.pojo.CustomerTypeVo;
import org.myproject.boot.application.admin.api.BCustomerTypeApi;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-29 22:10
 */
@RestController
@RequestMapping("customer/type")
public class CustomerTypeController {
    @Autowired
    private BCustomerTypeApi customerTypeService;


    @RequestMapping(value = "data", method = {RequestMethod.GET})
    public Result<?> data(CustomerTypeQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<CustomerType> result = customerTypeService.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public Result<?> list(CustomerTypeQuery query) {
        List<CustomerType> list = customerTypeService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }


    @RequestMapping(value = "get", params = "id", method = {RequestMethod.GET})
    public Result<?> get(Long id) {
        CustomerType customerType = customerTypeService.get(id);
        return ResultInfo.success(customerType);
    }

    @RequestMapping(value = "get/{id}", params = "id", method = {RequestMethod.GET})
    public Result<?> getRs(@PathVariable Long id) {
        CustomerType customerType = customerTypeService.get(id);
        return ResultInfo.success(customerType);
    }

    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public Result<?> save(@RequestBody @Validated CustomerTypeVo vo) {
        customerTypeService.insert(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
    public Result<?> update(@RequestBody @Validated CustomerTypeVo vo) {
        customerTypeService.update(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "ids", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteList(List<Long> ids) {
        customerTypeService.delete(ids);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "id", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteOne(Long id) {
        customerTypeService.delete(id);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> delete(@PathVariable Long id) {
        customerTypeService.delete(id);
        return ResultInfo.success();
    }


}