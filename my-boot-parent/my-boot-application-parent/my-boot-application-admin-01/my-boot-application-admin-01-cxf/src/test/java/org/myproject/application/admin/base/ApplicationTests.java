package org.myproject.application.admin.base;

import ai.yue.library.base.view.Result;
import cn.hutool.json.JSONUtil;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.jupiter.api.Test;
import org.myproject.boot.application.admin.cxf.Application;
import org.myproject.boot.application.admin.cxf.webservice.WebUserRsService;
import org.myproject.boot.application.admin.cxf.webservice.WebUserWsService;
import org.myproject.boot.application.admin.db.base.pagehelper.pojo.SysUser;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 16:22
 */
@SpringBootTest(classes = Application.class)
@Slf4j
//@EnableJaxRsProxyClient
//@EnableJaxRsWebClient
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
        factoryBean.setServiceClass(WebUserWsService.class);
        WebUserWsService webUserWsService = (WebUserWsService) factoryBean.create();
        String user = webUserWsService.user();
        log.info(user);
        SysUser sysUser = new SysUser();
        Result<?> result = webUserWsService.save(sysUser);
        System.out.println("JSONUtil.toJsonPrettyStr(result) = " + JSONUtil.toJsonPrettyStr(result));
    }

    @Test
    void name2() {
        WebUserRsService webUserRsService = JAXRSClientFactory.create("http://localhost:8080/services/user", WebUserRsService.class);
        String aa = webUserRsService.aa();
        log.info(aa);
        Result<?> result = webUserRsService.save(new SysUser());
        System.out.println("JSONUtil.toJsonPrettyStr(result) = " + JSONUtil.toJsonPrettyStr(result));
//        WebClient.create("http://localhost:8080").path("/services/user")
    }
}