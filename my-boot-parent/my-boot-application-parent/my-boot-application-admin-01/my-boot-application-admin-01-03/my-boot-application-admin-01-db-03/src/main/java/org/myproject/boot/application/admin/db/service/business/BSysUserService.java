package org.myproject.boot.application.admin.db.service.business;

import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.pojo.SysUserVo;
import org.myproject.boot.mybatis.pojo.PageResult;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-03
 * @description:
 * @author: yuane
 * @create: 2020-07-05 22:44
 */
public interface BSysUserService {
    PageResult<SysUser> selectByQuery(SysUserQuery query, int page, int size);

    List<SysUser> selectByQuery(SysUserQuery query);

    SysUser selectById(Long id);

    void save(SysUserVo sysUser);

    void update(SysUserVo sysUser);

    void delete(List<Long> ids);

    void delete(Long id);
}
