package org.myproject.app.bill.service;


import org.mapstruct.Mapper;
import org.myproject.app.bill.pojo.BillInfo;
import org.myproject.app.bill.pojo.BillInfoVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 23:34
 */
@Mapper(componentModel = "spring")
public interface BillPojoConverter {
    BillInfo convert(BillInfoVo areaInfoVo);


}
