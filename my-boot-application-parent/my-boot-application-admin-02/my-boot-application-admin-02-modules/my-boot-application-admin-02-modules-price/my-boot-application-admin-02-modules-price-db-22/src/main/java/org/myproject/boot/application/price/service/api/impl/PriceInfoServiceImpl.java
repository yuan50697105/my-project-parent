package org.myproject.boot.application.price.service.api.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.price.commons.pojo.PriceInfoAo;
import org.myproject.boot.application.price.commons.pojo.PriceInfoQuery;
import org.myproject.boot.application.price.commons.pojo.PriceInfoVo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoQuery;
import org.myproject.boot.application.price.db.service.TbPriceInfoService;
import org.myproject.boot.application.price.service.PriceConverter;
import org.myproject.boot.application.price.service.api.PriceInfoService;
import org.myproject.boot.application.price.service.pojo.PageResult;
import org.springframework.stereotype.Service;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-16 20:48
 */
@Service
@AllArgsConstructor
public class PriceInfoServiceImpl implements PriceInfoService {
    private final TbPriceInfoService service;
    private final PriceConverter converter;

    @Override
    public PriceInfoAo get(Long id) {
        return converter.priceQuery(service.getById(id));
    }

    @Override
    public IPage<PriceInfoAo> list(PriceInfoQuery query, int page, int limit) {
        TbPriceInfoQuery priceInfoQuery = converter.priceQuery(query);
        return new PageResult<>(converter.priceQuery(service.selectByQuery(priceInfoQuery, page, limit)));
    }

    @Override
    public void save(PriceInfoVo priceInfoVo) {
        switch (priceInfoVo.getEvent()) {
            case ADD:
                add(priceInfoVo);
                break;
            case UPDATE:
                update(priceInfoVo);
                break;
        }
    }

    private void update(PriceInfoVo priceInfoVo) {
        TbPriceInfo tbPriceInfo = service.getById(priceInfoVo.getId());
        TbPriceInfo priceInfo = converter.priceSave(priceInfoVo);
        BeanUtil.copyProperties(priceInfo, tbPriceInfo, CopyOptions.create().ignoreNullValue());
        service.updateById(priceInfo);

    }

    private void add(PriceInfoVo priceInfoVo) {
        TbPriceInfo priceInfo = converter.priceSave(priceInfoVo);
        service.save(priceInfo);
    }

    @Override
    public void delete(Long id) {
        service.removeById(id);
    }
}