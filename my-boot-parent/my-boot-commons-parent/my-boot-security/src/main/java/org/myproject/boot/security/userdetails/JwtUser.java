package org.myproject.boot.security.userdetails;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 22:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtUser implements UserDetails {
    private Long id;
    private String username;
    private String name;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;
    @Singular
    private List<LoginUserAuthority> authorities;

    @Override
    public String getPassword() {
        return "";
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class LoginUserAuthority implements GrantedAuthority {
        private Long id;
        private String authority;
    }
}