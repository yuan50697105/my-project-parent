package org.myproject.boot.application.admin.cxf.webservice;

import javax.jws.WebMethod;
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
}
