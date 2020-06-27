package org.myproject.boot.application.admin.cxf.webservice;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.admin.db.pojo.SysUserVo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-27 18:07
 */
@WebService
public interface WebSysUserService {
    String SERVICE_NAME = "WebSysUserService2";
    String TARGET_NAMESPACE = "http://web.user.service";
    String SERVICE_NAME_URL = "/" + SERVICE_NAME;

    @WebMethod
    Result<?> save(@WebParam SysUserVo sysUserVo);
}