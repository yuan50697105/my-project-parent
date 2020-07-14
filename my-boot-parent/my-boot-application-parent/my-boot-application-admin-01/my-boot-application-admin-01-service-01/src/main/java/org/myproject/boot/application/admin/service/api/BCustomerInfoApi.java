package org.myproject.boot.application.admin.service.api;


import org.myproject.boot.application.admin.service.pojo.CustomerInfo;
import org.myproject.boot.application.admin.service.pojo.CustomerInfoQuery;
import org.myproject.boot.application.admin.service.pojo.CustomerInfoVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:52
 */
public interface BCustomerInfoApi {
    IPage<CustomerInfo> selectByQuery(CustomerInfoQuery query, int page, int size);

    List<CustomerInfo> selectByQuery(CustomerInfoQuery query);

    CustomerInfo get(Long id);

    void save(CustomerInfoVo vo);

    void update(CustomerInfoVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
