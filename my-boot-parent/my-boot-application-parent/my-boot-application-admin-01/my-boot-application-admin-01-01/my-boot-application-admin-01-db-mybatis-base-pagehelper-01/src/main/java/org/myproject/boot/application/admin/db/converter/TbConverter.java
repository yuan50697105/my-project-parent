package org.myproject.boot.application.admin.db.converter;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.myproject.boot.application.admin.db.pojo.*;
import org.myproject.boot.application.admin.pojo.*;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 19:01
 */
@Mapper(componentModel = "spring")
public interface TbConverter {
    @Mapping(target = "ageStart", ignore = true)
    @Mapping(target = "ageEnd", ignore = true)
    TbCustomerInfoQuery customerInfo(CustomerInfoQuery query);

    PageInfo<CustomerInfo> convertCustomerInfo(PageInfo<TbCustomerInfo> pageInfo);

    List<CustomerInfo> customerInfo(List<TbCustomerInfo> list);

    CustomerInfo customerInfo(TbCustomerInfo customerInfo);

    TbCustomerInfo customerInfo(CustomerInfoVo vo);

    TbCustomerTypeQuery customerType(CustomerTypeQuery query);

    PageInfo<CustomerType> customerType(PageInfo<TbCustomerType> pageInfo);

    List<CustomerType> customerType(List<TbCustomerType> list);

    CustomerType customerType(TbCustomerType customerType);

    TbCustomerType customerType(CustomerTypeVo vo);

    @Mapping(target = "priceStart", ignore = true)
    @Mapping(target = "priceEnd", ignore = true)
    TbGoodsInfoQuery goodsInfo(GoodsInfoQuery query);

    PageInfo<GoodsInfo> goodsInfo(PageInfo<TbGoodsInfo> pageInfo);

    List<GoodsInfo> goodsInfo(List<TbGoodsInfo> list);

    GoodsInfo goodsInfo(TbGoodsInfo goodsInfo);

    TbGoodsInfo goodsInfo(GoodsInfoVo vo);

    TbGoodsTypeQuery goodsType(GoodsTypeQuery query);

    PageInfo<GoodsType> goodsType(PageInfo<TbGoodsType> pageInfo);

    List<GoodsType> goodsType(List<TbGoodsType> list);

    GoodsType goodsType(TbGoodsType goodsType);

    TbGoodsType goodsType(GoodsTypeVo vo);

    TbSysRoleQuery sysRole(SysRoleQuery query);

    PageInfo<SysRole> sysRole(PageInfo<TbSysRole> pageInfo);

    List<SysRole> sysRole(List<TbSysRole> list);

    SysRole sysRole(TbSysRole sysRole);

    TbSysRole sysRole(SysRoleVo sysRoleVo);

    TbSysUserQuery sysUser(SysUserQuery query);

    PageInfo<SysUser> sysUser(PageInfo<TbSysUser> selectByQuery);

    List<SysUser> sysUser(List<TbSysUser> selectByQuery);

    SysUser sysUser(TbSysUser sysUser);

    TbSysUser sysUser(SysUserVo sysUser);
}
