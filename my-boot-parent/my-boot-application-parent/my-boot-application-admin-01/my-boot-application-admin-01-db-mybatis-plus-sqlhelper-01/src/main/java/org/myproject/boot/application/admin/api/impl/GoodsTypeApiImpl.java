package org.myproject.boot.application.admin.api.impl;


import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.api.api.BGoodsTypeApi;
import org.myproject.boot.application.admin.api.converter.TbConverter;
import org.myproject.boot.application.admin.api.pojo.BGoodsType;
import org.myproject.boot.application.admin.api.pojo.BGoodsTypeQuery;
import org.myproject.boot.application.admin.api.pojo.BGoodsTypeVo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.admin.db.service.TbGoodsTypeService;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:03
 */
@Service
@AllArgsConstructor
@Transactional
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
        return converter.goodsType(goodsTypeService.getById(id));
    }

    @Override
    public void save(BGoodsTypeVo vo) {
        goodsTypeService.save(converter.goodsType(vo));
    }

    @Override
    public void update(BGoodsTypeVo vo) {
        goodsTypeService.updateById(converter.goodsType(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        goodsTypeService.removeByIds(ids);
    }

    @Override
    public void delete(Long id) {
        goodsTypeService.removeById(id);
    }
}
