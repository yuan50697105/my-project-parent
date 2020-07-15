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
    TbCustomerInfoQuery customerInfo(BCustomerInfoQuery query);

    PageInfo<BCustomerInfo> customerInfo(PageInfo<TbCustomerInfo> pageInfo);

    List<BCustomerInfo> customerInfo(List<TbCustomerInfo> list);

    BCustomerInfo customerInfo(TbCustomerInfo customerInfo);

    @Mapping(target = "namePy", expression = "java(cn.hutool.extra.pinyin.PinyinUtil.getPinyin(vo.getName(),\"\"))")
    @Mapping(target = "namePyF", expression = "java(cn.hutool.extra.pinyin.PinyinUtil.getFirstLetter(vo.getName(),\"\"))")
    TbCustomerInfo customerInfo(BCustomerInfoVo vo);

    TbCustomerTypeQuery customerType(BCustomerTypeQuery query);

    PageInfo<BCustomerType> customerType(PageInfo<TbCustomerType> pageInfo);

    List<BCustomerType> customerType(List<TbCustomerType> list);

    BCustomerType customerType(TbCustomerType customerType);

    TbCustomerType customerType(BCustomerTypeVo vo);

    @Mapping(target = "priceStart", ignore = true)
    @Mapping(target = "priceEnd", ignore = true)
    TbGoodsInfoQuery goodsInfo(BGoodsInfoQuery query);

    PageInfo<BGoodsInfo> goodsInfo(PageInfo<TbGoodsInfo> pageInfo);

    List<BGoodsInfo> goodsInfo(List<TbGoodsInfo> list);

    BGoodsInfo goodsInfo(TbGoodsInfo goodsInfo);

    TbGoodsInfo goodsInfo(BGoodsInfoVo vo);

    TbGoodsTypeQuery goodsType(BGoodsTypeQuery query);

    PageInfo<BGoodsType> goodsType(PageInfo<TbGoodsType> pageInfo);

    List<BGoodsType> goodsType(List<TbGoodsType> list);

    BGoodsType goodsType(TbGoodsType goodsType);

    TbGoodsType goodsType(BGoodsTypeVo vo);

    TbSysRoleQuery sysRole(BSysRoleQuery query);

    PageInfo<BSysRole> sysRole(PageInfo<TbSysRole> pageInfo);

    List<BSysRole> sysRole(List<TbSysRole> list);

    BSysRole sysRole(TbSysRole sysRole);

    TbSysRole sysRole(BSysRoleVo BSysRoleVo);

    TbSysUserQuery sysUser(TbSysUserQuery query);

    PageInfo<BSysUser> sysUser(PageInfo<TbSysUser> selectByQuery);

    List<BSysUser> sysUser(List<TbSysUser> selectByQuery);

    BSysUser sysUser(TbSysUser sysUser);

    TbSysUser sysUser(BSysUserVo sysUser);

    default List<TbSysUserRole> sysUserRole(Long userId, List<Long> roleIds) {
        ArrayList<TbSysUserRole> sysUserRoles = Lists.newArrayList();
        for (Long roleId : roleIds) {
            sysUserRoles.add(sysUserRole(userId, roleId));
        }
        return sysUserRoles;
    }

    @Mapping(target = "id", ignore = true)
    TbSysUserRole sysUserRole(Long userId, Long roleId);

    List<BServiceRoute> createRoutes(List<TbSysRoute> list);

    @Mapping(target = "weight", ignore = true)
    @Mapping(target = "parentId", ignore = true)
    @Mapping(target = "id", ignore = true)
    TbSysRoute routeForInsert(BServiceRoute BServiceRoute);

    List<TbSysRoute> routeForInsert(List<BServiceRoute> BServiceRoute);

    TbSysUserQuery sysUser(BSysUserQuery query);
}
