package org.myproject.boot.application.price.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.price.commons.pojo.PriceInfoAo;
import org.myproject.boot.application.price.commons.pojo.PriceInfoQuery;
import org.myproject.boot.application.price.commons.pojo.PriceInfoVo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoQuery;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-16 21:22
 */
public interface PriceConverter {
    PriceInfoAo priceQuery(TbPriceInfo tbPriceInfo);

    PageInfo<PriceInfoAo> priceQuery(PageInfo<TbPriceInfo> priceInfoPageInfo);

    TbPriceInfo priceSave(PriceInfoVo priceInfoVo);

    TbPriceInfoQuery priceQuery(PriceInfoQuery query);
}
