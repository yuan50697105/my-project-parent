package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoVo;
import org.myproject.boot.application.admin.db.service.base.TbGoodsInfoService;
import org.myproject.boot.application.admin.db.service.business.BGoodsInfoService;
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
public class BGoodsInfoServiceImpl implements BGoodsInfoService {
    private final TbGoodsInfoService customerTypeService;

    @Override
    public PageResult<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size) {
        return new PageResult<TbGoodsInfo>(customerTypeService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query) {
        return customerTypeService.selectByQuery(query);
    }

    @Override
    public TbGoodsInfo selectById(Long id) {
        return customerTypeService.getById(id);
    }

    @Override
    public void save(TbGoodsInfoVo vo) {
        customerTypeService.save(convert(vo));
    }

    @Override
    public void update(TbGoodsInfoVo vo) {
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