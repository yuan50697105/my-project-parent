package org.myproject.boot.application.admin.db.api;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.api.BGoodsTypeApi;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.admin.db.service.TbGoodsTypeService;
import org.myproject.boot.application.admin.pojo.GoodsType;
import org.myproject.boot.application.admin.pojo.GoodsTypeQuery;
import org.myproject.boot.application.admin.pojo.GoodsTypeVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
public class GoodsTypeApiImpl implements BGoodsTypeApi {
    private final TbConverter tbConverter;
    private final TbGoodsTypeService goodsTypeService;

    @Override
    public IPage<GoodsType> selectByQuery(GoodsTypeQuery query, int page, int size) {
        TbGoodsTypeQuery goodsTypeQuery = tbConverter.goodsType(query);
        PageInfo<TbGoodsType> pageInfo = goodsTypeService.selectByQuery(goodsTypeQuery, page, size);
        return new PageResult<>(tbConverter.goodsType(pageInfo));
    }

    @Override
    public List<GoodsType> selectByQuery(GoodsTypeQuery query) {
        TbGoodsTypeQuery goodsTypeQuery = tbConverter.goodsType(query);
        List<TbGoodsType> list = goodsTypeService.selectByQuery(goodsTypeQuery);
        return tbConverter.goodsType(list);
    }

    @Override
    public GoodsType get(Long id) {
        TbGoodsType goodsType = goodsTypeService.selectByPrimaryKey(id);
        return tbConverter.goodsType(goodsType);
    }

    @Override
    public void insert(GoodsTypeVo vo) {
        TbGoodsType record = tbConverter.goodsType(vo);
        goodsTypeService.insert(record);
    }

    @Override
    public void update(GoodsTypeVo vo) {
        goodsTypeService.updateByPrimaryKeySelective(tbConverter.goodsType(vo));
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