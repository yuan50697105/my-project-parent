package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbCustomerTypeConverter;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.service.table.TbCustomerTypeService;
import org.myproject.boot.application.admin.pojo.CustomerType;
import org.myproject.boot.application.admin.pojo.CustomerTypeQuery;
import org.myproject.boot.application.admin.pojo.CustomerTypeVo;
import org.myproject.boot.application.admin.service.BCustomerTypeService;
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
@Transactional
@AllArgsConstructor
public class BCustomerTypeServiceImpl implements BCustomerTypeService {
    private final TbCustomerTypeService customerTypeService;
    private final TbCustomerTypeConverter customerTypeConverter;

    @Override
    public IPage<CustomerType> selectByQuery(CustomerTypeQuery query, int page, int size) {
        TbCustomerTypeQuery customerTypeQuery = customerTypeConverter.convert(query);
        PageInfo<TbCustomerType> pageInfo = customerTypeService.selectByQuery(customerTypeQuery, page, size);
        return new PageResult<>(customerTypeConverter.convert(pageInfo));
    }

    @Override
    public List<CustomerType> selectByQuery(CustomerTypeQuery query) {
        TbCustomerTypeQuery customerTypeQuery = customerTypeConverter.convert(query);
        List<TbCustomerType> list = customerTypeService.selectByQuery(customerTypeQuery);
        return customerTypeConverter.convert(list);
    }

    @Override
    public CustomerType selectById(Long id) {
        return customerTypeConverter.convert(customerTypeService.selectByPrimaryKey(id));
    }

    @Override
    public void insert(CustomerTypeVo vo) {
        TbCustomerType customerInfo = customerTypeConverter.convert(vo);
        customerTypeService.insert(customerInfo);
    }

    @Override
    public void update(CustomerTypeVo vo) {
        TbCustomerType customerInfo = customerTypeConverter.convert(vo);
        customerTypeService.updateByPrimaryKeySelective(customerInfo);
    }

    @Override
    public void delete(List<Long> ids) {
        TbCustomerTypeExample example = new TbCustomerTypeExample();
        example.or().andIdIn(ids);
        customerTypeService.deleteByExample(example);
    }

    @Override
    public void delete(Long id) {
        customerTypeService.deleteByPrimaryKey(id);
    }

}