package org.myproject.boot.application.admin.service;

import org.myproject.boot.application.admin.service.pojo.ao.SysRoleAo;
import org.myproject.boot.application.admin.service.pojo.dto.IPageResult;
import org.myproject.boot.application.admin.service.pojo.query.SysRoleQuery;
import org.myproject.boot.application.admin.service.pojo.vo.SysRoleVo;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 09:15
 */
public interface SysRoleService {
    boolean save(SysRoleVo vo);

    CompletableFuture<Boolean> saveAsync(SysRoleVo vo);

    CompletableFuture<Boolean> deleteAsync(Long id);

    boolean delete(Long id);

    List<SysRoleAo> list(SysRoleQuery query);

    CompletableFuture<SysRoleAo> getByIdAsync(Long id);

    SysRoleAo getById(Long id);

    IPageResult<SysRoleAo> page(SysRoleQuery query);

    CompletableFuture<IPageResult<SysRoleAo>> pageAsync(SysRoleQuery query);

    CompletableFuture<List<SysRoleAo>> listAsync(SysRoleQuery query);
}
