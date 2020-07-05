package org.myproject.boot.application.admin.mvc.controller;

import org.myproject.boot.application.admin.db.service.base.TbCustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private TbCustomerTypeService customerTypeService;
}