package org.myproject.boot.application.admin.api.pojo;

import lombok.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-07 22:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
public class SysUsersVo {
    private Long id;
    private String username;
    private String name;
    private String password;
    private List<Long> roleIds;
}