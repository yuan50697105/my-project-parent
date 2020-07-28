package org.myproject.boot.application.admin.service;

import org.myproject.boot.application.admin.service.pojo.IPageResult;
import org.myproject.boot.application.admin.service.pojo.SysUserAo;
import org.myproject.boot.application.admin.service.pojo.SysUserQuery;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;

import java.util.concurrent.CompletableFuture;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 09:15
 */
public interface SysUserService {
    boolean save(SysUserVo vo);

    CompletableFuture<Boolean> saveAsync(SysUserVo vo);

    CompletableFuture<Boolean> deleteAsync(Long id);

    boolean delete(Long id);

    CompletableFuture<SysUserAo> getByIdAsync(Long id);

    SysUserAo getById(Long id);

    IPageResult<SysUserAo> page(SysUserQuery query);

    CompletableFuture<IPageResult<SysUserAo>> pageAsync(SysUserQuery query);
}
