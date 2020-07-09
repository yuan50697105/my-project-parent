package org.myproject.boot.application.admin.mvc.service;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.service.table.SysUserRoleService;
import org.myproject.boot.application.admin.db.service.table.SysUserService;
import org.myproject.boot.security.service.UserDetailsAndRouteService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-09 21:26
 */
@Service
@AllArgsConstructor
public class UserDetailService implements UserDetailsAndRouteService {
    private final SysUserRoleService sysUserRoleService;
    private final SysUserService sysUserService;

    @Override
    public Set<String> getRoleList(String username) {
        SysUser sysUser = sysUserService.selectOneByUsername(username);
        return new LinkedHashSet<>();
    }

    @Override
    public Set<String> getRouteList(String username) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}