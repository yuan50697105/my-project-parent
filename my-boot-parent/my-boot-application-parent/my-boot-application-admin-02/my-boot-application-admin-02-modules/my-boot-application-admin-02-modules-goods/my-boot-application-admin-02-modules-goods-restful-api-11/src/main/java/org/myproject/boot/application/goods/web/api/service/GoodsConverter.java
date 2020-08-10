package org.myproject.boot.application.goods.web.api.service;

import org.mapstruct.Mapper;
import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.service.pojo.GoodsTypeAoDTO;
import org.myproject.boot.application.goods.service.pojo.GoodsTypeQueryDTO;
import org.myproject.boot.application.goods.service.pojo.GoodsTypeVoDTO;
import org.myproject.boot.application.goods.web.api.pojo.GoodsTypeAo;
import org.myproject.boot.application.goods.web.api.pojo.GoodsTypeQuery;
import org.myproject.boot.application.goods.web.api.pojo.GoodsTypeVo;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 19:10
 */
@Mapper(componentModel = "spring")
public interface GoodsConverter {
    GoodsTypeAo typeAo(GoodsTypeAoDTO goodsTypeAoDTO);

    GoodsTypeQueryDTO typeQuery(GoodsTypeQuery query);

    List<GoodsTypeAo> typeAos(List<GoodsTypeAoDTO> list);

    IPage<GoodsTypeAo> typeAos(IPage<GoodsTypeAoDTO> list);

    GoodsTypeVoDTO typeVo(GoodsTypeVo goodsTypeVo);
}
