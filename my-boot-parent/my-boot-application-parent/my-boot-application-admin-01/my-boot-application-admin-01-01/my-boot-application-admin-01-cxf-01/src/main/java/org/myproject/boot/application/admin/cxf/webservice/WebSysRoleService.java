package org.myproject.boot.application.admin.cxf.webservice;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.admin.db.pojo.SysRoleVo;

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
public interface WebSysRoleService {
    String SERVICE_NAME = "WebSysRoleService";
    String TARGET_NAMESPACE = "http://web.role.service";
    String SERVICE_NAME_URL = "/" + SERVICE_NAME;

    @WebMethod
    Result<?> save(@WebParam SysRoleVo vo);
}