package org.myproject.boot.application.goods.service.api;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeAo;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeQuery;
import org.myproject.boot.application.goods.commons.pojo.GoodsTypeVo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsType;
import org.myproject.boot.application.goods.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.goods.db.service.TbGoodsTypeService;
import org.myproject.boot.application.goods.service.GoodsConverter;
import org.myproject.boot.application.goods.service.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 13:36
 */
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Autowired
    private GoodsConverter converter;
    @Autowired
    private TbGoodsTypeService goodsTypeService;

    @Override
    public void save(GoodsTypeVo goodsTypeVo) {
        switch (goodsTypeVo.getEvent()) {
            case UPDATE:
                update(goodsTypeVo);
                break;
            case ADD:
                add(goodsTypeVo);
                break;
        }
    }

    private void update(GoodsTypeVo goodsTypeVo) {
        TbGoodsType tbGoodsType = goodsTypeService.selectByPrimaryKey(goodsTypeVo.getId());
        converter.copyType(goodsTypeVo, tbGoodsType);
        goodsTypeService.updateByPrimaryKeySelective(tbGoodsType);
    }

    private void add(GoodsTypeVo goodsTypeVo) {
        TbGoodsType tbGoodsType = converter.typeVo(goodsTypeVo);
        goodsTypeService.insert(tbGoodsType);
    }

    @Override
    public void delete(Long id) {
        goodsTypeService.deleteByPrimaryKey(id);
    }

    @Override
    public GoodsTypeAo get(Long id) {
        TbGoodsType tbGoodsType = goodsTypeService.selectByPrimaryKey(id);
        return converter.typeAo(tbGoodsType);
    }

    @Override
    public List<GoodsTypeAo> list(GoodsTypeQuery query) {
        TbGoodsTypeQuery goodsTypeQuery = converter.typeQuery(query);
        List<TbGoodsType> list = goodsTypeService.selectByQuery(goodsTypeQuery);
        return converter.typeAos(list);
    }

    @Override
    public IPage<GoodsTypeAo> list(GoodsTypeQuery query, int page, int limit) {
        TbGoodsTypeQuery goodsTypeQuery = converter.typeQuery(query);
        PageInfo<TbGoodsType> pageInfo = goodsTypeService.selectByQuery(goodsTypeQuery, page, limit);
        return new PageResult<>(converter.typeAos(pageInfo));
    }
}