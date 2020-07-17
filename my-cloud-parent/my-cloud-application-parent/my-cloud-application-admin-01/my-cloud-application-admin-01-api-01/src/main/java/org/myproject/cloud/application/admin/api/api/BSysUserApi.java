package org.myproject.cloud.application.admin.api.api;


import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.cloud.application.admin.api.pojo.BSysUser;
import org.myproject.cloud.application.admin.api.pojo.BSysUserQuery;
import org.myproject.cloud.application.admin.api.pojo.BSysUserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:17
 */
@RequestMapping("sys/user")
public interface BSysUserApi {
    @GetMapping("data")
    IPage<BSysUser> selectByQuery(BSysUserQuery query, @RequestParam(defaultValue = "1") int page, @RequestParam("20") int size);

    @GetMapping("list")
    List<BSysUser> selectByQuery(BSysUserQuery query);

    @GetMapping("{id}")
    BSysUser get(@PathVariable Long id);

    @PostMapping
    void save(@RequestBody BSysUserVo sysUser);

    @PutMapping
    void update(@RequestBody BSysUserVo sysUser);

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id);

    @DeleteMapping(params = "ids")
    void delete(List<Long> ids);

    @PatchMapping
    void modify(BSysUserVo BSysUserVo);
}
