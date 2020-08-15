package org.myproject.boot.application.goods.web.api.service;

import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoAo;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoVo;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-15 21:58
 */
public interface GoodsInfosService {
    GoodsInfoAo get(Long id);

    IPage<GoodsInfoAo> list(GoodsInfoQuery query, int page, int limit);

    void save(GoodsInfoVo vo);

    void delete(Long id);
}
