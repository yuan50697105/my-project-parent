package org.myproject.boot.application.admin.service;

import org.myproject.boot.application.admin.service.pojo.ao.SysUserAo;
import org.myproject.boot.application.admin.service.pojo.dto.IPageResult;
import org.myproject.boot.application.admin.service.pojo.query.SysUserQuery;
import org.myproject.boot.application.admin.service.pojo.vo.SysUserVo;

import java.util.List;
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

    List<SysUserAo> list(SysUserQuery query);

    CompletableFuture<SysUserAo> getByIdAsync(Long id);

    SysUserAo getById(Long id);

    IPageResult<SysUserAo> page(SysUserQuery query);

    CompletableFuture<IPageResult<SysUserAo>> pageAsync(SysUserQuery query);

    CompletableFuture<List<SysUserAo>> listAsync(SysUserQuery query);
}
