package org.myproject.application.admin.base;

import lombok.SneakyThrows;
import org.apache.cxf.staxutils.StaxUtils;
import org.junit.jupiter.api.Test;
import org.myproject.application.admin.base.webservice.WebUserService;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 16:22
 */
@SpringBootTest(classes = Application.class)
public class ApplicationTests {
    @SneakyThrows
    @Test
    void name() {
        Service service = Service.create(new URL("http://localhost:8080/services/WebUserService?wsdl"), new QName(WebUserService.HTTP_WEB_USER_SERVICE));
        Dispatch<Source> dispatch = service.createDispatch(new QName(WebUserService.HTTP_WEB_USER_SERVICE), Source.class, Service.Mode.PAYLOAD);
        Source source = dispatch.invoke(new StreamSource("aaaaa"));
        String string = StaxUtils.toString(source);
        System.out.println("string = " + string);
    }
}