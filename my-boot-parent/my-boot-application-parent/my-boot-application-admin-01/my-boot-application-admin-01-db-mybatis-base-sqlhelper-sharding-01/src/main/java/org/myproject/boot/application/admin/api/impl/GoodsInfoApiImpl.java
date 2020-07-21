package org.myproject.boot.application.admin.api.impl;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.api.converter.TbConverter;
import org.myproject.boot.application.admin.api.pojo.*;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.service.TbGoodsInfoService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 19:17
 */
@Service
@AllArgsConstructor
@Transactional
@Primary
public class GoodsInfoApiImpl implements BGoodsInfoApi {
    private final TbConverter converter;
    private final TbGoodsInfoService goodsInfoService;

    @Override
    public IPage<BGoodsInfo> selectByQuery(BGoodsInfoQuery query, int page, int size) {
        TbGoodsInfoQuery goodsInfoQuery = converter.goodsInfo(query);
        PageInfo<TbGoodsInfo> pageInfo = goodsInfoService.selectByQuery(goodsInfoQuery, page, size);
        return new PageResult<>(converter.goodsInfo(pageInfo));
    }

    @Override
    public List<BGoodsInfo> selectByQuery(BGoodsInfoQuery query) {
        TbGoodsInfoQuery goodsInfoQuery = converter.goodsInfo(query);
        List<TbGoodsInfo> list = goodsInfoService.selectByQuery(goodsInfoQuery);
        return converter.goodsInfo(list);
    }

    @Override
    public BGoodsInfo get(Long id) {
        TbGoodsInfo goodsInfo = goodsInfoService.selectByPrimaryKey(id);
        return converter.goodsInfo(goodsInfo);
    }

    @Override
    public void save(BGoodsInfoVo vo) {
        goodsInfoService.insert(converter.goodsInfo(vo));
    }

    @Override
    public void update(BGoodsInfoVo vo) {
        goodsInfoService.updateByPrimaryKeySelective(converter.goodsInfo(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        ids.forEach(goodsInfoService::deleteByPrimaryKey);
    }

    @Override
    public void delete(Long id) {
        goodsInfoService.deleteByPrimaryKey(id);
    }
}