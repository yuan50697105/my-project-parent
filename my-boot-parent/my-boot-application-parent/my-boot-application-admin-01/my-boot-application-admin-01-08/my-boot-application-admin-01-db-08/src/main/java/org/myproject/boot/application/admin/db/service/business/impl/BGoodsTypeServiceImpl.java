package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeVo;
import org.myproject.boot.application.admin.db.service.business.BGoodsTypeService;
import org.myproject.boot.application.admin.db.service.table.TbGoodsTypeService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-07
 * @description:
 * @author: yuane
 * @create: 2020-07-06 22:07
 */
@Service
@AllArgsConstructor
@Transactional
public class BGoodsTypeServiceImpl implements BGoodsTypeService {
    private final TbGoodsTypeService goodsTypeService;

    @Override
    public PageResult<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int size) {
        return new PageResult<TbGoodsType>(goodsTypeService.selectByQuery(query,page,size));
    }

    @Override
    public List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query) {
        return goodsTypeService.selectByQuery(query);
    }

    @Override
    public TbGoodsType selectById(Long id) {
        return goodsTypeService.getById(id);
    }

    @Override
    public void save(TbGoodsTypeVo vo) {
        goodsTypeService.save(convert(vo));
    }

    @Override
    public void update(TbGoodsTypeVo vo) {
        goodsTypeService.updateById(convert(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        goodsTypeService.removeByIds(ids);
    }

    @Override
    public void delete(Long id) {
        goodsTypeService.removeById(id);
    }

    private TbGoodsType convert(TbGoodsTypeVo vo) {
        TbGoodsType tbGoodsType = new TbGoodsType();
        tbGoodsType.setName(vo.getName());
        tbGoodsType.setId(vo.getId());
        return tbGoodsType;
    }
}