package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.db.pojo.SysRoleVo;
import org.myproject.boot.mybatis.pojo.PageResult;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:35
 */
public interface BSysRoleService {
    PageResult<SysRole> selectByQueryWithPage(int page, int size, SysRoleQuery query);

    List<SysRole> selectByQuery(SysRoleQuery query);

    SysRole selectByPrimaryKey(Long id);

    void insert(SysRoleVo sysRoleVo);

    void updateByPrimaryKeySelective(SysRoleVo sysRoleVo);

    void deleteByIds(List<Long> ids);

    void deleteByPrimaryKey(Long id);
}
