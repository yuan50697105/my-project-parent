package org.myproject.boot.application.admin.service;


import org.myproject.boot.application.admin.pojo.CustomerInfo;
import org.myproject.boot.application.admin.pojo.CustomerInfoQuery;
import org.myproject.boot.application.admin.pojo.CustomerInfoVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:52
 */
public interface BCustomerInfoService {
    IPage<CustomerInfo> selectByQuery(CustomerInfoQuery query, int page, int size);

    List<CustomerInfo> selectByQuery(CustomerInfoQuery query);

    CustomerInfo get(Long id);

    void insert(CustomerInfoVo vo);

    void update(CustomerInfoVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
