package org.myproject.boot.application.admin.db.service.business;

import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeVo;
import org.myproject.boot.mybatis.pojo.PageResult;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:57
 */
public interface BCustomerTypeService {
    PageResult<TbCustomerType> selectByQuery(TbCustomerTypeQuery query, int page, int size);

    List<TbCustomerType> selectByQuery(TbCustomerTypeQuery query);

    TbCustomerType selectById(Long id);

    void insert(TbCustomerTypeVo vo);

    void update(TbCustomerTypeVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
