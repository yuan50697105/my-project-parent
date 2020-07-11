package org.myproject.boot.application.admin.service.api;


import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.service.TbCustomerTypeService;
import org.myproject.boot.application.admin.service.pojo.CustomerType;
import org.myproject.boot.application.admin.service.pojo.CustomerTypeQuery;
import org.myproject.boot.application.admin.service.pojo.CustomerTypeVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:57
 */
@Service
@AllArgsConstructor
@Transactional
public class CustomerTypeApiImpl implements BCustomerTypeApi {
    private final TbConverter converter;
    private final TbCustomerTypeService customerTypeService;

    @Override
    public IPage<CustomerType> selectByQuery(CustomerTypeQuery query, int page, int size) {
        TbCustomerTypeQuery customerTypeQuery = converter.customerType(query);
        PageInfo<TbCustomerType> pageInfo = customerTypeService.selectByQuery(customerTypeQuery, page, size);
        return new PageResult<>(converter.customerType(pageInfo));
    }

    @Override
    public List<CustomerType> selectByQuery(CustomerTypeQuery query) {
        TbCustomerTypeQuery customerTypeQuery = converter.customerType(query);
        List<TbCustomerType> list = customerTypeService.selectByQuery(customerTypeQuery);
        return converter.customerType(list);
    }

    @Override
    public CustomerType get(Long id) {
        TbCustomerType customerType = customerTypeService.getById(id);
        return converter.customerType(customerType);
    }

    @Override
    public void insert(CustomerTypeVo vo) {
        TbCustomerType customerType = converter.customerType(vo);
        customerTypeService.save(customerType);
    }

    @Override
    public void update(CustomerTypeVo vo) {
        TbCustomerType customerType = converter.customerType(vo);
        customerTypeService.updateById(customerType);
    }

    @Override
    public void delete(List<Long> ids) {
        customerTypeService.removeByIds(ids);
    }

    @Override
    public void delete(Long id) {
        customerTypeService.removeById(id);
    }
}
