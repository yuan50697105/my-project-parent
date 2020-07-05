package org.myproject.boot.application.admin.db.service.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoVo;
import org.myproject.boot.application.admin.db.service.BCustomerInfoService;
import org.myproject.boot.application.admin.db.service.TbCustomerInfoService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 09:53
 */
@Service
@AllArgsConstructor
@Transactional
public class BCustomerInfoServiceImpl implements BCustomerInfoService {
    private final TbCustomerInfoService customerInfoService;

    @Override
    public PageResult<TbCustomerInfo> selectByQueryWithPage(int page, int size, TbCustomerInfoQuery query) {
        return new PageResult<>(customerInfoService.selectByQueryWithPage(page, size, query));
    }

    @Override
    public List<TbCustomerInfo> selectByQuery(TbCustomerInfoQuery query) {
        return customerInfoService.selectByQuery(query);
    }

    @Override
    public void insert(TbCustomerInfoVo vo) {
        TbCustomerInfo customerInfo = createCustomerInfo(vo);
        customerInfoService.insert(customerInfo);
    }

    @Override
    public void updateByPrimaryKeySelective(TbCustomerInfoVo vo) {
        TbCustomerInfo customerInfo = createCustomerInfo(vo);
        customerInfoService.updateByPrimaryKeySelective(customerInfo);
    }

    @Override
    public void deleteByIds(List<Long> ids) {
        TbCustomerInfoExample example = new TbCustomerInfoExample();
        example.or().andIdIn(ids);
        customerInfoService.deleteByExample(example);
    }

    @Override
    public void deleteByPrimaryKey(Long id) {
        customerInfoService.deleteByPrimaryKey(id);
    }

    private TbCustomerInfo createCustomerInfo(TbCustomerInfoVo vo) {
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