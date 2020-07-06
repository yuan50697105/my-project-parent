package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeVo;
import org.myproject.boot.application.admin.db.service.business.BCustomerTypeService;
import org.myproject.boot.application.admin.db.service.table.TbCustomerTypeService;
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
public class BCustomerTypeServiceImpl implements BCustomerTypeService {
    private final TbCustomerTypeService customerTypeService;

    @Override
    public PageResult<TbCustomerType> selectByQuery(TbCustomerTypeQuery query, int page, int size) {
        return new PageResult<>(customerTypeService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbCustomerType> selectByQuery(TbCustomerTypeQuery query) {
        return customerTypeService.selectByQuery(query);
    }

    @Override
    public TbCustomerType selectById(Long id) {
        return customerTypeService.selectById(id);
    }

    @Override
    public void save(TbCustomerTypeVo vo) {
        customerTypeService.insert(convert(vo));
    }

    @Override
    public void update(TbCustomerTypeVo vo) {
        customerTypeService.updateSelective(convert(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        Object o = Example.builder(TbCustomerType.class).where(Sqls.custom().andIn("id",ids)).build();
        customerTypeService.deleteByExample(o);
    }

    @Override
    public void delete(Long id) {
        customerTypeService.deleteById(id);
    }

    private TbCustomerType convert(TbCustomerTypeVo vo) {
        TbCustomerType tbCustomerType = new TbCustomerType();
        tbCustomerType.setNaem(vo.getNaem());
        tbCustomerType.setId(vo.getId());
        return tbCustomerType;
    }
}