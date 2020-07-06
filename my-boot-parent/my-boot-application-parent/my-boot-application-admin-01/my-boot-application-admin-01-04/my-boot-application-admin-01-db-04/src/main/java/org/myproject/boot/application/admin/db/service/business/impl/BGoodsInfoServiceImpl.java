package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoVo;
import org.myproject.boot.application.admin.db.service.table.TbGoodsInfoService;
import org.myproject.boot.application.admin.db.service.business.BGoodsInfoService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-04
 * @description:
 * @author: yuane
 * @create: 2020-07-06 00:26
 */
@Service
@AllArgsConstructor
@Transactional
public class BGoodsInfoServiceImpl implements BGoodsInfoService {
    private final TbGoodsInfoService goodsInfoService;

    @Override
    public PageResult<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size) {
        return new PageResult<TbGoodsInfo>(goodsInfoService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query) {
        return goodsInfoService.selectByQuery(query);
    }

    @Override
    public void save(TbGoodsInfoVo vo) {
        goodsInfoService.save(convert(vo));
    }

    @Override
    public void update(TbGoodsInfoVo vo) {
        goodsInfoService.updateById(convert(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        goodsInfoService.removeByIds(ids);
    }

    @Override
    public void delete(Long id) {
        goodsInfoService.removeById(id);
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