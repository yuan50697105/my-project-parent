package org.myproject.app.customer.service;

import org.mapstruct.Mapper;
import org.myproject.app.customer.pojo.CustomerInfo;
import org.myproject.app.customer.pojo.CustomerInfoVo;
import org.myproject.app.customer.pojo.CustomerType;
import org.myproject.app.customer.pojo.CustomerTypeVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 18:50
 */
@Mapper(componentModel = "spring")
public interface CustomerPojoConverter {
    CustomerType convert(CustomerTypeVo customerTypeVo);

    CustomerInfo convert(CustomerInfoVo customerInfoVo);
}
