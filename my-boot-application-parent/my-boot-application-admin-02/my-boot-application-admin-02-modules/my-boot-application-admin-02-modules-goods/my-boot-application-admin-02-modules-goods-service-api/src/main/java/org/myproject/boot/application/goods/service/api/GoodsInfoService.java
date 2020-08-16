package org.myproject.boot.application.goods.service.api;

import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoAo;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoVo;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 13:37
 */
public interface GoodsInfoService {
    void save(GoodsInfoVo goodsInfoVo);

    void delete(Long id);

    GoodsInfoAo get(Long id);

    List<GoodsInfoAo> list(GoodsInfoQuery query);

    IPage<GoodsInfoAo> list(GoodsInfoQuery query, int page, int limit);
}
