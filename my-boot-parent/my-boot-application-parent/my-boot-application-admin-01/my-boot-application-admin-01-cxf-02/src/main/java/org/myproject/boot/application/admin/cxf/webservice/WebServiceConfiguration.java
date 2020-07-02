package org.myproject.boot.application.admin.cxf.webservice;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import javax.xml.ws.Endpoint;
import java.util.Arrays;
import java.util.Collections;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 16:01
 */
@SpringBootConfiguration
public class WebServiceConfiguration {
    @Bean(WebUserWsService.SERVICE_NAME)
    public Endpoint webUserServiceWs(Bus bus, WebUserWsService webUserWsService) {
        EndpointImpl endpoint = new EndpointImpl(bus, webUserWsService);
        endpoint.publish(WebUserWsService.SERVICE_NAME_URL);
        return endpoint;
    }

    @Bean(WebSysUserService.SERVICE_NAME)
    public Endpoint webUserService(Bus bus, WebSysUserService webSysUserService) {
        EndpointImpl endpoint = new EndpointImpl(bus, webSysUserService);
        endpoint.publish(WebSysUserService.SERVICE_NAME_URL);
        return endpoint;
    }

}