package org.myproject.boot.application.admin.db.converter;

import com.github.pagehelper.PageInfo;
import org.mapstruct.*;
import org.myproject.boot.application.admin.db.pojo.*;
import org.myproject.boot.application.admin.service.pojo.*;

import java.util.ArrayList;
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
    TbGoodsInfoQuery goodsInfo(BGoodsInfoQuery query);

    PageInfo<BGoodsInfo> goodsInfo(PageInfo<TbGoodsInfo> pageInfo);

    List<BGoodsInfo> goodsInfo(List<TbGoodsInfo> list);

    BGoodsInfo goodsInfo(TbGoodsInfo goodsInfo);

    TbGoodsInfo goodsInfo(BGoodsInfoVo vo);

    @Mapping(target = "ageStart", ignore = true)
    @Mapping(target = "ageEnd", ignore = true)
    TbCustomerInfoQuery customerInfo(BCustomerInfoQuery query);

    PageInfo<BCustomerInfo> customerInfo(PageInfo<TbCustomerInfo> pageInfo);

    List<BCustomerInfo> customerInfo(List<TbCustomerInfo> list);

    BCustomerInfo customerInfo(TbCustomerInfo customerInfo);

    TbCustomerInfo customerInfo(BCustomerInfoVo vo);

    TbCustomerTypeQuery customerType(BCustomerTypeQuery query);

    PageInfo<BCustomerType> customerType(PageInfo<TbCustomerType> pageInfo);

    List<BCustomerType> customerType(List<TbCustomerType> list);

    BCustomerType customerType(TbCustomerType customerType);

    TbCustomerType customerType(BCustomerTypeVo vo);

    TbSysUserQuery sysUser(BSysUserQuery query);

    PageInfo<BSysUser> sysUser(PageInfo<TbSysUser> pageInfo);

    List<BSysUser> sysUser(List<TbSysUser> selectByQuery);

    BSysUser sysUser(TbSysUser sysUser);

    TbSysUser sysUser(BSysUserVo sysUser);

    TbSysRoleQuery sysRole(BSysRoleQuery query);

    PageInfo<BSysRole> sysRole(PageInfo<TbSysRole> pageInfo);

    List<BSysRole> sysRole(List<TbSysRole> selectByQuery);

    BSysRole sysRole(TbSysRole sysRole);

    TbSysRole sysUser(BSysRoleVo BSysRoleVo);

    TbGoodsTypeQuery goodsType(BGoodsTypeQuery query);

    PageInfo<BGoodsType> goodsType(PageInfo<TbGoodsType> pageInfo);

    List<BGoodsType> goodsType(List<TbGoodsType> list);

    BGoodsType goodsType(TbGoodsType byId);

    TbGoodsType goodsType(BGoodsTypeVo vo);

    List<BServiceRoute> createRoutes(List<TbSysRoute> list);

    TbSysRoute routeForInsert(BServiceRoute BServiceRoute);

    List<TbSysRoute> routeForInsert(List<BServiceRoute> BServiceRoute);

    @Mapping(target = "password", ignore = true)
    @Mapping(target = "username", ignore = true)
    TbSysUser sysUserUpdateInfo(BSysUserVo bSysUserVo);

    default List<TbSysUserRole> sysUserRole(Long id, List<Long> roleIds) {
        ArrayList<TbSysUserRole> sysUserRoles = new ArrayList<>();
        for (Long roleId : roleIds) {
            sysUserRoles.add(sysUserRole(id, roleId));
        }
        return sysUserRoles;
    }

    @Mapping(target = "id", ignore = true)
    TbSysUserRole sysUserRole(Long userId, Long roleId);
}