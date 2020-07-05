package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeVo;
import org.myproject.boot.application.admin.db.service.business.BGoodsTypeService;
import org.myproject.boot.application.admin.db.service.base.TbGoodsTypeService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:04
 */
@Service
@Transactional
@AllArgsConstructor
public class BGoodsTypeServiceImpl implements BGoodsTypeService {
    private final TbGoodsTypeService goodsTypeService;

    @Override
    public PageResult<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int size) {
        return new PageResult<>(goodsTypeService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query) {
        return goodsTypeService.selectByQuery(query);
    }

    @Override
    public void insert(TbGoodsTypeVo vo) {
        TbGoodsType goodsType = createGoodsType(vo);
        goodsTypeService.insert(goodsType);
    }

    @Override
    public void update(TbGoodsTypeVo vo) {
        TbGoodsType goodsType = createGoodsType(vo);
        goodsTypeService.updateByPrimaryKeySelective(goodsType);
    }

    @Override
    public void delete(List<Long> ids) {
        TbGoodsTypeExample example = new TbGoodsTypeExample();
        example.or().andIdIn(ids);
        goodsTypeService.deleteByExample(example);
    }

    @Override
    public void delete(Long id) {
        goodsTypeService.deleteByPrimaryKey(id);
    }

    @Override
    public TbGoodsType selectById(Long id) {
        return goodsTypeService.selectByPrimaryKey(id);
    }


    private TbGoodsType createGoodsType(TbGoodsTypeVo vo) {
        TbGoodsType tbGoodsType = new TbGoodsType();
        tbGoodsType.setName(vo.getName());
        tbGoodsType.setId(vo.getId());
        return tbGoodsType;
    }
}