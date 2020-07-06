package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoVo;
import org.myproject.boot.application.admin.db.service.business.BGoodsInfoService;
import org.myproject.boot.application.admin.db.service.business.BGoodsInfoService;
import org.myproject.boot.application.admin.db.service.table.TbGoodsInfoService;
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
public class BGoodsInfoServiceImpl implements BGoodsInfoService {
    private final TbGoodsInfoService customerTypeService;

    @Override
    public PageResult<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size) {
        return new PageResult<>(customerTypeService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query) {
        return customerTypeService.selectByQuery(query);
    }

    @Override
    public TbGoodsInfo selectById(Long id) {
        return customerTypeService.selectById(id);
    }

    @Override
    public void save(TbGoodsInfoVo vo) {
        customerTypeService.insert(convert(vo));
    }

    @Override
    public void update(TbGoodsInfoVo vo) {
        customerTypeService.updateSelective(convert(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        Object o = Example.builder(TbGoodsInfo.class).where(Sqls.custom().andIn("id",ids)).build();
        customerTypeService.deleteByExample(o);
    }

    @Override
    public void delete(Long id) {
        customerTypeService.deleteById(id);
    }

    private TbGoodsInfo convert(TbGoodsInfoVo vo) {
        TbGoodsInfo tbGoodsInfo = new TbGoodsInfo();
        tbGoodsInfo.setCode(vo.getCode());
        tbGoodsInfo.setName(vo.getName());
        tbGoodsInfo.setPrice(vo.getPrice());
        tbGoodsInfo.setTypeId(vo.getTypeId());
        tbGoodsInfo.setId(vo.getId());
        return tbGoodsInfo;
    }
}