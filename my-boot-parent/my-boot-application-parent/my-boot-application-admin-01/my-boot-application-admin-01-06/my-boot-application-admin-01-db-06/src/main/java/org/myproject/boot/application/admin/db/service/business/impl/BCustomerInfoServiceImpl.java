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
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-06
 * @description:
 * @author: yuane
 * @create: 2020-07-06 20:58
 */
@Service
@AllArgsConstructor
@Transactional
public class BCustomerInfoServiceImpl implements BCustomerInfoService {
    private final TbCustomerInfoService customerInfoService;

    @Override
    public PageResult<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query, int page, int size) {
        return new PageResult<>(customerInfoService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query) {
        return customerInfoService.selectByQuery(query);
    }

    @Override
    public TbCustomerInfo selectById(Long id) {
        return customerInfoService.selectById(id);
    }

    @Override
    public void save(TbCustomerInfoVo vo) {
        customerInfoService.insert(convert(vo));
    }

    @Override
    public void update(TbCustomerInfoVo vo) {
        customerInfoService.updateByPrimaryKeySelective(convert(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        Object o = Example.builder(TbCustomerInfo.class).where(Sqls.custom().andIn("id",ids)).build();
        customerInfoService.deleteByExample(o);
    }

    @Override
    public void delete(Long id) {
        customerInfoService.deleteByPrimaryKey(id);
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