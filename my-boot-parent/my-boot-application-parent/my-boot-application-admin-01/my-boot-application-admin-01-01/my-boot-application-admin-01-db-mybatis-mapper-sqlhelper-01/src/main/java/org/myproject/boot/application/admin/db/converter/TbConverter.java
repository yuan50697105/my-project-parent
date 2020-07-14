package org.myproject.boot.application.admin.db.converter;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.mapstruct.*;
import org.myproject.boot.application.admin.db.pojo.*;
import org.myproject.boot.application.admin.service.pojo.*;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 19:01
 */
@Primary
@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION)
public interface TbConverter {
    @Mapping(target = "ageStart", ignore = true)
    @Mapping(target = "ageEnd", ignore = true)
    TbCustomerInfoQuery customerInfo(CustomerInfoQuery query);

    PageInfo<CustomerInfo> customerInfo(PageInfo<TbCustomerInfo> pageInfo);

    List<CustomerInfo> customerInfo(List<TbCustomerInfo> list);

    CustomerInfo customerInfo(TbCustomerInfo customerInfo);

    @Mapping(target = "namePy", expression = "java(cn.hutool.extra.pinyin.PinyinUtil.getPinyin(vo.getName(),\"\"))")
    @Mapping(target = "namePyF", expression = "java(cn.hutool.extra.pinyin.PinyinUtil.getFirstLetter(vo.getName(),\"\"))")
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

    TbSysUserQuery sysUser(TbSysUserQuery query);

    PageInfo<SysUser> sysUser(PageInfo<TbSysUser> selectByQuery);

    List<SysUser> sysUser(List<TbSysUser> selectByQuery);

    SysUser sysUser(TbSysUser sysUser);

    TbSysUser sysUser(SysUserVo sysUser);

    default List<TbSysUserRole> sysUserRole(Long userId, List<Long> roleIds) {
        ArrayList<TbSysUserRole> sysUserRoles = Lists.newArrayList();
        for (Long roleId : roleIds) {
            sysUserRoles.add(sysUserRole(userId, roleId));
        }
        return sysUserRoles;
    }

    @Mapping(target = "id", ignore = true)
    TbSysUserRole sysUserRole(Long userId, Long roleId);

    List<ServiceRoute> createRoutes(List<TbSysRoute> list);

    @Mapping(target = "weight", ignore = true)
    @Mapping(target = "parentId", ignore = true)
    @Mapping(target = "id", ignore = true)
    TbSysRoute routeForInsert(ServiceRoute serviceRoute);

    List<TbSysRoute> routeForInsert(List<ServiceRoute> serviceRoute);

    TbSysUserQuery sysUser(SysUserQuery query);
}
