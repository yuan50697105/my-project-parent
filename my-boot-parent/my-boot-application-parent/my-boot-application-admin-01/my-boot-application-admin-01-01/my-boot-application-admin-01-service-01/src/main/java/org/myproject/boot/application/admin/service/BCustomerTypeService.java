package org.myproject.boot.application.admin.service;


import org.myproject.boot.application.admin.pojo.CustomerType;
import org.myproject.boot.application.admin.pojo.CustomerTypeQuery;
import org.myproject.boot.application.admin.pojo.CustomerTypeVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:57
 */
public interface BCustomerTypeService {
    IPage<CustomerType> selectByQuery(CustomerTypeQuery query, int page, int size);

    List<CustomerType> selectByQuery(CustomerTypeQuery query);

    CustomerType selectById(Long id);

    void insert(CustomerTypeVo vo);

    void update(CustomerTypeVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}