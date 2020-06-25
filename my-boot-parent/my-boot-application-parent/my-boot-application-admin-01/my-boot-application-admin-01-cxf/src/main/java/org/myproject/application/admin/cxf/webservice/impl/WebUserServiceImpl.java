package org.myproject.application.admin.cxf.webservice.impl;

import cn.hutool.json.JSONUtil;
import org.myproject.application.admin.cxf.pojo.User;
import org.myproject.application.admin.cxf.webservice.WebUserService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 15:47
 */
@WebService(targetNamespace = WebUserService.NAMESPACE, serviceName = WebUserService.SERVICE_NAME,portName = WebUserService.SERVICE_NAME, endpointInterface = "org.myproject.application.admin.cxf.webservice.WebUserService")
@Component
public class WebUserServiceImpl implements WebUserService {
    @Override
    public String user() {
        return JSONUtil.toJsonPrettyStr(new User());
    }
}