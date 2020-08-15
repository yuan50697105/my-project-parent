package org.myproject.boot.application.admin.api.impl;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.api.api.BCustomerInfoApi;
import org.myproject.boot.application.admin.api.converter.TbConverter;
import org.myproject.boot.application.admin.api.pojo.*;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.myproject.boot.application.admin.db.service.TbCustomerInfoService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 19:00
 */
@Service
@AllArgsConstructor
@Transactional
@Primary
public class CustomerInfoApiImpl implements BCustomerInfoApi {
    private final TbConverter converter;
    private final TbCustomerInfoService customerInfoService;

    @Override
    public IPage<BCustomerInfo> selectByQuery(BCustomerInfoQuery query, int page, int size) {
        TbCustomerInfoQuery customerInfoQuery = converter.customerInfo(query);
        PageInfo<TbCustomerInfo> pageInfo = customerInfoService.selectByQuery(customerInfoQuery, page, size);
        return new PageResult<>(converter.customerInfo(pageInfo));
    }

    @Override
    public List<BCustomerInfo> selectByQuery(BCustomerInfoQuery query) {
        TbCustomerInfoQuery customerInfoQuery = converter.customerInfo(query);
        List<TbCustomerInfo> list = customerInfoService.selectByQuery(customerInfoQuery);
        return converter.customerInfo(list);
    }

    @Override
    public BCustomerInfo get(Long id) {
        TbCustomerInfo customerInfo = customerInfoService.selectByPrimaryKey(id);
        return converter.customerInfo(customerInfo);
    }

    @Override
    public void save(BCustomerInfoVo vo) {
        TbCustomerInfo customerInfo = converter.customerInfo(vo);
        customerInfoService.insert(customerInfo);
    }

    @Override
    public void update(BCustomerInfoVo vo) {
        TbCustomerInfo customerInfo = converter.customerInfo(vo);
        customerInfoService.updateByPrimaryKeySelective(customerInfo);
    }

    @Override
    public void delete(List<Long> ids) {
        ids.stream().map(customerInfoService::deleteByPrimaryKey);
    }

    @Override
    public void delete(Long id) {
        customerInfoService.deleteByPrimaryKey(id);
    }
}