package org.myproject.boot.application.admin;

import cn.hutool.extra.spring.SpringUtil;
import org.junit.jupiter.api.Test;
import org.myproject.boot.application.admin.service.policy.BCustomerInfoPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-12 09:22
 */
@SpringBootTest(classes = Application.class)
public class ApplicationTests {

    @Test
    void name() {
        BCustomerInfoPolicy policy = SpringUtil.getBean(BCustomerInfoPolicy.class);
        System.out.println("policy.getMap() = " + policy.getMap());
    }
}