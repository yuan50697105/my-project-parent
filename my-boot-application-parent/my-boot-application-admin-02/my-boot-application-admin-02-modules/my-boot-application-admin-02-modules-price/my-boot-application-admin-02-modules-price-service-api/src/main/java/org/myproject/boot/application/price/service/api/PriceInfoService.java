package org.myproject.boot.application.price.service.api;

import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.price.commons.pojo.PriceInfoAo;
import org.myproject.boot.application.price.commons.pojo.PriceInfoQuery;
import org.myproject.boot.application.price.commons.pojo.PriceInfoVo;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-16 20:48
 */
public interface PriceInfoService {
    PriceInfoAo get(Long id);

    IPage<PriceInfoAo> list(PriceInfoQuery query, int page, int limit);


    void save(PriceInfoVo priceInfoAo);

    void delete(Long id);
}
