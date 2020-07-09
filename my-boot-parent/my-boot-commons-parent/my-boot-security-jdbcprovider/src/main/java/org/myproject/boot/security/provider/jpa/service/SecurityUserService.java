package org.myproject.boot.security.provider.jpa.service;

import org.myproject.boot.security.service.UserDetailsAndRouteService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-09 21:18
 */
@Service
public class SecurityUserService implements UserDetailsAndRouteService {

    @Override
    public Set<String> getRoleList(String username) {
        return null;
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