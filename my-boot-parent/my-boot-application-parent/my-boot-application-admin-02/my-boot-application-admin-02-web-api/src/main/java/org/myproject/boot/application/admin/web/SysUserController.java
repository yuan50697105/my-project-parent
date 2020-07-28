package org.myproject.boot.application.admin.web;

import org.myproject.boot.application.admin.service.SysUserService;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import retrofit2.adapter.rxjava3.Result;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 09:14
 */
@RestController
@RequestMapping("sys/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @PostMapping
    public Mono<Result<Void>> save(@RequestBody SysUserVo vo) {
        return Mono.fromFuture(sysUserService.save(vo));
    }
}