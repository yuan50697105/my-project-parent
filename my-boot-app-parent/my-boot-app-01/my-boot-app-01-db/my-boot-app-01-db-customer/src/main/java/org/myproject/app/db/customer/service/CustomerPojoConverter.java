package org.myproject.app.db.customer.service;

import org.mapstruct.Mapper;
import org.myproject.app.db.customer.pojo.CustomerInfo;
import org.myproject.app.db.customer.pojo.CustomerInfoVo;
import org.myproject.app.db.customer.pojo.CustomerType;
import org.myproject.app.db.customer.pojo.CustomerTypeVo;

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
