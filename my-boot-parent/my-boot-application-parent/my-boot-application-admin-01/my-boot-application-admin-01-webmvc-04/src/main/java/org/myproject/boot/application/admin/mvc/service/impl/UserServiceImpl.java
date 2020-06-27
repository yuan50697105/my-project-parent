package org.myproject.boot.application.admin.mvc.service.impl;

import org.myproject.boot.application.admin.db.plus.pagehelper.service.SysUserService;
import org.myproject.boot.application.admin.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 19:06
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserService sysUserService;


}