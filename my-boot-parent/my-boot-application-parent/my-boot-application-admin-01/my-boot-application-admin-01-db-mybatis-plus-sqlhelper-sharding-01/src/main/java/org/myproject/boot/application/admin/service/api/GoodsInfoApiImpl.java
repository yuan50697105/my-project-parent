package org.myproject.boot.application.admin.service.api;


import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.service.TbGoodsInfoService;
import org.myproject.boot.application.admin.service.pojo.GoodsInfo;
import org.myproject.boot.application.admin.service.pojo.GoodsInfoQuery;
import org.myproject.boot.application.admin.service.pojo.GoodsInfoVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
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
    public IPage<GoodsInfo> selectByQuery(GoodsInfoQuery query, int page, int size) {
        TbGoodsInfoQuery goodsInfoQuery = converter.goodsInfo(query);
        PageInfo<TbGoodsInfo> pageInfo = goodsInfoService.selectByQuery(goodsInfoQuery, page, size);
        return new PageResult<>(converter.goodsInfo(pageInfo));
    }

    @Override
    public List<GoodsInfo> selectByQuery(GoodsInfoQuery query) {
        TbGoodsInfoQuery goodsInfoQuery = converter.goodsInfo(query);
        List<TbGoodsInfo> list = goodsInfoService.selectByQuery(goodsInfoQuery);
        return converter.goodsInfo(list);
    }

    @Override
    public GoodsInfo get(Long id) {
        TbGoodsInfo goodsInfo = goodsInfoService.getById(id);
        return converter.goodsInfo(goodsInfo);
    }

    @Override
    public void save(GoodsInfoVo vo) {
        TbGoodsInfo goodsInfo = converter.goodsInfo(vo);
        goodsInfoService.save(goodsInfo);
    }

    @Override
    public void update(GoodsInfoVo vo) {
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
