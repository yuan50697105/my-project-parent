package org.myproject.boot.application.admin.db.service.base;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-30 18:25
 */
public interface SysUserRouteService {
    List<String> selectByUserId(Long userId);
}
