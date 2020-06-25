package org.myproject.application.admin.base.webservice.impl;

import cn.hutool.json.JSONUtil;
import org.myproject.application.admin.base.pojo.User;
import org.myproject.application.admin.base.webservice.WebUserService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 15:47
 */
@WebService(targetNamespace = WebUserService.NAMESPACE, serviceName = WebUserService.SERVICE_NAME,portName = WebUserService.SERVICE_NAME, endpointInterface = "org.myproject.application.admin.base.webservice.WebUserService")
@Component
public class WebUserServiceImpl implements WebUserService {
    @Override
    public String user() {
        return JSONUtil.toJsonPrettyStr(new User());
    }
}