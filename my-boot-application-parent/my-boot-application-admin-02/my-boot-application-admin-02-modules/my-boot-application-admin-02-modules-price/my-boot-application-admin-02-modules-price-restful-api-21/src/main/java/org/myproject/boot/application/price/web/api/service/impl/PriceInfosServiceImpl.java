package org.myproject.boot.application.price.web.api.service.impl;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.price.commons.pojo.PriceInfoAo;
import org.myproject.boot.application.price.commons.pojo.PriceInfoQuery;
import org.myproject.boot.application.price.commons.pojo.PriceInfoVo;
import org.myproject.boot.application.price.service.api.PriceInfoService;
import org.myproject.boot.application.price.web.api.service.PriceInfosService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-16 21:04
 */
@Service
@AllArgsConstructor
public class PriceInfosServiceImpl implements PriceInfosService {
    private final PriceInfoService priceInfoService;


    @Override
    public Result<PriceInfoAo> get(Long id) {
        PriceInfoAo priceInfoAo = priceInfoService.get(id);
        return ResultInfo.success(priceInfoAo);
    }

    @Override
    public Result<BigDecimal> getPrice(Long id) {
        PriceInfoAo priceInfoAo = priceInfoService.get(id);
        BigDecimal bigDecimal = Optional.of(priceInfoAo).map(PriceInfoAo::getPrice).orElse(BigDecimal.ZERO);
        return ResultInfo.success(bigDecimal);
    }

    @Override
    public Result<List<PriceInfoAo>> list(PriceInfoQuery query, int page, int limit) {
        IPage<PriceInfoAo> list = priceInfoService.list(query, page, limit);
        return ResultInfo.success(list.getTotalRows(),list.getList());
    }

    @Override
    public Result<?> add(PriceInfoVo priceInfoAo) {
        priceInfoAo.setEvent(PriceInfoVo.Event.UPDATE);
        priceInfoService.save(priceInfoAo);
        return ResultInfo.success();
    }

    @Override
    public Result<?> update(Long id, PriceInfoVo priceInfoAo) {
        priceInfoAo.setId(id);
        priceInfoAo.setEvent(PriceInfoVo.Event.UPDATE);
        priceInfoService.save(priceInfoAo);
        return ResultInfo.success();
    }

    @Override
    public Result<?> delete(Long id) {
        priceInfoService.delete(id);
        return ResultInfo.success();
    }
}