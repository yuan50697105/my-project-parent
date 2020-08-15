package org.myproject.boot.application.admin.api.impl;


import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.api.api.BGoodsInfoApi;
import org.myproject.boot.application.admin.api.converter.TbConverter;
import org.myproject.boot.application.admin.api.pojo.*;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.service.TbGoodsInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:23
 */
@Service
@AllArgsConstructor
@Transactional
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
        TbGoodsInfo goodsInfo = goodsInfoService.getById(id);
        return converter.goodsInfo(goodsInfo);
    }

    @Override
    public void save(BGoodsInfoVo vo) {
        TbGoodsInfo goodsInfo = converter.goodsInfo(vo);
        goodsInfoService.save(goodsInfo);
    }

    @Override
    public void update(BGoodsInfoVo vo) {
        TbGoodsInfo goodsInfo = converter.goodsInfo(vo);
        goodsInfoService.updateById(goodsInfo);
    }

    @Override
    public void delete(List<Long> ids) {
        goodsInfoService.removeByIds(ids);
    }

    @Override
    public void delete(Long id) {
        goodsInfoService.removeById(id);
    }
}
