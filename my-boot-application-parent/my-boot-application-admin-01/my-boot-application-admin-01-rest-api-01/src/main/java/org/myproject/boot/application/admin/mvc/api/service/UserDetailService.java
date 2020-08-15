//package org.myproject.boot.application.admin.mvc.service;
//
//import lombok.AllArgsConstructor;
//import org.myproject.boot.application.admin.db.pojo.*;
//import org.myproject.boot.application.admin.db.service.table.*;
//import org.myproject.boot.security.pojo.JwtUser;
//import org.myproject.boot.security.pojo.User;
//import org.myproject.boot.security.service.UserDetailsAndRouteService;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
///**
// * @program: my-project-parent
// * @description:
// * @author: yuane
// * @create: 2020-07-09 21:26
// */
//@Service
//@AllArgsConstructor
//public class UserDetailService implements UserDetailsAndRouteService {
//    private final SysUserRoleService sysUserRoleService;
//    private final SysUserService sysUserService;
//    private final SysRoleService sysRoleService;
//    private final SysRoleRouteService sysRoleRouteService;
//    private final SysRouteService sysRouteService;
//
//    @Override
//    public Set<String> getRoleList(String username) {
//        BSysUser sysUser = sysUserService.selectOneByUsername(username);
//        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
//        sysUserRoleExample.or().andUserIdEqualTo(sysUser.getId());
//        List<BSysUserRole> userRoles = sysUserRoleService.selectByExample(sysUserRoleExample);
//        List<Long> roleIds = userRoles.stream().map(BSysUserRole::getRoleId).distinct().collect(Collectors.toList());
//        SysRoleExample sysRoleExample = new SysRoleExample();
//        sysRoleExample.or().andIdIn(roleIds);
//        List<BSysRole> sysRoles = sysRoleService.selectByExample(sysRoleExample);
//        return sysRoles.stream().map(BSysRole::getName).collect(Collectors.toCollection(LinkedHashSet::new));
//    }
//
//    @Override
//    public Set<String> getRouteList(String username) {
//        BSysUser sysUser = sysUserService.selectOneByUsername(username);
//        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
//        sysUserRoleExample.or().andUserIdEqualTo(sysUser.getId());
//        List<BSysUserRole> userRoles = sysUserRoleService.selectByExample(sysUserRoleExample);
//        List<Long> roleIds = userRoles.stream().map(BSysUserRole::getRoleId).distinct().collect(Collectors.toList());
//        SysRoleRouteExample sysRoleRouteExample = new SysRoleRouteExample();
//        sysRoleRouteExample.or().andIdIn(roleIds);
//        List<BSysRoleRoute> sysRoleRoutes = sysRoleRouteService.selectByExample(sysRoleRouteExample);
//        List<Long> routeIds = sysRoleRoutes.stream().map(BSysRoleRoute::getRouteId).distinct().collect(Collectors.toList());
//        SysRouteExample sysRouteExample = new SysRouteExample();
//        sysRouteExample.or().andIdIn(routeIds);
//        return sysRouteService.selectByExample(sysRouteExample).stream().map(BSysRoute::getUrl).collect(Collectors.toSet());
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        BSysUser sysUser = sysUserService.selectOneByUsername(s);
//        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
//        sysUserRoleExample.or().andUserIdEqualTo(sysUser.getId());
//        List<BSysUserRole> userRoles = sysUserRoleService.selectByExample(sysUserRoleExample);
//        List<Long> roleIds = userRoles.stream().map(BSysUserRole::getRoleId).distinct().collect(Collectors.toList());
//        SysRoleExample sysRoleExample = new SysRoleExample();
//        sysRoleExample.or().andIdIn(roleIds);
//        List<BSysRole> sysRoles = sysRoleService.selectByExample(sysRoleExample);
//        return new JwtUser(new User(sysUser.getId(), sysUser.getUsername(), sysUser.getPassword(), sysRoles.stream().map(BSysRole::getName).distinct().collect(Collectors.toList())));
//    }
//}