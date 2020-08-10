package org.myproject.boot.application.goods.web.api.service;

import org.mapstruct.Mapper;
import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeAo;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeVo;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 19:10
 */
@Mapper(componentModel = "spring")
public interface GoodsConverter {
    org.myproject.boot.application.goods.web.api.pojo.GoodsTypeAo typeAo(GoodsTypeAo goodsTypeAo);

    GoodsTypeQuery typeQuery(org.myproject.boot.application.goods.web.api.pojo.GoodsTypeQuery query);

    List<org.myproject.boot.application.goods.web.api.pojo.GoodsTypeAo> typeAos(List<GoodsTypeAo> list);

    IPage<org.myproject.boot.application.goods.web.api.pojo.GoodsTypeAo> typeAos(IPage<GoodsTypeAo> list);

    GoodsTypeVo typeVo(org.myproject.boot.application.goods.web.api.pojo.GoodsTypeVo goodsTypeVo);
}
