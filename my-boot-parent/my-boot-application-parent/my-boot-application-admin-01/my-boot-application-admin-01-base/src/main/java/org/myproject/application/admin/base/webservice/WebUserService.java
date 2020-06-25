package org.myproject.application.admin.base.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 15:47
 */
@WebService(targetNamespace = WebUserService.HTTP_WEB_USER_SERVICE)
public interface WebUserService {

    String HTTP_WEB_USER_SERVICE = "http://web,ser.service";
    String SERVICE_NAME = "WebUserService";
    String SERVICE_NAME_URL = "/" + SERVICE_NAME;

    @WebMethod
    String user();
}
