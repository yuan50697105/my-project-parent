package org.myproject.boot.application.price.web.api;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.price.commons.pojo.PriceInfoAo;
import org.myproject.boot.application.price.commons.pojo.PriceInfoQuery;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

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
    Result<PriceInfoAo> list(PriceInfoQuery query, int page, int limit);

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<Void> add(@RequestBody PriceInfoAo priceInfoAo);

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<Void> update(@PathVariable Long id, @RequestBody PriceInfoAo priceInfoAo);

    @DeleteMapping("/{id}")
    Result<Void> delete(@PathVariable Long id);

}
