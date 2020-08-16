package org.myproject.boot.application.goods.web.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoVo;
import org.myproject.boot.application.goods.web.api.service.GoodsInfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-15 21:47
 */
@RestController
@RequestMapping("goods/infos")
public class GoodsInfosController implements GoodsInfoApi {
    @Autowired
    private GoodsInfosService goodsInfosService;

    @Override
    public Result<?> get(Long id) {
        return ResultInfo.success(goodsInfosService.get(id));
    }

    @Override
    public Result<?> list(GoodsInfoQuery query, int page, int limit) {
        return ResultInfo.success(goodsInfosService.list(query, page, limit));
    }

    @Override
    public Result<?> add(GoodsInfoVo vo) {
        vo.setEvent(GoodsInfoVo.Event.ADD);
        goodsInfosService.save(vo);
        return ResultInfo.success();
    }

    @Override
    public Result<?> update(Long id, GoodsInfoVo vo) {
        vo.setId(id);
        vo.setEvent(GoodsInfoVo.Event.UPDATE);
        goodsInfosService.save(vo);
        return ResultInfo.success();
    }

    @Override
    public Result<?> delete(Long id) {
        goodsInfosService.delete(id);
        return ResultInfo.success();
    }
}