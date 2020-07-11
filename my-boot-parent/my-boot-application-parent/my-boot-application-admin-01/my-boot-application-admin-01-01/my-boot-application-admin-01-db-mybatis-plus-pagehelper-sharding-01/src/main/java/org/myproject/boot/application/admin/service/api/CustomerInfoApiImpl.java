package org.myproject.boot.application.admin.service.api;


import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.myproject.boot.application.admin.db.service.TbCustomerInfoService;
import org.myproject.boot.application.admin.service.pojo.CustomerInfo;
import org.myproject.boot.application.admin.service.pojo.CustomerInfoQuery;
import org.myproject.boot.application.admin.service.pojo.CustomerInfoVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:52
 */
@Service
@AllArgsConstructor
@Transactional
public class CustomerInfoApiImpl implements BCustomerInfoApi {
    private final TbConverter converter;
    private final TbCustomerInfoService customerInfoService;

    @Override
    public IPage<CustomerInfo> selectByQuery(CustomerInfoQuery query, int page, int size) {
        TbCustomerInfoQuery customerInfoQuery = converter.customerInfo(query);
        PageInfo<TbCustomerInfo> pageInfo = customerInfoService.selectByQuery(customerInfoQuery, page, size);
        return new PageResult<>(converter.customerInfo(pageInfo));
    }

    @Override
    public List<CustomerInfo> selectByQuery(CustomerInfoQuery query) {
        TbCustomerInfoQuery customerInfoQuery = converter.customerInfo(query);
        List<TbCustomerInfo> list = customerInfoService.selectByQuery(customerInfoQuery);
        return converter.customerInfo(list);
    }

    @Override
    public CustomerInfo get(Long id) {
        TbCustomerInfo customerInfo = customerInfoService.getById(id);
        return converter.customerInfo(customerInfo);
    }

    @Override
    public void insert(CustomerInfoVo vo) {
        TbCustomerInfo customerInfo = converter.customerInfo(vo);
        customerInfoService.save(customerInfo);
    }

    @Override
    public void update(CustomerInfoVo vo) {
        TbCustomerInfo customerInfo = converter.customerInfo(vo);
        customerInfoService.updateById(customerInfo);
    }

    @Override
    public void delete(List<Long> ids) {
        customerInfoService.removeByIds(ids);
    }

    @Override
    public void delete(Long id) {
        customerInfoService.removeById(id);
    }
}
