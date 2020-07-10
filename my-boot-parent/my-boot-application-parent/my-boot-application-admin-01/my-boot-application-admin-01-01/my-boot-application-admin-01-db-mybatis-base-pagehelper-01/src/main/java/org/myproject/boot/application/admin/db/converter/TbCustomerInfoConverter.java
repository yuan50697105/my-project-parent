package org.myproject.boot.application.admin.db.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoVo;
import org.myproject.boot.application.admin.pojo.CustomerInfo;
import org.myproject.boot.application.admin.pojo.CustomerInfoQuery;
import org.myproject.boot.application.admin.pojo.CustomerInfoVo;
import org.myproject.boot.mybatis.pojo.PageResult;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-29 22:08
 */
@Mapper(componentModel = "spring")
public interface TbCustomerInfoConverter {
    @Mapping(target = "namePy", expression = "java(cn.hutool.extra.pinyin.PinyinUtil.getPinyin(tbCustomerInfoVo.getName()))")
    @Mapping(target = "namePyF", expression = "java(cn.hutool.extra.pinyin.PinyinUtil.getFirstLetter(tbCustomerInfoVo.getName(),null))")
    TbCustomerInfo voToPo(TbCustomerInfoVo tbCustomerInfoVo);

    TbCustomerInfoQuery convert(CustomerInfoQuery query);

    CustomerInfo convert(TbCustomerInfo customerInfo);

    TbCustomerInfo convert(CustomerInfoVo vo);

    PageResult<CustomerInfo> convert(PageResult<TbCustomerInfo> pageResult);

    List<CustomerInfo> convert(List<TbCustomerInfo> tbCustomerInfos);
}
