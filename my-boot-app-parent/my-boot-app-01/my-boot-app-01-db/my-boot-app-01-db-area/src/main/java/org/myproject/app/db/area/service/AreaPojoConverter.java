package org.myproject.app.db.area.service;

import org.mapstruct.Mapper;
import org.myproject.app.db.area.pojo.AreaAddress;
import org.myproject.app.db.area.pojo.AreaAddressVo;
import org.myproject.app.db.area.pojo.AreaInfo;
import org.myproject.app.db.area.pojo.AreaInfoVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 23:34
 */
@Mapper(componentModel = "spring")
public interface AreaPojoConverter {
    AreaInfo convert(AreaInfoVo areaInfoVo);

    AreaAddress convert(AreaAddressVo areaAddressVo);

}
