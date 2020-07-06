package org.myproject.boot.application.admin.db.service.business;

import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.db.pojo.SysRoleVo;
import org.myproject.boot.mybatis.pojo.PageResult;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-07
 * @description:
 * @author: yuane
 * @create: 2020-07-06 21:49
 */
public interface BSysRoleService {
    PageResult<SysRole>  selectByQuery(SysRoleQuery query, int page, int size);

    List<SysRole> selectByQuery(SysRoleQuery query);

    SysRole selectById(Long id);

    void save(SysRoleVo sysUser);

    void update(SysRoleVo sysUserVo);

    void delete(List<Long> ids);

    void delete(Long id);
}
