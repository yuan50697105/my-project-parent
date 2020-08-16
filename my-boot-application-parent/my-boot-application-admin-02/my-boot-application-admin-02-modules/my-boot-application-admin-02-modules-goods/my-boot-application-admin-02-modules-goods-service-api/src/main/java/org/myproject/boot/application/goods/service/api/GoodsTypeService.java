package org.myproject.boot.application.goods.service.api;

import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeAo;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeVo;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 13:35
 */
public interface GoodsTypeService {
    void save(GoodsTypeVo goodsTypeVo);

    void delete(Long id);

    GoodsTypeAo get(Long id);

    List<GoodsTypeAo> list(GoodsTypeQuery query);

    IPage<GoodsTypeAo> list(GoodsTypeQuery query, int page, int limit);
}
