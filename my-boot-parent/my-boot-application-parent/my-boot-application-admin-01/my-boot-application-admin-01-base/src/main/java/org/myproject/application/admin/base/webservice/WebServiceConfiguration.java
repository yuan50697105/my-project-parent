package org.myproject.application.admin.base.webservice;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import javax.xml.ws.Endpoint;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 16:01
 */
@SpringBootConfiguration
public class WebServiceConfiguration {
    @Bean(WebUserService.SERVICE_NAME)
    public Endpoint webUserServicePoint(Bus bus,WebUserService webUserService){
        EndpointImpl endpoint = new EndpointImpl(bus,webUserService);
        endpoint.publish(WebUserService.SERVICE_NAME_URL);
        return endpoint;
    }
}