package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoVo;
import org.myproject.boot.application.admin.db.service.base.TbGoodsInfoService;
import org.myproject.boot.application.admin.db.service.business.BGoodsInfoService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:23
 */
@Service
@AllArgsConstructor
@Transactional
public class BGoodsInfoServiceImpl implements BGoodsInfoService {
    private final TbGoodsInfoService goodsInfoService;

    @Override
    public PageResult<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size) {
        return new PageResult<>(goodsInfoService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query) {
        return goodsInfoService.selectByQuery(query);
    }

    @Override
    public void insert(TbGoodsInfoVo vo) {
        TbGoodsInfo entity = createEntity(vo);
        goodsInfoService.insert(entity);
    }

    @Override
    public void update(TbGoodsInfoVo vo) {
        TbGoodsInfo entity = createEntity(vo);
        goodsInfoService.updateByPrimaryKeySelective(entity);
    }

    @Override
    public void delete(List<Long> ids) {
        TbGoodsInfoExample example = new TbGoodsInfoExample();
        example.or().andIdIn(ids);
        goodsInfoService.deleteByExample(example);
    }

    @Override
    public void delete(Long id) {
        goodsInfoService.deleteByPrimaryKey(id);
    }

    private TbGoodsInfo createEntity(TbGoodsInfoVo vo) {
        TbGoodsInfo tbGoodsInfo = new TbGoodsInfo();
        tbGoodsInfo.setCode(vo.getCode());
        tbGoodsInfo.setName(vo.getName());
        tbGoodsInfo.setPrice(vo.getPrice());
        tbGoodsInfo.setTypeId(vo.getTypeId());
        tbGoodsInfo.setId(vo.getId());
        return tbGoodsInfo;
    }
}