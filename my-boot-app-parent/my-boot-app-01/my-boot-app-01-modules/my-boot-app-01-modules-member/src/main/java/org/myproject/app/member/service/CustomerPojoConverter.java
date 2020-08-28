package org.myproject.app.member.service;

import org.mapstruct.Mapper;

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
