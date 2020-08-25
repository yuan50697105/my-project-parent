package org.myproject.app.device.service;

import org.myproject.app.device.pojo.DeviceInfo;
import org.myproject.app.device.pojo.DeviceInfoVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-25 15:45
 */
public interface DevicePojoConverter {
    DeviceInfo convert(DeviceInfoVo deviceInfoVo);
}
