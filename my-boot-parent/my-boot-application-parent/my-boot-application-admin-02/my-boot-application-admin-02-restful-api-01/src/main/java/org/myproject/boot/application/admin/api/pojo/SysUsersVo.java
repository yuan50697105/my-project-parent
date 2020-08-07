package org.myproject.boot.application.admin.api.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-07 22:02
 */
@Data
public class SysUsersVo {
    @Accessors(fluent = true)
    private Long id;
    private String username;
    private String name;
    private String password;
    private List<Long> roleIds;
}