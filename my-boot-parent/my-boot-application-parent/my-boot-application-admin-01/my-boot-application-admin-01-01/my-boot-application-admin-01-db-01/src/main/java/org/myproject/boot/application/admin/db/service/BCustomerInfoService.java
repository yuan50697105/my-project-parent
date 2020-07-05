package org.myproject.boot.application.admin.db.service;

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
    PageResult<TbCustomerInfo> selectByQueryWithPage(int page, int size, TbCustomerInfoQuery query);

    List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query);

    void insert(TbCustomerInfoVo vo);

    void updateByPrimaryKeySelective(TbCustomerInfoVo vo);

    void deleteByIds(List<Long> ids);

    void deleteByPrimaryKey(Long id);
}
