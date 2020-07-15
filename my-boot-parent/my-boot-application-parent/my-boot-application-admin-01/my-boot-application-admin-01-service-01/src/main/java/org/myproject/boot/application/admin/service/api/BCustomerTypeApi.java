package org.myproject.boot.application.admin.service.api;


import org.myproject.boot.application.admin.service.pojo.BCustomerType;
import org.myproject.boot.application.admin.service.pojo.BCustomerTypeQuery;
import org.myproject.boot.application.admin.service.pojo.BCustomerTypeVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:57
 */
public interface BCustomerTypeApi {
    IPage<BCustomerType> selectByQuery(BCustomerTypeQuery query, int page, int size);

    List<BCustomerType> selectByQuery(BCustomerTypeQuery query);

    BCustomerType get(Long id);

    void save(BCustomerTypeVo vo);

    void update(BCustomerTypeVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
