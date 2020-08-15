package org.myproject.boot.application.goods.web.api.service;

import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeAo;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeVo;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 18:51
 */
public interface GoodsTypesService {
    GoodsTypeAo get(Long id);

    List<GoodsTypeAo> list(GoodsTypeQuery query);

    IPage<GoodsTypeAo> list(GoodsTypeQuery query, int page, int limit);

    void add(GoodsTypeVo goodsTypeVo);

    void update(GoodsTypeVo goodsTypeVo);

    void delete(Long id);
}
