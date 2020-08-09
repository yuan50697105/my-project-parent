package org.myproject.boot.application.goods.web.api.service.impl;

import org.myproject.boot.application.goods.service.api.GoodsTypeService;
import org.myproject.boot.application.goods.web.api.service.GoodsTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 18:52
 */
@Service
public class GoodsTypesServiceImpl implements GoodsTypesService {
    @Autowired
    private GoodsTypeService goodsTypeService;
}