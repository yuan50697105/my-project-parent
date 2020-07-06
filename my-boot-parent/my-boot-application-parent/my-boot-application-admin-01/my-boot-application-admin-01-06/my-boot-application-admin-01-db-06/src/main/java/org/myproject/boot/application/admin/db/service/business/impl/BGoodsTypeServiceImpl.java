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
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-06
 * @description:
 * @author: yuane
 * @create: 2020-07-06 20:58
 */
@Service
@AllArgsConstructor
@Transactional
public class BGoodsTypeServiceImpl implements BGoodsTypeService {
    private final TbGoodsTypeService customerTypeService;

    @Override
    public PageResult<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int size) {
        return new PageResult<>(customerTypeService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query) {
        return customerTypeService.selectByQuery(query);
    }

    @Override
    public TbGoodsType selectById(Long id) {
        return customerTypeService.selectById(id);
    }

    @Override
    public void save(TbGoodsTypeVo vo) {
        customerTypeService.insert(convert(vo));
    }

    @Override
    public void update(TbGoodsTypeVo vo) {
        customerTypeService.updateSelective(convert(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        Object o = Example.builder(TbGoodsType.class).where(Sqls.custom().andIn("id",ids)).build();
        customerTypeService.deleteByExample(o);
    }

    @Override
    public void delete(Long id) {
        customerTypeService.deleteById(id);
    }

    private TbGoodsType convert(TbGoodsTypeVo vo) {
        TbGoodsType tbGoodsType = new TbGoodsType();
        tbGoodsType.setName(vo.getName());
        tbGoodsType.setId(vo.getId());
        return tbGoodsType;
    }
}