package org.myproject.boot.application.admin.web;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.service.SysUserService;
import org.myproject.boot.application.admin.service.pojo.IPageResult;
import org.myproject.boot.application.admin.service.pojo.SysUserAo;
import org.myproject.boot.application.admin.service.pojo.SysUserQuery;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 09:14
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @PostMapping
    public Mono<Result<Boolean>> save(@RequestBody SysUserVo vo) {
        CompletableFuture<Boolean> future = sysUserService.saveAsync(vo.event(SysUserVo.Event.ADD));
        return Mono.fromFuture(future).map(ResultInfo::success);
    }

    @PutMapping("/{id}")
    public Mono<Result<Boolean>> update(@PathVariable Long id, @RequestBody SysUserVo vo) {
        CompletableFuture<Boolean> future = sysUserService.saveAsync(vo.id(id).event(SysUserVo.Event.UPDATE));
        return Mono.fromFuture(future).map(ResultInfo::success);
    }

    @PutMapping("/info/{id}")
    public Mono<Result<Boolean>> updateInfo(@PathVariable Long id, @RequestBody SysUserVo vo) {
        CompletableFuture<Boolean> future = sysUserService.saveAsync(vo.id(id).event(SysUserVo.Event.UPDATE_INFO));
        return Mono.fromFuture(future).map(ResultInfo::success);
    }

    @PutMapping("/role/{id}")
    public Mono<Result<Boolean>> updateRole(@PathVariable Long id, @RequestBody SysUserVo vo) {
        CompletableFuture<Boolean> future = sysUserService.saveAsync(vo.id(id).event(SysUserVo.Event.UPDATE_ROLE));
        return Mono.fromFuture(future).map(ResultInfo::success);
    }

    @DeleteMapping("/{id}")
    public Mono<Result<Boolean>> delete(@PathVariable Long id) {
        CompletableFuture<Boolean> future = sysUserService.deleteAsync(id);
        return Mono.fromFuture(future).map(ResultInfo::success);
    }

    @GetMapping("/{id}")
    public Mono<Result<SysUserAo>> get(@PathVariable Long id) {
        CompletableFuture<SysUserAo> future = sysUserService.getByIdAsync(id);
        return Mono.fromFuture(future).map(ResultInfo::success);
    }

    @GetMapping("page")
    public Mono<Result<IPageResult<SysUserAo>>> page(SysUserQuery query) {
        CompletableFuture<IPageResult<SysUserAo>> future = sysUserService.pageAsync(query);
        return Mono.fromFuture(future).map(ResultInfo::success);
    }


}