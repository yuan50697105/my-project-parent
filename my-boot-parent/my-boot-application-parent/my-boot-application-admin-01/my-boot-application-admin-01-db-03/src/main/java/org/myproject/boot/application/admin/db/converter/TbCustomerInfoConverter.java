package org.myproject.boot.application.admin.db.converter;

import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoVo;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-30 18:33
 */
@Mapper(componentModel = "spring")
public interface TbCustomerInfoConverter {
    TbCustomerInfo voToPo(TbCustomerInfoVo customerInfoVo);
}
