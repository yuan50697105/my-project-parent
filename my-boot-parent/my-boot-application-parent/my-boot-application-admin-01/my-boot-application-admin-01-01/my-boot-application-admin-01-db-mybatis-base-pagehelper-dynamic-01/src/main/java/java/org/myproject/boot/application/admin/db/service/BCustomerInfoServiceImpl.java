package java.org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbCustomerInfoConverter;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.myproject.boot.application.admin.db.service.table.TbCustomerInfoService;
import org.myproject.boot.application.admin.pojo.CustomerInfo;
import org.myproject.boot.application.admin.pojo.CustomerInfoQuery;
import org.myproject.boot.application.admin.pojo.CustomerInfoVo;
import org.myproject.boot.application.admin.service.BCustomerInfoService;
import org.myproject.boot.mybatis.commons.pojo.IPage;
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
    private final TbCustomerInfoConverter customerInfoConverter;

    @Override
    public IPage<CustomerInfo> selectByQuery(CustomerInfoQuery query, int page, int size) {
        TbCustomerInfoQuery customerInfoQuery = customerInfoConverter.convert(query);
        PageInfo<TbCustomerInfo> pageResult = customerInfoService.selectByQueryWithPage(page, size, customerInfoQuery);
        return new PageResult<>(customerInfoConverter.convert(pageResult));
    }

    @Override
    public List<CustomerInfo> selectByQuery(CustomerInfoQuery query) {
        TbCustomerInfoQuery customerInfoQuery = customerInfoConverter.convert(query);
        List<TbCustomerInfo> tbCustomerInfos = customerInfoService.selectByQuery(customerInfoQuery);
        return customerInfoConverter.convert(tbCustomerInfos);
    }

    @Override
    public CustomerInfo get(Long id) {
        TbCustomerInfo customerInfo = customerInfoService.selectByPrimaryKey(id);
        return customerInfoConverter.convert(customerInfo);
    }

    @Override
    public void insert(CustomerInfoVo vo) {
        TbCustomerInfo customerInfo = customerInfoConverter.convert(vo);
        customerInfoService.insert(customerInfo);
    }

    @Override
    public void update(CustomerInfoVo vo) {
        TbCustomerInfo customerInfo = customerInfoConverter.convert(vo);
        customerInfoService.updateByPrimaryKeySelective(customerInfo);
    }

    @Override
    public void delete(List<Long> ids) {
        TbCustomerInfoExample example = new TbCustomerInfoExample();
        example.or().andIdIn(ids);
        customerInfoService.deleteByExample(example);
    }

    @Override
    public void delete(Long id) {
        customerInfoService.deleteByPrimaryKey(id);
    }

}