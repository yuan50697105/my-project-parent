package org.myproject.boot.application.admin.service.api;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.admin.db.service.TbGoodsTypeService;
import org.myproject.boot.application.admin.service.pojo.GoodsType;
import org.myproject.boot.application.admin.service.pojo.GoodsTypeQuery;
import org.myproject.boot.application.admin.service.pojo.GoodsTypeVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.context.annotation.Primary;
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
@Primary
public class GoodsTypeApiImpl implements BGoodsTypeApi {
    private final TbConverter converter;
    private final TbGoodsTypeService goodsTypeService;

    @Override
    public IPage<GoodsType> selectByQuery(GoodsTypeQuery query, int page, int size) {
        TbGoodsTypeQuery goodsTypeQuery = converter.goodsType(query);
        PageInfo<TbGoodsType> pageInfo = goodsTypeService.selectByQuery(goodsTypeQuery, page, size);
        return new PageResult<>(converter.goodsType(pageInfo));
    }

    @Override
    public List<GoodsType> selectByQuery(GoodsTypeQuery query) {
        TbGoodsTypeQuery goodsTypeQuery = converter.goodsType(query);
        List<TbGoodsType> list = goodsTypeService.selectByQuery(goodsTypeQuery);
        return converter.goodsType(list);
    }

    @Override
    public GoodsType get(Long id) {
        TbGoodsType goodsType = goodsTypeService.selectByPrimaryKey(id);
        return converter.goodsType(goodsType);
    }

    @Override
    public void save(GoodsTypeVo vo) {
        TbGoodsType record = converter.goodsType(vo);
        goodsTypeService.insert(record);
    }

    @Override
    public void update(GoodsTypeVo vo) {
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