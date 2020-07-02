package org.myproject.boot.application.admin.db.converter;

import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeVo;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-29 22:09
 */
@Mapper(componentModel = "spring")
public interface TbCustomerTypeConverter {
    TbCustomerType voToPo(TbCustomerTypeVo tbCustomerTypeVo);
}
