package org.myproject.boot.application.admin.db.converter;

import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeQuery;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeVo;
import org.myproject.boot.application.admin.pojo.CustomerType;
import org.myproject.boot.application.admin.pojo.CustomerTypeQuery;
import org.myproject.boot.application.admin.pojo.CustomerTypeVo;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-29 22:09
 */
@Mapper(componentModel = "spring")
public interface TbCustomerTypeConverter {
    TbCustomerType voToPo(TbCustomerTypeVo tbCustomerTypeVo);

    PageInfo<CustomerType> convert(PageInfo<TbCustomerType> pageInfo);

    TbCustomerTypeQuery convert(CustomerTypeQuery query);

    CustomerType convert(TbCustomerType customerType);

    List<CustomerType> convert(List<TbCustomerType> tbCustomerTypes);

    TbCustomerType convert(CustomerTypeVo vo);
}
