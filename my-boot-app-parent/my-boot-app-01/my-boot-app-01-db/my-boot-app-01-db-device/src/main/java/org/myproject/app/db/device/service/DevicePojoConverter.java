package org.myproject.app.db.device.service;

import org.mapstruct.Mapper;
import org.myproject.app.db.device.pojo.DeviceInfo;
import org.myproject.app.db.device.pojo.DeviceInfoVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-25 15:45
 */
@Mapper(componentModel = "spring")
public interface DevicePojoConverter {
    DeviceInfo convert(DeviceInfoVo deviceInfoVo);
}
