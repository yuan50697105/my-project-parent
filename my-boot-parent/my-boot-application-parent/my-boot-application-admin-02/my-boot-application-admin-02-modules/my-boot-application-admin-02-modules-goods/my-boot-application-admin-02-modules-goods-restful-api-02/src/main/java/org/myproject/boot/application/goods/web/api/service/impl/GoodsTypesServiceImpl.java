package org.myproject.boot.application.goods.web.api.service.impl;

import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.service.api.GoodsTypeService;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeAo;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeVo;
import org.myproject.boot.application.goods.web.api.pojo.GoodsTypeQuery;
import org.myproject.boot.application.goods.web.api.service.GoodsConverter;
import org.myproject.boot.application.goods.web.api.service.GoodsTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 18:52
 */
@Service
public class GoodsTypesServiceImpl implements GoodsTypesService {
    @Autowired
    private GoodsTypeService goodsTypeService;
    @Autowired
    private GoodsConverter converter;

    @Override
    public org.myproject.boot.application.goods.web.api.pojo.GoodsTypeAo get(Long id) {
        GoodsTypeAo goodsTypeAo = goodsTypeService.get(id);
        return Optional.ofNullable(converter.typeAo(goodsTypeAo)).orElse(new org.myproject.boot.application.goods.web.api.pojo.GoodsTypeAo());
    }

    @Override
    public List<org.myproject.boot.application.goods.web.api.pojo.GoodsTypeAo> list(GoodsTypeQuery query) {
        List<GoodsTypeAo> list = goodsTypeService.list(converter.typeQuery(query));
        return Optional.ofNullable(converter.typeAos(list)).orElse(new ArrayList<>());
    }

    @Override
    public IPage<org.myproject.boot.application.goods.web.api.pojo.GoodsTypeAo> list(GoodsTypeQuery query, int page, int limit) {
        IPage<GoodsTypeAo> list = goodsTypeService.list(converter.typeQuery(query), page, limit);
        return converter.typeAos(list);
    }

    @Override
    public void add(org.myproject.boot.application.goods.web.api.pojo.GoodsTypeVo goodsTypeVo) {
        GoodsTypeVo goodsTypeVo = converter.typeVo(goodsTypeVo);
        goodsTypeVo.setEvent(GoodsTypeVo.Event.ADD);
        goodsTypeService.save(goodsTypeVo);
    }

    @Override
    public void update(org.myproject.boot.application.goods.web.api.pojo.GoodsTypeVo goodsTypeVo) {
        GoodsTypeVo goodsTypeVo = converter.typeVo(goodsTypeVo);
        goodsTypeVo.setEvent(GoodsTypeVo.Event.UPDATE);
        goodsTypeService.save(goodsTypeVo);
    }

    @Override
    public void delete(Long id) {
        goodsTypeService.delete(id);
    }


}