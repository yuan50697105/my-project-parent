package org.myproject.cloud.application.admin.api;


import org.myproject.boot.application.admin.service.api.BCustomerInfoApi;
import org.myproject.boot.application.admin.service.pojo.CustomerInfo;
import org.myproject.boot.application.admin.service.pojo.CustomerInfoQuery;
import org.myproject.boot.application.admin.service.pojo.CustomerInfoVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:52
 */
@RequestMapping("customer/info")
public interface CloudBCustomerInfoApi extends BCustomerInfoApi {
    @RequestMapping(value = "page", method = {RequestMethod.GET})
    IPage<CustomerInfo> selectByQuery(CustomerInfoQuery query, int page, int size);

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    List<CustomerInfo> selectByQuery(CustomerInfoQuery query);

    @RequestMapping(value = {"{id}"}, method = {RequestMethod.GET})
    CustomerInfo get(@PathVariable Long id);

    @RequestMapping(value = "", method = {RequestMethod.POST})
    void save(@RequestBody CustomerInfoVo vo);

    @RequestMapping(value = "", method = {RequestMethod.PUT})
    void update(CustomerInfoVo vo);

    void delete(List<Long> ids);

    @RequestMapping(value = "{id}", method = {RequestMethod.DELETE})
    void delete(@PathVariable Long id);
}
