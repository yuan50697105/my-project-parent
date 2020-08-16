package org.myproject.boot.application.admin.web.api.service;

import org.myproject.boot.application.admin.web.api.pojo.SysRolesAo;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersAo;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersQuery;
import org.myproject.boot.application.admin.web.api.pojo.SysUsersVo;
import org.myproject.boot.application.commons.pojo.IPage;

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

    IPage<SysUsersAo> list(SysUsersQuery query, int page, int limit);

    List<SysUsersAo> list(SysUsersQuery query);

    void add(SysUsersVo sysUsersAo);

    void update(SysUsersVo sysUsersVo);

    void delete(Long id);
}