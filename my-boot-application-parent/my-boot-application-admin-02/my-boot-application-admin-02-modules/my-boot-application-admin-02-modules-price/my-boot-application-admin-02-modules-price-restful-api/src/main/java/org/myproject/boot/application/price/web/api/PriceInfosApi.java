package org.myproject.boot.application.price.web.api;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.price.commons.pojo.PriceInfoAo;
import org.myproject.boot.application.price.commons.pojo.PriceInfoQuery;
import org.myproject.boot.application.price.commons.pojo.PriceInfoVo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-16 20:35
 */
@RequestMapping("price/infos")
public interface PriceInfosApi {
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    Result<PriceInfoAo> get(@PathVariable Long id);

    @GetMapping("/{id}/price")
    Result<BigDecimal> getPrice(@PathVariable Long id);

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    Result<List<PriceInfoAo>> list(PriceInfoQuery query, int page, int limit);

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<?> add(@RequestBody PriceInfoVo priceInfoAo);

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<?> update(@PathVariable Long id, @RequestBody PriceInfoVo priceInfoAo);

    @DeleteMapping("/{id}")
    Result<?> delete(@PathVariable Long id);

}
