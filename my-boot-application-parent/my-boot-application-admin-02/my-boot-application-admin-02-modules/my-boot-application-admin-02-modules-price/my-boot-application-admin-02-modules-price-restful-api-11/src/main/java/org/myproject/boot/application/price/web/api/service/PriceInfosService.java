package org.myproject.boot.application.price.web.api.service;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.price.commons.pojo.PriceInfoAo;
import org.myproject.boot.application.price.commons.pojo.PriceInfoQuery;
import org.myproject.boot.application.price.commons.pojo.PriceInfoVo;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-16 21:04
 */
public interface PriceInfosService {
    Result<PriceInfoAo> get(Long id);

    Result<BigDecimal> getPrice(Long id);

    Result<List<PriceInfoAo>> list(PriceInfoQuery query, int page, int limit);

    Result<?> add(PriceInfoVo priceInfoAo);

    Result<?> update(Long id, PriceInfoVo priceInfoAo);

    Result<?> delete(Long id);
}
