package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.converter.TbCustomerInfoConverter;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoVo;
import org.myproject.boot.application.admin.db.service.TbCustomerInfoService;
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
@RequestMapping("customer/info")
public class CustomerInfoController {
    @Autowired
    private TbCustomerInfoService customerInfoService;
    @Autowired
    private TbCustomerInfoConverter customerInfoConverter;

    @RequestMapping(value = "data", method = {RequestMethod.GET})
    public Result<?> data(TbCustomerInfoQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        PageResult<TbCustomerInfo> pageResult = new PageResult<>(customerInfoService.selectByQueryWithPage(page, size, query));
        return ResultInfo.success(pageResult.getData(), pageResult.getTotalRows());
    }

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public Result<?> list(TbCustomerInfoQuery query) {
        List<TbCustomerInfo> list = customerInfoService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }


    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public Result<?> save(@RequestBody @Validated TbCustomerInfoVo vo) {
        TbCustomerInfo customerInfo = customerInfoConverter.voToPo(vo);
        customerInfoService.save(customerInfo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.PUT, RequestMethod.POST})
    public Result<?> update(@RequestBody TbCustomerInfoVo vo) {
        TbCustomerInfo customerInfo = customerInfoConverter.voToPo(vo);
        customerInfoService.updateById(customerInfo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "ids", method = {RequestMethod.GET})
    public Result<?> deleteList(List<Long> ids) {
        customerInfoService.removeByIds(ids);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "id", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteOne(Long id) {
        customerInfoService.removeById(id);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteRs(@PathVariable Long id) {
        customerInfoService.removeById(id);
        return ResultInfo.success();
    }
}