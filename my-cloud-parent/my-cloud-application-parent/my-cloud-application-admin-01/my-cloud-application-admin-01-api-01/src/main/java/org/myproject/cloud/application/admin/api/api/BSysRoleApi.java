package org.myproject.cloud.application.admin.api.api;


import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.cloud.application.admin.api.pojo.BSysRole;
import org.myproject.cloud.application.admin.api.pojo.BSysRoleQuery;
import org.myproject.cloud.application.admin.api.pojo.BSysRoleVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:35
 */
@RequestMapping("sys/role")
public interface BSysRoleApi {

    @GetMapping("data")
    IPage<BSysRole> selectByQuery(BSysRoleQuery query, @RequestParam(defaultValue = "1") int page, @RequestParam("20") int size);

    @GetMapping("list")
    List<BSysRole> selectByQuery(BSysRoleQuery query);

    @GetMapping("{id}")
    BSysRole get(@PathVariable Long id);

    @PostMapping
    void save(@RequestBody BSysRoleVo BSysRoleVo);

    @PutMapping
    void update(@RequestBody BSysRoleVo BSysRoleVo);

    @DeleteMapping(params = "ids")
    void delete(List<Long> ids);

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id);
}
