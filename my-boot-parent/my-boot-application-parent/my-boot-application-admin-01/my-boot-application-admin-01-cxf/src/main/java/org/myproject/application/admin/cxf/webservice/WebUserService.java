package org.myproject.application.admin.cxf.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 15:47
 */
@WebService(targetNamespace = WebUserService.NAMESPACE, name = WebUserService.SERVICE_NAME)
public interface WebUserService {

    String NAMESPACE = "http://web.ser.service";
    String SERVICE_NAME = "WebUserService";
    String SERVICE_NAME_URL = "/" + SERVICE_NAME;

    @WebMethod
    String user();
}
