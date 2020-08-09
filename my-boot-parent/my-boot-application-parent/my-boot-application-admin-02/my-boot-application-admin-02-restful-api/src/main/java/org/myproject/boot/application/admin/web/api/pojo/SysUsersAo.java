package org.myproject.boot.application.admin.web.api.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-07 22:02
 */
@Data
public class SysUsersAo {
    private Long id;
    private String username;
    private String name;
    private List<SysRolesAo> roles;
}