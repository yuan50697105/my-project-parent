package org.myproject.cloud.application.admin.api.api;


import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.cloud.application.admin.api.pojo.BGoodsInfo;
import org.myproject.cloud.application.admin.api.pojo.BGoodsInfoQuery;
import org.myproject.cloud.application.admin.api.pojo.BGoodsInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:23
 */
@FeignClient("cloud-api")
@RequestMapping("goods/info")
public interface BGoodsInfoApi {
    @GetMapping("data")
    IPage<BGoodsInfo> selectByQuery(BGoodsInfoQuery query, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "20") int size);

    @GetMapping("list")
    List<BGoodsInfo> selectByQuery(BGoodsInfoQuery query);

    @GetMapping("{id}")
    BGoodsInfo get(@PathVariable Long id);

    @PostMapping
    void save(@RequestBody BGoodsInfoVo vo);

    @PutMapping
    void update(@RequestBody BGoodsInfoVo vo);

    @DeleteMapping(params = "ids")
    void delete(List<Long> ids);

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id);
}

