package org.myproject.boot.application.goods.web.api.service.impl;

import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.service.api.GoodsTypeService;
import org.myproject.boot.application.goods.service.pojo.GoodsTypeAoDTO;
import org.myproject.boot.application.goods.service.pojo.GoodsTypeVoDTO;
import org.myproject.boot.application.goods.service.pojo.PageResult;
import org.myproject.boot.application.goods.web.api.pojo.GoodsTypeAo;
import org.myproject.boot.application.goods.web.api.pojo.GoodsTypeQuery;
import org.myproject.boot.application.goods.web.api.pojo.GoodsTypeVo;
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
    public GoodsTypeAo get(Long id) {
        GoodsTypeAoDTO goodsTypeAoDTO = goodsTypeService.get(id);
        return Optional.ofNullable(converter.typeAo(goodsTypeAoDTO)).orElse(new GoodsTypeAo());
    }

    @Override
    public List<GoodsTypeAo> list(GoodsTypeQuery query) {
        List<GoodsTypeAoDTO> list = goodsTypeService.list(converter.typeQuery(query));
        return Optional.ofNullable(converter.typeAos(list)).orElse(new ArrayList<>());
    }

    @Override
    public IPage<GoodsTypeAo> list(GoodsTypeQuery query, int page, int limit) {
        IPage<GoodsTypeAoDTO> list = goodsTypeService.list(converter.typeQuery(query), page, limit);
        return converter.typeAos(list);
    }

    @Override
    public void add(GoodsTypeVo goodsTypeVo) {
        GoodsTypeVoDTO goodsTypeVoDTO = converter.typeVo(goodsTypeVo);
        goodsTypeVoDTO.setEvent(GoodsTypeVoDTO.Event.ADD);
        goodsTypeService.save(goodsTypeVoDTO);
    }

    @Override
    public void update(GoodsTypeVo goodsTypeVo) {
        GoodsTypeVoDTO goodsTypeVoDTO = converter.typeVo(goodsTypeVo);
        goodsTypeVoDTO.setEvent(GoodsTypeVoDTO.Event.UPDATE);
        goodsTypeService.save(goodsTypeVoDTO);
    }

    @Override
    public void delete(Long id) {
        goodsTypeService.delete(id);
    }


}