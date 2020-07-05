package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeVo;
import org.myproject.boot.application.admin.db.service.base.TbGoodsTypeService;
import org.myproject.boot.application.admin.db.service.business.BGoodsTypeService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-03
 * @description:
 * @author: yuane
 * @create: 2020-07-05 23:06
 */
@Service
@AllArgsConstructor
@Transactional
public class BGoodsTypeServiceImpl implements BGoodsTypeService {
    private final TbGoodsTypeService customerTypeService;

    @Override
    public PageResult<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int size) {
        return new PageResult<TbGoodsType>(customerTypeService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query) {
        return customerTypeService.selectByQuery(query);
    }

    @Override
    public TbGoodsType selectById(Long id) {
        return customerTypeService.getById(id);
    }

    @Override
    public void save(TbGoodsTypeVo vo) {
        customerTypeService.save(convert(vo));
    }

    @Override
    public void update(TbGoodsTypeVo vo) {
        customerTypeService.updateById(convert(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        customerTypeService.removeByIds(ids);
    }

    @Override
    public void delete(Long id) {
        customerTypeService.removeById(id);
    }

    private TbGoodsType convert(TbGoodsTypeVo vo) {
        TbGoodsType tbGoodsType = new TbGoodsType();
        tbGoodsType.setName(vo.getName());
        tbGoodsType.setId(vo.getId());
        return tbGoodsType;
    }
}