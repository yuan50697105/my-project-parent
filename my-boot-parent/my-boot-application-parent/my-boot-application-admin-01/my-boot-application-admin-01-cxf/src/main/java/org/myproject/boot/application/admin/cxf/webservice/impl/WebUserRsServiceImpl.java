package org.myproject.boot.application.admin.cxf.webservice.impl;

import org.myproject.boot.application.admin.cxf.webservice.WebUserRsService;
import org.springframework.stereotype.Service;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 18:29
 */
@Service
public class WebUserRsServiceImpl implements WebUserRsService {
    @Override
    public String aa() {
        return "aa";
    }
}