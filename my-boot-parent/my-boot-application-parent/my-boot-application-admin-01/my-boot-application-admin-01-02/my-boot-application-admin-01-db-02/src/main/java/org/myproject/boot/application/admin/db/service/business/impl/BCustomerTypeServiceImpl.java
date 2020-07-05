package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeVo;
import org.myproject.boot.application.admin.db.service.base.TbCustomerTypeService;
import org.myproject.boot.application.admin.db.service.business.BCustomerTypeService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-02
 * @description:
 * @author: yuane
 * @create: 2020-07-05 17:07
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
    public void insert(TbCustomerTypeVo vo) {
        customerTypeService.insert(convert(vo));
    }

    @Override
    public void update(TbCustomerTypeVo vo) {
        customerTypeService.updateByPrimaryKeySelective(convert(vo));
    }

    @Override
    public void delete(List<Long> ids) {
        TbCustomerTypeExample example = new TbCustomerTypeExample();
        example.or().andIdIn(ids);
        customerTypeService.deleteByExample(example);
    }

    @Override
    public void delete(Long id) {
        customerTypeService.deleteByPrimaryKey(id);
    }

    private TbCustomerType convert(TbCustomerTypeVo vo) {
        TbCustomerType tbCustomerType = new TbCustomerType();
        tbCustomerType.setNaem(vo.getNaem());
        tbCustomerType.setId(vo.getId());
        return tbCustomerType;
    }
}