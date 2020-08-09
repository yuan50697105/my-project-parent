package org.myproject.boot.application.admin.web.api.service;

import org.myproject.boot.application.admin.web.api.pojo.SysRolesAo;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-08 19:46
 */
public interface SysRolesService {
    SysRolesAo get(Long id);
}
