package org.myproject.boot.application.admin.api.api;


import org.myproject.boot.application.admin.api.pojo.BSysUser;
import org.myproject.boot.application.admin.api.pojo.BSysUserQuery;
import org.myproject.boot.application.admin.api.pojo.BSysUserVo;
import org.myproject.boot.application.admin.api.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:17
 */
public interface BSysUserApi {
    IPage<BSysUser> selectByQuery(BSysUserQuery query, int page, int size);

    List<BSysUser> selectByQuery(BSysUserQuery query);

    BSysUser get(Long id);

    void save(BSysUserVo sysUser);

    void update(BSysUserVo sysUser);

    void delete(Long id);

    void delete(List<Long> ids);

    void modify(BSysUserVo BSysUserVo);

}
