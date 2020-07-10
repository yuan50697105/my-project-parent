package org.myproject.boot.application.admin.service;


import org.myproject.boot.application.admin.pojo.SysUser;
import org.myproject.boot.application.admin.pojo.SysUserQuery;
import org.myproject.boot.application.admin.pojo.SysUserVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:17
 */
public interface BSysUserService {
    IPage<SysUser> selectByQuery(SysUserQuery query, int page, int size);

    List<SysUser> selectByQuery(SysUserQuery query);

    SysUser selectByPrimaryKey(Long id);

    int insert(SysUserVo sysUser);

    int update(SysUserVo sysUser);

    int delete(Long id);

    int delete(List<Long> ids);
}
