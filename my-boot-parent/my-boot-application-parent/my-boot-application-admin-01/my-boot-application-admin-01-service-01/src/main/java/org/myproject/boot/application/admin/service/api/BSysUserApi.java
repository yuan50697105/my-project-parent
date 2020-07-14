package org.myproject.boot.application.admin.service.api;


import org.myproject.boot.application.admin.service.pojo.SysUser;
import org.myproject.boot.application.admin.service.pojo.SysUserQuery;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:17
 */
public interface BSysUserApi {
    IPage<SysUser> selectByQuery(SysUserQuery query, int page, int size);

    List<SysUser> selectByQuery(SysUserQuery query);

    SysUser get(Long id);

    void save(SysUserVo sysUser);

    void update(SysUserVo sysUser);

    void delete(Long id);

    void delete(List<Long> ids);

    void modify(SysUserVo sysUserVo);
}
