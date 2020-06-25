package org.myproject.boot.application.admin.cxf.webservice.impl;

import cn.hutool.json.JSONUtil;
import org.myproject.boot.application.admin.cxf.pojo.User;
import org.myproject.boot.application.admin.cxf.webservice.WebUserWsService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 15:47
 */
@WebService(targetNamespace = WebUserWsService.NAMESPACE, serviceName = WebUserWsService.SERVICE_NAME,portName = WebUserWsService.SERVICE_NAME, endpointInterface = "org.myproject.boot.application.admin.cxf.webservice.WebUserWsService")
@Component
public class WebUserWsServiceImpl implements WebUserWsService {
    @Override
    public String user() {
        User user = new User();
        user.setId(1L);
        user.setName("aaa");
        return JSONUtil.toJsonPrettyStr(user);
    }
}