package org.myproject.boot.application.admin.api.impl;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.api.api.BCustomerTypeApi;
import org.myproject.boot.application.admin.api.converter.TbConverter;
import org.myproject.boot.application.admin.api.pojo.*;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.service.TbCustomerTypeService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 19:08
 */
@Service
@AllArgsConstructor
@Transactional
@Primary
public class CustomerTypeApiImpl implements BCustomerTypeApi {
    private final TbConverter converter;
    private final TbCustomerTypeService customerTypeService;

    @Override
    public IPage<BCustomerType> selectByQuery(BCustomerTypeQuery query, int page, int size) {
        TbCustomerTypeQuery customerTypeQuery = converter.customerType(query);
        PageInfo<TbCustomerType> pageInfo = customerTypeService.selectByQuery(customerTypeQuery, page, size);
        return new PageResult<>(converter.customerType(pageInfo));
    }

    @Override
    public List<BCustomerType> selectByQuery(BCustomerTypeQuery query) {
        TbCustomerTypeQuery customerTypeQuery = converter.customerType(query);
        List<TbCustomerType> list = customerTypeService.selectByQuery(customerTypeQuery);
        return converter.customerType(list);
    }

    @Override
    public BCustomerType get(Long id) {
        TbCustomerType customerType = customerTypeService.selectByPrimaryKey(id);
        return converter.customerType(customerType);
    }

    @Override
    public void save(BCustomerTypeVo vo) {
        TbCustomerType record = converter.customerType(vo);
        customerTypeService.insert(record);
    }

    @Override
    public void update(BCustomerTypeVo vo) {
        TbCustomerType record = converter.customerType(vo);
        customerTypeService.updateByPrimaryKeySelective(record);
    }

    @Override
    public void delete(List<Long> ids) {
        ids.forEach(customerTypeService::deleteByPrimaryKey);
    }

    @Override
    public void delete(Long id) {
        customerTypeService.deleteByPrimaryKey(id);
    }
}