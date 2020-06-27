package org.myproject.boot.application.admin.jersey.service.impl;

import org.myproject.boot.application.admin.jersey.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 19:12
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String hello() {
        return "hello";
    }
}