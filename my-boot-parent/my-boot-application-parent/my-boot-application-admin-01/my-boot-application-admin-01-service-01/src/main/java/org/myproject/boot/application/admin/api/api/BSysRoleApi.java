package org.myproject.boot.application.admin.api.api;


import org.myproject.boot.application.admin.api.pojo.BSysRole;
import org.myproject.boot.application.admin.api.pojo.BSysRoleQuery;
import org.myproject.boot.application.admin.api.pojo.BSysRoleVo;
import org.myproject.boot.application.admin.api.pojo.IPage;
import org.myproject.boot.mybatis.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:35
 */
public interface BSysRoleApi {

    IPage<BSysRole> selectByQuery(BSysRoleQuery query, int page, int size);

    List<BSysRole> selectByQuery(BSysRoleQuery query);

    BSysRole get(Long id);

    void save(BSysRoleVo BSysRoleVo);

    void update(BSysRoleVo BSysRoleVo);

    void delete(List<Long> ids);

    void delete(Long id);
}
