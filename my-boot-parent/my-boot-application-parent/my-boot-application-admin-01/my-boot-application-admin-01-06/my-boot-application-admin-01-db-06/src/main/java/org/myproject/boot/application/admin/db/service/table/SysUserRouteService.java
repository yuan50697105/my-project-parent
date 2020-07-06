package org.myproject.boot.application.admin.db.service.table;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-02 23:43
 */
public interface SysUserRouteService {
    List<String> selectByUserId(Long userId);
}
