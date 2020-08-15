package org.myproject.boot.application.admin.mvc.graphiql.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-15 12:53
 */
@Data
public class SysUser {
    private Integer id;
    private String username;
    private List<SysUser> users;
}