package org.myproject.cloud.application.admin.api.api;


import org.myproject.cloud.application.admin.api.pojo.BSysUser;
import org.myproject.cloud.application.admin.api.pojo.BSysUserQuery;
import org.myproject.cloud.application.admin.api.pojo.BSysUserVo;
import org.myproject.cloud.application.admin.api.pojo.IPage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:17
 */
@RequestMapping("sys/user")
@ResponseBody
public interface BSysUserApi {
    @PostMapping("data")
    @ResponseBody
    IPage<BSysUser> selectByQuery(@RequestBody BSysUserQuery query, @RequestBody @RequestParam(defaultValue = "1") int page, @RequestBody @RequestParam(defaultValue = "20") int size);

    @PostMapping("list")
    @ResponseBody
    List<BSysUser> selectByQuery(@RequestBody BSysUserQuery query);

    @GetMapping("{id}")
    @ResponseBody
    BSysUser get(@PathVariable Long id);

    @PostMapping
    @ResponseBody
    void save(@RequestBody BSysUserVo sysUser);

    @PutMapping
    @ResponseBody
    void update(@RequestBody BSysUserVo sysUser);

    @DeleteMapping("{id}")
    @ResponseBody
    void delete(@PathVariable Long id);

    @DeleteMapping(params = "ids")
    @ResponseBody
    void delete(List<Long> ids);

    @PatchMapping
    @ResponseBody
    void modify(BSysUserVo BSysUserVo);
}
