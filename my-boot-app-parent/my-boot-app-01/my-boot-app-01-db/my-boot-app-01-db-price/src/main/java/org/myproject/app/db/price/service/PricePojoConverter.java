package org.myproject.app.db.price.service;

import org.mapstruct.Mapper;
import org.myproject.app.db.price.pojo.PriceInfo;
import org.myproject.app.db.price.pojo.PriceInfoVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-27 12:20
 */
@Mapper(componentModel = "spring")
public interface PricePojoConverter {
    PriceInfo convert(PriceInfoVo priceInfoVo);

    PriceInfoVo convert(PriceInfo priceInfo);
}
