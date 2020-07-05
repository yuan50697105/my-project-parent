package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLog;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLogQuery;
import org.myproject.boot.application.admin.db.service.base.TbCustomerLogService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-29 22:12
 */
@RestController
@RequestMapping("customer/log")
public class CustomerLogController {
    @Autowired
    private TbCustomerLogService customerLogService;

    @RequestMapping(value = "data", method = {RequestMethod.GET})
    public Result<?> data(TbCustomerLogQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        PageResult<TbCustomerLog> pageResult = new PageResult<>(customerLogService.selectByQuery(query, page, size));
        return ResultInfo.success(pageResult.getData(), pageResult.getTotalRows());
    }

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public Result<?> list(TbCustomerLogQuery query) {
        List<TbCustomerLog> list = customerLogService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }


}