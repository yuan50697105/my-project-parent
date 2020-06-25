package org.myproject.boot.application.admin.mvc.controller;

import org.myproject.boot.application.admin.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 19:06
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
}