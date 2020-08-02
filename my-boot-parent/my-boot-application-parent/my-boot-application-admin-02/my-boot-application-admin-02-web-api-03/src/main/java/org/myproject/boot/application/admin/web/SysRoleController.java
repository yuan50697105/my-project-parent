package org.myproject.boot.application.admin.web;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.service.SysRoleService;
import org.myproject.boot.application.admin.service.pojo.ao.SysRoleAo;
import org.myproject.boot.application.admin.service.pojo.dto.IPageResult;
import org.myproject.boot.application.admin.service.pojo.query.SysRoleQuery;
import org.myproject.boot.application.admin.service.pojo.vo.SysRoleVo;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 09:14
 */
@RestController
@RequestMapping("/sys/user")
public class SysRoleController {
    @Resource
    private SysRoleService sysUserService;

    @PostMapping
    public Mono<Result<Boolean>> save(@RequestBody SysRoleVo vo) {
        CompletableFuture<Boolean> future = sysUserService.saveAsync(vo.event(SysRoleVo.Event.ADD));
        return Mono.fromFuture(future).map(ResultInfo::success);
    }

    @PutMapping("/{id}")
    public Mono<Result<Boolean>> update(@PathVariable Long id, @RequestBody SysRoleVo vo) {
        CompletableFuture<Boolean> future = sysUserService.saveAsync(vo.id(id).event(SysRoleVo.Event.UPDATE));
        return Mono.fromFuture(future).map(ResultInfo::success);
    }

    @DeleteMapping("/{id}")
    public Mono<Result<Boolean>> delete(@PathVariable Long id) {
        CompletableFuture<Boolean> future = sysUserService.deleteAsync(id);
        return Mono.fromFuture(future).map(ResultInfo::success);
    }

    @GetMapping("/{id}")
    public Mono<Result<SysRoleAo>> get(@PathVariable Long id) {
        CompletableFuture<SysRoleAo> future = sysUserService.getByIdAsync(id);
        return Mono.fromFuture(future).map(ResultInfo::success);
    }

    @GetMapping("page")
    public Mono<Result<IPageResult<SysRoleAo>>> page(SysRoleQuery query) {
        CompletableFuture<IPageResult<SysRoleAo>> future = sysUserService.pageAsync(query);
        return Mono.fromFuture(future).map(ResultInfo::success);
    }

    @GetMapping("list")
    public Mono<Result<List<SysRoleAo>>> list(SysRoleQuery query) {
        CompletableFuture<List<SysRoleAo>> future = sysUserService.listAsync(query);
        return Mono.fromFuture(future).map(ResultInfo::success);
    }


}