package org.myproject.boot.application.admin.api.impl;


import org.myproject.boot.application.admin.api.pojo.BCustomerInfo;
import org.myproject.boot.application.admin.api.pojo.BCustomerInfoQuery;
import org.myproject.boot.application.admin.api.pojo.BCustomerInfoVo;
import org.myproject.boot.application.admin.api.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:52
 */
public interface BCustomerInfoApi {
    IPage<BCustomerInfo> selectByQuery(BCustomerInfoQuery query, int page, int size);

    List<BCustomerInfo> selectByQuery(BCustomerInfoQuery query);

    BCustomerInfo get(Long id);

    void save(BCustomerInfoVo vo);

    void update(BCustomerInfoVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
