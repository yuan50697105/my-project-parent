package org.myproject.app.cloud.area.controller;

import org.myproject.app.area.controller.AreaInfoController;
import org.myproject.app.area.service.AreaInfoService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-project-spring
 * @description:
 * @author: yuane
 * @create: 2020-09-01 22:00
 */
@RestController
public class CloudAreaInfoController extends AreaInfoController {
    public CloudAreaInfoController(AreaInfoService areaInfoService) {
        super(areaInfoService);
    }
}