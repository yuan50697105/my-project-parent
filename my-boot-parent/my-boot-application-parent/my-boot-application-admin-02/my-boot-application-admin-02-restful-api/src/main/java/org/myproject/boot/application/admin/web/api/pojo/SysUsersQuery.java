package org.myproject.boot.application.admin.web.api.pojo;

import lombok.Data;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-07 22:25
 */
@Data
public class SysUsersQuery {
    private Long id;
    private String username;
    private String name;

}