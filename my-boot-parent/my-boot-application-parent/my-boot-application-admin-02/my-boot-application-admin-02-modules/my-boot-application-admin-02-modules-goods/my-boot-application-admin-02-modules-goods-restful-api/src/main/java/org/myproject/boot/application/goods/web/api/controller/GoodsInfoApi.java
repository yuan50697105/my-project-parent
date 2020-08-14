package org.myproject.boot.application.goods.web.api.controller;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoVo;
import org.springframework.web.bind.annotation.*;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-14 21:23
 */
@RequestMapping("goods/infos")
public interface GoodsInfoApi {
    @GetMapping("/{id}")
    Result<?> get(@PathVariable Long id);

    @GetMapping
    Result<?> list(GoodsInfoQuery query, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "20") int limit);

    @PostMapping
    Result<?> add(@RequestBody GoodsInfoVo vo);

    @PutMapping
    Result<?> update(@RequestBody GoodsInfoVo vo);

    @DeleteMapping("/{id}")
    Result<?> delete(@PathVariable Long id);


}