package org.myproject.boot.application.goods.web.api.service.impl;

import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoAo;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoVo;
import org.myproject.boot.application.goods.service.api.GoodsInfoService;
import org.myproject.boot.application.goods.web.api.service.GoodsInfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-15 21:58
 */
@Service
@Transactional
public class GoodsInfosServiceImpl implements GoodsInfosService {
    @Autowired
    private GoodsInfoService goodsInfoService;

    @Override
    public GoodsInfoAo get(Long id) {
        return goodsInfoService.get(id);
    }

    @Override
    public IPage<GoodsInfoAo> list(GoodsInfoQuery query, int page, int limit) {
        return goodsInfoService.list(query, page, limit);
    }

    @Override
    public void save(GoodsInfoVo vo) {
        goodsInfoService.save(vo);
    }

    @Override
    public void delete(Long id) {
        goodsInfoService.delete(id);
    }
}