package org.myproject.boot.application.admin.db.service.business;

import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.pojo.SysUserVo;
import org.myproject.boot.mybatis.pojo.PageResult;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:17
 */
public interface BSysUserService {
    PageResult<SysUser> selectByQueryWithPage(int page, int size, SysUserQuery query);

    List<SysUser> selectByQuery(SysUserQuery query);

    SysUser selectByPrimaryKey(Long id);

    int insert(SysUserVo sysUser);

    int update(SysUserVo sysUser);

    int deleteByExample(SysUserExample example);

    int delete(Long id);

    int delete(List<Long> ids);
}
