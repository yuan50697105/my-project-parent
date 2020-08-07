package org.myproject.boot.application.admin.api.service;

import org.myproject.boot.application.admin.api.pojo.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-07 22:00
 */
public interface SysUsersService {
    SysUsersAo get(Long id);

    List<SysRolesAo> getRoles(Long id);

    List<SysRolesAo> getRoles(Long userId, Long roleId);

    IPages<SysUsersAo> list(SysUsersQuery query, int page, int limit);

    List<SysUsersAo> list(SysUsersQuery query);

    void add(SysUsersVo sysUsersAo);

    void update(SysUsersVo sysUsersVo);

    void delete(Long id);
}