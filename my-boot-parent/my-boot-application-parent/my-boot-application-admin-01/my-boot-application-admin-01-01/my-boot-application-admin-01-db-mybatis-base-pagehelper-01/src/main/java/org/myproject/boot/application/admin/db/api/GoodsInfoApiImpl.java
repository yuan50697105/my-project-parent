package org.myproject.boot.application.admin.db.api;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.api.BGoodsInfoApi;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.service.TbGoodsInfoService;
import org.myproject.boot.application.admin.pojo.GoodsInfo;
import org.myproject.boot.application.admin.pojo.GoodsInfoQuery;
import org.myproject.boot.application.admin.pojo.GoodsInfoVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
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
public class GoodsInfoApiImpl implements BGoodsInfoApi {
    private final TbConverter tbConverter;
    private final TbGoodsInfoService goodsInfoService;

    @Override
    public IPage<GoodsInfo> selectByQuery(GoodsInfoQuery query, int page, int size) {
        TbGoodsInfoQuery goodsInfoQuery = tbConverter.goodsInfo(query);
        PageInfo<TbGoodsInfo> pageInfo = goodsInfoService.selectByQuery(goodsInfoQuery, page, size);
        return new PageResult<>(tbConverter.goodsInfo(pageInfo));
    }

    @Override
    public List<GoodsInfo> selectByQuery(GoodsInfoQuery query) {
        TbGoodsInfoQuery goodsInfoQuery = tbConverter.goodsInfo(query);
        List<TbGoodsInfo> list = goodsInfoService.selectByQuery(goodsInfoQuery);
        return tbConverter.goodsInfo(list);
    }

    @Override
    public GoodsInfo get(Long id) {
        TbGoodsInfo goodsInfo = goodsInfoService.selectByPrimaryKey(id);
        return tbConverter.goodsInfo(goodsInfo);
    }

    @Override
    public void insert(GoodsInfoVo vo) {
        goodsInfoService.insert(tbConverter.goodsInfo(vo));
    }

    @Override
    public void update(GoodsInfoVo vo) {
        goodsInfoService.updateByPrimaryKeySelective(tbConverter.goodsInfo(vo));
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