package org.myproject.application.admin.base;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsClientFactoryBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.staxutils.StaxUtils;
import org.junit.jupiter.api.Test;
import org.myproject.application.admin.cxf.Application;
import org.myproject.application.admin.cxf.webservice.WebUserService;
import org.springframework.boot.test.context.SpringBootTest;

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
@SpringBootTest(classes = Application.class)
@Slf4j
public class ApplicationTests {
    @SneakyThrows
    @Test
    void name() {
        String address = "http://localhost:8080/services/WebUserService?wsdl";

//        JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
//        Client client = clientFactory.createClient(address);
//        client.invoke("")
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress(address);
        factoryBean.setServiceClass(WebUserService.class);
        WebUserService webUserService = (WebUserService) factoryBean.create();
        String user = webUserService.user();
        log.info(user);
    }
}