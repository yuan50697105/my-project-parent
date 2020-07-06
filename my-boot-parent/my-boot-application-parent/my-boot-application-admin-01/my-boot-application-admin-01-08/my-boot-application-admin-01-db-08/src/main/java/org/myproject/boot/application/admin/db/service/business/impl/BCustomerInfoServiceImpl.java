package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoVo;
import org.myproject.boot.application.admin.db.service.business.BCustomerInfoService;
import org.myproject.boot.application.admin.db.service.table.TbCustomerInfoService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-07
 * @description:
 * @author: yuane
 * @create: 2020-07-06 21:49
 */
@Service
@AllArgsConstructor
@Transactional
public class BCustomerInfoServiceImpl implements BCustomerInfoService {
    private final TbCustomerInfoService customerInfoService;

    @Override
    public PageResult<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query, int page, int size) {
        return new PageResult<TbCustomerInfo>(customerInfoService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query) {
        return customerInfoService.selectByQuery(query);
    }

    @Override
    public TbCustomerInfo selectById(Long id) {
        return customerInfoService.getById(id);
    }

    @Override
    public void save(TbCustomerInfoVo sysUserVo) {
        customerInfoService.save(convert(sysUserVo));
    }

    @Override
    public void update(TbCustomerInfoVo sysUserVo) {
        customerInfoService.updateById(convert(sysUserVo));
    }

    @Override
    public void delete(List<Long> ids) {
        customerInfoService.removeByIds(ids);
    }

    @Override
    public void delete(Long id) {
        customerInfoService.removeById(id);
    }

    private TbCustomerInfo convert(TbCustomerInfoVo vo) {
        TbCustomerInfo tbCustomerInfo = new TbCustomerInfo();
        tbCustomerInfo.setName(vo.getName());
        tbCustomerInfo.setNamePy(vo.getNamePy());
        tbCustomerInfo.setNamePyF(vo.getNamePyF());
        tbCustomerInfo.setPhone(vo.getPhone());
        tbCustomerInfo.setAge(vo.getAge());
        tbCustomerInfo.setTypeId(vo.getTypeId());
        tbCustomerInfo.setId(vo.getId());
        return tbCustomerInfo;

    }
}
