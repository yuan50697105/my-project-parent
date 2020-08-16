package org.myproject.boot.application.price.web.api.controller;

import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.price.commons.pojo.PriceInfoAo;
import org.myproject.boot.application.price.commons.pojo.PriceInfoQuery;
import org.myproject.boot.application.price.commons.pojo.PriceInfoVo;
import org.myproject.boot.application.price.web.api.PriceInfosApi;
import org.myproject.boot.application.price.web.api.service.PriceInfosService;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-16 20:44
 */
@RestController
@AllArgsConstructor
public class PriceInfosController implements PriceInfosApi {
    private final PriceInfosService priceInfosService;

    @Override
    public Result<PriceInfoAo> get(Long id) {
        return priceInfosService.get(id);
    }

    @Override
    public Result<BigDecimal> getPrice(Long id) {
        return priceInfosService.getPrice(id);
    }

    @Override
    public Result<List<PriceInfoAo>> list(PriceInfoQuery query, int page, int limit) {
        return priceInfosService.list(query, page, limit);
    }

    @Override
    public Result<?> add(PriceInfoVo priceInfoAo) {
        return priceInfosService.add(priceInfoAo);
    }

    @Override
    public Result<?> update(Long id, PriceInfoVo priceInfoAo) {
        return priceInfosService.update(id, priceInfoAo);
    }

    @Override
    public Result<?> delete(Long id) {
        return priceInfosService.delete(id);
    }

}