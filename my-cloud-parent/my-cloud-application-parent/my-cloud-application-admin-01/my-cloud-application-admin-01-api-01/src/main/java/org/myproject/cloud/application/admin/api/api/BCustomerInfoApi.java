package org.myproject.cloud.application.admin.api.api;


import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.cloud.application.admin.api.pojo.BCustomerInfo;
import org.myproject.cloud.application.admin.api.pojo.BCustomerInfoQuery;
import org.myproject.cloud.application.admin.api.pojo.BCustomerInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:52
 */
@RequestMapping("customer/info")
public interface BCustomerInfoApi {
    @GetMapping("data")
    IPage<BCustomerInfo> selectByQuery(BCustomerInfoQuery query,@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "20") int size);

    @GetMapping("list")
    List<BCustomerInfo> selectByQuery(BCustomerInfoQuery query);

    @GetMapping("{id}")
    BCustomerInfo get(@PathVariable Long id);

    @PostMapping
    void save(@RequestBody BCustomerInfoVo vo);

    @PutMapping
    void update(@RequestBody BCustomerInfoVo vo);

    @DeleteMapping(params = "ids")
    void delete(List<Long> ids);

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id);
}
