package org.myproject.boot.application.admin.cxf.webservice;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUserVo;
import org.springframework.validation.annotation.Validated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 15:47
 */
@WebService(targetNamespace = WebUserWsService.NAMESPACE, name = WebUserWsService.SERVICE_NAME)
public interface WebUserWsService {

    String NAMESPACE = "http://web.ser.service";
    String SERVICE_NAME = "WebUserService";
    String SERVICE_NAME_URL = "/" + SERVICE_NAME;

    @WebMethod
    String user();

    @WebMethod
    Result<?> save(@WebParam @Validated SysUserVo sysUser);

    @WebMethod
    Result<?> update(@WebParam @Validated SysUserVo sysUserVo);

    @WebMethod
    Result<?> list(@WebParam SysUserQuery query);

}
