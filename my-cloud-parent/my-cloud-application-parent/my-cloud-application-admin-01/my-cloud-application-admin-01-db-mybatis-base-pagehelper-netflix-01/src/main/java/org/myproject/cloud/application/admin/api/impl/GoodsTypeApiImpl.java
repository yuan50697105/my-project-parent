package org.myproject.cloud.application.admin.api.impl;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.cloud.application.admin.api.base.BGoodsTypeApi;
import org.myproject.cloud.application.admin.api.pojo.*;
import org.myproject.cloud.application.admin.api.converter.TbConverter;
import org.myproject.cloud.application.admin.db.pojo.TbGoodsType;
import org.myproject.cloud.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.cloud.application.admin.db.service.TbGoodsTypeService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 19:22
 */
@Service
@AllArgsConstructor
@Transactional
@Primary
@RestController
public class GoodsTypeApiImpl implements BGoodsTypeApi {
    private final TbConverter converter;
    private final TbGoodsTypeService goodsTypeService;

    @Override
    public IPage<BGoodsType> selectByQuery(BGoodsTypeQuery query, int page, int size) {
        TbGoodsTypeQuery goodsTypeQuery = converter.goodsType(query);
        PageInfo<TbGoodsType> pageInfo = goodsTypeService.selectByQuery(goodsTypeQuery, page, size);
        return new PageResult<>(converter.goodsType(pageInfo));
    }

    @Override
    public List<BGoodsType> selectByQuery(BGoodsTypeQuery query) {
        TbGoodsTypeQuery goodsTypeQuery = converter.goodsType(query);
        List<TbGoodsType> list = goodsTypeService.selectByQuery(goodsTypeQuery);
        return converter.goodsType(list);
    }

    @Override
    public BGoodsType get(Long id) {
        TbGoodsType goodsType = goodsTypeService.selectByPrimaryKey(id);
        return converter.goodsType(goodsType);
    }

    @Override
    public void save(BGoodsTypeVo vo) {
        TbGoodsType record = converter.goodsType(vo);
        goodsTypeService.insert(record);
    }

    @Override
    public void update(BGoodsTypeVo vo) {
        goodsTypeService.updateByPrimaryKeySelective(converter.goodsType(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        ids.forEach(goodsTypeService::deleteByPrimaryKey);
    }

    @Override
    public void delete(Long id) {
        goodsTypeService.deleteByPrimaryKey(id);
    }
}