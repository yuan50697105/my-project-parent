package org.myproject.boot.application.goods.web.api.controller;

import org.myproject.boot.application.goods.service.api.GoodsTypeService;
import org.myproject.boot.application.goods.web.api.pojo.GoodsTypeQuery;
import org.myproject.boot.application.goods.web.api.service.GoodsTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 18:51
 */
@RestController
@RequestMapping("goods/types")
public class GoodsTypesController {
    @Autowired
    private GoodsTypesService goodsTypesService;
}