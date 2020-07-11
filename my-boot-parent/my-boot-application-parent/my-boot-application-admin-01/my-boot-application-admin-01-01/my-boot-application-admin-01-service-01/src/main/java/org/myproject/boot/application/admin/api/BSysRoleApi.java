package org.myproject.boot.application.admin.api;


import org.myproject.boot.application.admin.pojo.SysRole;
import org.myproject.boot.application.admin.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.pojo.SysRoleVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:35
 */
public interface BSysRoleApi {

    IPage<SysRole> selectByQuery(SysRoleQuery query, int page, int size);

    List<SysRole> selectByQuery(SysRoleQuery query);

    SysRole get(Long id);

    void insert(SysRoleVo sysRoleVo);

    void update(SysRoleVo sysRoleVo);

    void delete(List<Long> ids);

    void delete(Long id);
}
