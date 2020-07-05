package org.myproject.boot.application.admin.db.service.business;

import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoVo;
import org.myproject.boot.mybatis.pojo.PageResult;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:52
 */
public interface BCustomerInfoService {
    PageResult<TbCustomerInfo> selectByQuery( TbCustomerInfoQuery query,int page, int size);

    List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query);

    void insert(TbCustomerInfoVo vo);

    void update(TbCustomerInfoVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
