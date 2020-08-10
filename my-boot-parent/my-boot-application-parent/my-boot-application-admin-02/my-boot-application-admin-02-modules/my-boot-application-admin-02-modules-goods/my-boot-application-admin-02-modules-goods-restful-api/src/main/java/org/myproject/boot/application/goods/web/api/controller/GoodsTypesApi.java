package org.myproject.boot.application.goods.web.api.controller;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeVo;
import org.springframework.web.bind.annotation.*;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 18:58
 */
@RequestMapping("goods/types")
public interface GoodsTypesApi {
    @GetMapping("/{id}")
    Result<?> get(@PathVariable Long id);

    @GetMapping
    Result<?> list(GoodsTypeQuery query);

    @GetMapping(params = {"page", "limit"})
    Result<?> list(GoodsTypeQuery query, int page, int limit);

    @PostMapping
    Result<?> add(GoodsTypeVo goodsTypeVo);

    @PutMapping("/{id}")
    Result<?> update(@PathVariable Long id, @RequestBody GoodsTypeVo goodsTypeVo);

    @DeleteMapping("/{id}")
    Result<?> delete(@PathVariable Long id);
}
