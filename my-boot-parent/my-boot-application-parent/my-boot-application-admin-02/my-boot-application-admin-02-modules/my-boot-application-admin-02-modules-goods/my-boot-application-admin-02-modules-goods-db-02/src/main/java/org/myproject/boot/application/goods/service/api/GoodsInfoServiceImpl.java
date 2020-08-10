package org.myproject.boot.application.goods.service.api;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoAo;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsInfoVo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.goods.db.service.TbGoodsInfoService;
import org.myproject.boot.application.goods.service.GoodsConverter;
import org.myproject.boot.application.goods.service.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 13:37
 */
@Service
@Transactional
public class GoodsInfoServiceImpl implements GoodsInfoService {
    @Autowired
    private GoodsConverter converter;
    @Autowired
    private TbGoodsInfoService goodsInfoService;

    @Override
    public void save(GoodsInfoVo ) {
        goodsInfoService.insert(converter.infoVo());
    }

    @Override
    public void delete(Long id) {
        goodsInfoService.deleteByPrimaryKey(id);
    }

    @Override
    public GoodsInfoAo get(Long id) {
        return converter.infoAo(goodsInfoService.selectByPrimaryKey(id));
    }

    @Override
    public List<GoodsInfoAo> list(GoodsInfoQuery query) {
        TbGoodsInfoQuery goodsInfoQuery = converter.infoQuery(query);
        List<TbGoodsInfo> tbGoodsInfos = goodsInfoService.selectByQuery(goodsInfoQuery);
        return converter.infoAos(tbGoodsInfos);
    }

    @Override
    public IPage<GoodsInfoAo> list(GoodsInfoQuery query, int page, int limit) {
        TbGoodsInfoQuery goodsInfoQuery = converter.infoQuery(query);
        PageInfo<TbGoodsInfo> pageInfo = goodsInfoService.selectByQuery(goodsInfoQuery, page, limit);
        return new PageResult<>(converter.infoAos(pageInfo));
    }

}