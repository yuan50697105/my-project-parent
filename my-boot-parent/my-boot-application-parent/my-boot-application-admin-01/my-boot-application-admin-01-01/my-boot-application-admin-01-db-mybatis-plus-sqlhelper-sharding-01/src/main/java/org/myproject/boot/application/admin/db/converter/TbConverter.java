package org.myproject.boot.application.admin.db.converter;

import com.github.pagehelper.PageInfo;
import org.mapstruct.*;
import org.myproject.boot.application.admin.db.pojo.*;
import org.myproject.boot.application.admin.service.pojo.*;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 22:20
 */
@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION)
public interface TbConverter {
    @Mapping(target = "priceStart", ignore = true)
    @Mapping(target = "priceEnd", ignore = true)
    TbGoodsInfoQuery goodsInfo(GoodsInfoQuery query);

    PageInfo<GoodsInfo> goodsInfo(PageInfo<TbGoodsInfo> pageInfo);

    List<GoodsInfo> goodsInfo(List<TbGoodsInfo> list);

    GoodsInfo goodsInfo(TbGoodsInfo goodsInfo);

    TbGoodsInfo goodsInfo(GoodsInfoVo vo);

    @Mapping(target = "ageStart", ignore = true)
    @Mapping(target = "ageEnd", ignore = true)
    TbCustomerInfoQuery customerInfo(CustomerInfoQuery query);

    PageInfo<CustomerInfo> customerInfo(PageInfo<TbCustomerInfo> pageInfo);

    List<CustomerInfo> customerInfo(List<TbCustomerInfo> list);

    CustomerInfo customerInfo(TbCustomerInfo customerInfo);

    TbCustomerInfo customerInfo(CustomerInfoVo vo);

    TbCustomerTypeQuery customerType(CustomerTypeQuery query);

    PageInfo<CustomerType> customerType(PageInfo<TbCustomerType> pageInfo);

    List<CustomerType> customerType(List<TbCustomerType> list);

    CustomerType customerType(TbCustomerType customerType);

    TbCustomerType customerType(CustomerTypeVo vo);

    TbSysUserQuery sysUser(SysUserQuery query);

    PageInfo<SysUser> sysUser(PageInfo<TbSysUser> pageInfo);

    List<SysUser> sysUser(List<TbSysUser> selectByQuery);

    SysUser sysUser(TbSysUser sysUser);

    TbSysUser sysUser(SysUserVo sysUser);

    TbSysRoleQuery sysRole(SysRoleQuery query);

    PageInfo<SysRole> sysRole(PageInfo<TbSysRole> pageInfo);

    List<SysRole> sysRole(List<TbSysRole> selectByQuery);

    SysRole sysRole(TbSysRole sysRole);

    TbSysRole sysUser(SysRoleVo sysRoleVo);

    TbGoodsTypeQuery goodsType(GoodsTypeQuery query);

    PageInfo<GoodsType> goodsType(PageInfo<TbGoodsType> pageInfo);

    List<GoodsType> goodsType(List<TbGoodsType> list);

    GoodsType goodsType(TbGoodsType byId);

    TbGoodsType goodsType(GoodsTypeVo vo);

    List<ServiceRoute> createRoutes(List<TbSysRoute> list);

    TbSysRoute routeForInsert(ServiceRoute serviceRoute);

    List<TbSysRoute> routeForInsert(List<ServiceRoute> serviceRoute);
}