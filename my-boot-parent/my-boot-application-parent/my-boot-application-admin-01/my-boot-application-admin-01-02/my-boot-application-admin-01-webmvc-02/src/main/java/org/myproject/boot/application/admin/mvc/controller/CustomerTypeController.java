package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeVo;
import org.myproject.boot.application.admin.db.service.business.BCustomerTypeService;
import org.myproject.boot.mybatis.pojo.PageResult;
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
@RequestMapping("customer/type")
public class CustomerTypeController {
    @Autowired
    private BCustomerTypeService customerTypeService;

    @RequestMapping(value = "data", method = {RequestMethod.GET})
    public Result<?> data(TbCustomerTypeQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        PageResult<TbCustomerType> pageResult = customerTypeService.selectByQuery(query, page, size);
        return ResultInfo.success(pageResult.getData(), pageResult.getTotalRows());
    }

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public Result<?> list(TbCustomerTypeQuery query) {
        List<TbCustomerType> list = customerTypeService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }


    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public Result<?> save(@RequestBody @Validated TbCustomerTypeVo vo) {
        customerTypeService.insert(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.GET, RequestMethod.POST})
    public Result<?> update(@RequestBody TbCustomerTypeVo vo) {
        customerTypeService.update(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "ids", method = {RequestMethod.GET})
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
    public Result<?> deleteRs(@PathVariable Long id) {
        customerTypeService.delete(id);
        return ResultInfo.success();
    }
}