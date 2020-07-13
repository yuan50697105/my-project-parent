package org.myproject.cloud.application.admin.api.impl;

import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.service.TbCustomerInfoService;
import org.myproject.boot.application.admin.service.api.CustomerInfoApiImpl;
import org.myproject.boot.application.admin.service.pojo.CustomerInfo;
import org.myproject.boot.application.admin.service.pojo.CustomerInfoQuery;
import org.myproject.boot.application.admin.service.pojo.CustomerInfoVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.cloud.application.admin.api.CloudBCustomerInfoApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-13 00:06
 */
@RestController
@RequestMapping("customer/info")
public class CloudBCustomerInfoApiImpl extends CustomerInfoApiImpl implements CloudBCustomerInfoApi {
    private final TbConverter converter;
    private final TbCustomerInfoService customerInfoService;

    public CloudBCustomerInfoApiImpl(TbConverter converter, TbCustomerInfoService customerInfoService) {
        super(converter, customerInfoService);
        this.converter = converter;
        this.customerInfoService = customerInfoService;
    }

    @Override
    @RequestMapping(value = "page", method = {RequestMethod.GET})
    public IPage<CustomerInfo> selectByQuery(CustomerInfoQuery query, int page, int size) {
        return super.selectByQuery(query, page, size);
    }

    @Override
    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public List<CustomerInfo> selectByQuery(CustomerInfoQuery query) {
        return super.selectByQuery(query);
    }

    @Override
    @RequestMapping(value = {"{id}"}, method = {RequestMethod.GET})
    public CustomerInfo get(@PathVariable Long id) {
        return super.get(id);
    }

    @Override
    @RequestMapping(method = {RequestMethod.POST})
    public void insert(CustomerInfoVo vo) {
        super.insert(vo);
    }

    @Override
    @RequestMapping(method = {RequestMethod.PUT})
    public void update(CustomerInfoVo vo) {
        super.update(vo);
    }

    @Override
    public void delete(List<Long> ids) {
        super.delete(ids);
    }

    @Override
    @RequestMapping(value = "{id}", method = {RequestMethod.DELETE})
    public void delete(@PathVariable Long id) {
        super.delete(id);
    }
}