package org.myproject.boot.application.goods.web.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeAo;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeVo;
import org.myproject.boot.application.goods.web.api.service.GoodsTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 18:51
 */
@RestController
public class GoodsTypesController implements GoodsTypesApi {
    @Autowired
    private GoodsTypesService goodsTypesService;

    @Override
    public Result<?> get(Long id) {
        GoodsTypeAo goodsTypeAo = goodsTypesService.get(id);
        return ResultInfo.success(goodsTypeAo);
    }

    @Override
    public Result<?> list(GoodsTypeQuery query) {
        List<GoodsTypeAo> list = goodsTypesService.list(query);
        return ResultInfo.success(list);
    }

    @Override
    public Result<?> list(GoodsTypeQuery query, int page, int limit) {
        IPage<GoodsTypeAo> iPage = goodsTypesService.list(query, page, limit);
        return ResultInfo.success(iPage);
    }

    @Override
    public Result<?> add(GoodsTypeVo goodsTypeVo) {
        goodsTypesService.add(goodsTypeVo);
        return ResultInfo.success();
    }

    @Override
    public Result<?> update(Long id, GoodsTypeVo goodsTypeVo) {
        goodsTypeVo.setId(id);
        goodsTypesService.update(goodsTypeVo);
        return ResultInfo.success();
    }

    @Override
    public Result<?> delete(@PathVariable Long id) {
        goodsTypesService.delete(id);
        return ResultInfo.success();
    }


}