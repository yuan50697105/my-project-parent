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
 * @program: my-boot-application-admin-01-05
 * @description:
 * @author: yuane
 * @create: 2020-07-06 20:03
 */
@Service
@AllArgsConstructor
@Transactional
public class BCustomerTypeServiceImpl implements BCustomerTypeService {
    private final TbCustomerTypeService customerInfoService;

    @Override
    public PageResult<TbCustomerType> selectByQuery(TbCustomerTypeQuery query, int page, int size) {
        return new PageResult<>(customerInfoService.selectByQuery(query, page, size));
    }

    @Override
    public List<TbCustomerType> selectByQuery(TbCustomerTypeQuery query) {
        return customerInfoService.selectByQuery(query);
    }

    @Override
    public void save(TbCustomerTypeVo vo) {
        customerInfoService.insert(convert(vo));
    }

    @Override
    public void update(TbCustomerTypeVo vo) {
        customerInfoService.updateSelective(convert(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        customerInfoService.deleteByExample(Example.builder(TbCustomerType.class).andWhere(Sqls.custom().andIn("id",ids)).build());
    }

    @Override
    public void delete(Long id) {
        customerInfoService.deleteById(id);
    }

    private TbCustomerType convert(TbCustomerTypeVo vo) {
        TbCustomerType tbCustomerType = new TbCustomerType();
        tbCustomerType.setNaem(vo.getNaem());
        tbCustomerType.setId(vo.getId());
        return tbCustomerType;
    }
}