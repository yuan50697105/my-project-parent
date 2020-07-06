package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoVo;
import org.myproject.boot.application.admin.db.service.business.BGoodsInfoService;
import org.myproject.boot.application.admin.db.service.table.TbGoodsInfoService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-05
 * @description:
 * @author: yuane
 * @create: 2020-07-06 20:03
 */
@Service
@AllArgsConstructor
@Transactional
public class BGoodsInfoServiceImpl implements BGoodsInfoService {
    private final TbGoodsInfoService customerInfoService;

    @Override
    public PageResult<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size) {
        return new PageResult<>(customerInfoService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query) {
        return customerInfoService.selectByQuery(query);
    }

    @Override
    public void save(TbGoodsInfoVo vo) {
        customerInfoService.insert(convert(vo));
    }

    @Override
    public void update(TbGoodsInfoVo vo) {
        customerInfoService.updateSelective(convert(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        customerInfoService.deleteByExample(Example.builder(TbGoodsInfo.class).andWhere(Sqls.custom().andIn("id",ids)).build());
    }

    @Override
    public void delete(Long id) {
        customerInfoService.deleteById(id);
    }

    private TbGoodsInfo convert(TbGoodsInfoVo vo) {
        TbGoodsInfo tbGoodsInfo = new TbGoodsInfo();
        tbGoodsInfo.setName(vo.getName());
        tbGoodsInfo.setId(vo.getId());
        return tbGoodsInfo;
    }
}