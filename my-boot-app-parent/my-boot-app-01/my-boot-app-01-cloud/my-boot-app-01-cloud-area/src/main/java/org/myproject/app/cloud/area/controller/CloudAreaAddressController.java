package org.myproject.app.cloud.area.controller;

import org.myproject.app.area.controller.AreaAddressController;
import org.myproject.app.area.service.AreaAddressService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-project-spring
 * @description:
 * @author: yuane
 * @create: 2020-09-01 22:00
 */
@RestController
public class CloudAreaAddressController extends AreaAddressController implements CloudAreaAddressClient {
    public CloudAreaAddressController(AreaAddressService areaAddressService) {
        super(areaAddressService);
    }
}