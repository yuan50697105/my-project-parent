package org.myproject.boot.application.admin.db.service.business;

import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoVo;
import org.myproject.boot.mybatis.pojo.PageResult;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-07
 * @description:
 * @author: yuane
 * @create: 2020-07-06 21:49
 */
public interface BCustomerInfoService {
    PageResult<TbCustomerInfo>  selectByQuery(TbCustomerInfoQuery query, int page, int size);

    List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query);

    TbCustomerInfo selectById(Long id);

    void save(TbCustomerInfoVo sysUser);

    void update(TbCustomerInfoVo sysUserVo);

    void delete(List<Long> ids);

    void delete(Long id);
}
