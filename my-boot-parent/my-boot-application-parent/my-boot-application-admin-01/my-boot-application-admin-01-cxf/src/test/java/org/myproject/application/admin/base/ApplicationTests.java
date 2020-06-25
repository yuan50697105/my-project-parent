package org.myproject.application.admin.base;

import lombok.SneakyThrows;
import org.apache.cxf.staxutils.StaxUtils;
import org.junit.jupiter.api.Test;
import org.myproject.application.admin.cxf.webservice.WebUserService;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 16:22
 */
//@SpringBootTest(classes = Application.class)
public class ApplicationTests {
    @SneakyThrows
    @Test
    void name() {
        String address = "http://localhost:8080/services/WebUserService?wsdl";

        Service service = Service.create(new URL(address),
                new QName(WebUserService.NAMESPACE, WebUserService.SERVICE_NAME));
        Dispatch<Source> disp = service.createDispatch(new QName(WebUserService.NAMESPACE , WebUserService.SERVICE_NAME),
                Source.class, Service.Mode.PAYLOAD);
        Source result = disp.invoke(new DOMSource());
        String resultAsString = StaxUtils.toString(result);
        System.out.println(resultAsString);
    }
}