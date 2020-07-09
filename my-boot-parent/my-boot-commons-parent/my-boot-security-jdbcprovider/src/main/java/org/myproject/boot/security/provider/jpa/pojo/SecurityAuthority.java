package org.myproject.boot.security.provider.jpa.pojo;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-09 21:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
public class SecurityAuthority implements GrantedAuthority {
    @Id
    @GeneratedValue
    @NonNull
    private Long id;
    private String authority;

}