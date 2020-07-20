package org.myproject.cloud.application.admin.api.base;


import org.myproject.cloud.application.admin.api.pojo.BCustomerType;
import org.myproject.cloud.application.admin.api.pojo.BCustomerTypeQuery;
import org.myproject.cloud.application.admin.api.pojo.BCustomerTypeVo;
import org.myproject.cloud.application.admin.api.pojo.IPage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:57
 */
@RequestMapping("customer/type")
@ResponseBody
public interface BCustomerTypeApi {
    @GetMapping("data")
    IPage<BCustomerType> selectByQuery(BCustomerTypeQuery query, @RequestParam(defaultValue = "1") int page, @RequestParam("20") int size);

    @GetMapping("list")
    List<BCustomerType> selectByQuery(BCustomerTypeQuery query);

    @GetMapping("{id}")
    BCustomerType get(@PathVariable Long id);

    @PostMapping
    void save(@RequestBody BCustomerTypeVo vo);

    void update(@RequestBody BCustomerTypeVo vo);

    @DeleteMapping(params = "ids")
    void delete(List<Long> ids);

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id);
}
