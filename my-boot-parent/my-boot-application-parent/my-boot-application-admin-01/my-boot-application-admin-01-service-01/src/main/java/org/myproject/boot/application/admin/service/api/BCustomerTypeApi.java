package org.myproject.boot.application.admin.service.api;


import org.myproject.boot.application.admin.service.pojo.CustomerType;
import org.myproject.boot.application.admin.service.pojo.CustomerTypeQuery;
import org.myproject.boot.application.admin.service.pojo.CustomerTypeVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:57
 */
public interface BCustomerTypeApi {
    IPage<CustomerType> selectByQuery(CustomerTypeQuery query, int page, int size);

    List<CustomerType> selectByQuery(CustomerTypeQuery query);

    CustomerType get(Long id);

    void save(CustomerTypeVo vo);

    void update(CustomerTypeVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
