package org.myproject.boot.application.admin.cxf.webservice.impl;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.admin.cxf.webservice.WebSysRoleService;
import org.myproject.boot.application.admin.cxf.webservice.WebSysUserService;
import org.myproject.boot.application.admin.db.pojo.SysRoleVo;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-06-30 21:34
 */
@WebService(targetNamespace = WebSysUserService.TARGET_NAMESPACE,
        serviceName = WebSysUserService.SERVICE_NAME, endpointInterface = "org.myproject.boot.application.admin.cxf.webservice.WebSysUserService")
@Component
public class WebSysRoleServiceImpl implements WebSysRoleService {
    @Override
    public Result<?> save(SysRoleVo vo) {
        return null;
    }
}