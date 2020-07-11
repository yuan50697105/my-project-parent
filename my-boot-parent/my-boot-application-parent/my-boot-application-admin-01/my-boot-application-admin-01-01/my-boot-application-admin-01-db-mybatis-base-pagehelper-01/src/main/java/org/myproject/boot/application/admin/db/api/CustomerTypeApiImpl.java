package org.myproject.boot.application.admin.db.api;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.service.TbCustomerTypeService;
import org.myproject.boot.application.admin.pojo.CustomerType;
import org.myproject.boot.application.admin.pojo.CustomerTypeQuery;
import org.myproject.boot.application.admin.pojo.CustomerTypeVo;
import org.myproject.boot.application.admin.api.BCustomerTypeApi;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
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
public class CustomerTypeApiImpl implements BCustomerTypeApi {
    private final TbConverter tbConverter;
    private final TbCustomerTypeService customerTypeService;

    @Override
    public IPage<CustomerType> selectByQuery(CustomerTypeQuery query, int page, int size) {
        TbCustomerTypeQuery customerTypeQuery=tbConverter.customerType(query);
        PageInfo<TbCustomerType> pageInfo = customerTypeService.selectByQuery(customerTypeQuery, page, size);
        return new PageResult<>(tbConverter.customerType(pageInfo));
    }

    @Override
    public List<CustomerType> selectByQuery(CustomerTypeQuery query) {
        TbCustomerTypeQuery customerTypeQuery = tbConverter.customerType(query);
        List<TbCustomerType> list = customerTypeService.selectByQuery(customerTypeQuery);
        return tbConverter.customerType(list);
    }

    @Override
    public CustomerType get(Long id) {
        TbCustomerType customerType = customerTypeService.selectByPrimaryKey(id);
        return tbConverter.customerType(customerType);
    }

    @Override
    public void insert(CustomerTypeVo vo) {
        TbCustomerType record = tbConverter.customerType(vo);
        customerTypeService.insert(record);
    }

    @Override
    public void update(CustomerTypeVo vo) {
        TbCustomerType record = tbConverter.customerType(vo);
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