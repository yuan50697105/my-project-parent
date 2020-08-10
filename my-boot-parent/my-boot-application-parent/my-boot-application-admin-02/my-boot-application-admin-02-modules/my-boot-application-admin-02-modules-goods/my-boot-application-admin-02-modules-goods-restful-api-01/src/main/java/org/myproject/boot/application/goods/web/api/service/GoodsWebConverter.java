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
public interface GoodsWebConverter {
    GoodsTypeAo typeAo(GoodsTypeAo goodsTypeAo);

    GoodsTypeQuery typeQuery(GoodsTypeQuery query);

    List<GoodsTypeAo> typeAos(List<GoodsTypeAo> list);

    IPage<GoodsTypeAo> typeAos(IPage<GoodsTypeAo> list);

    GoodsTypeVo typeVo(GoodsTypeVo goodsTypeVo);
}
