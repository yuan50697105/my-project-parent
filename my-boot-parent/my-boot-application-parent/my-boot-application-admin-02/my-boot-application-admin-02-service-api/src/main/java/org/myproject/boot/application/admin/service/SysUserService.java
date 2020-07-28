package org.myproject.boot.application.admin.service;

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
}
