package org.myproject.boot.application.admin.service.service;

import org.myproject.boot.application.admin.service.pojo.SysRoleAoDTO;
import org.myproject.boot.application.admin.service.pojo.SysRoleVoDTO;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-08 19:21
 */
public interface SysRoleService {
    void save(SysRoleVoDTO sysRoleVoDTO);

    void delete(Long id);

    SysRoleAoDTO get(Long id);
}
