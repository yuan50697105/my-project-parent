package org.myproject.boot.application.admin.mvc.api.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-15 10:51
 */
@Data
public class VSysUserAdd {
    private String username;
    private String password;
    private String name;
    private List<Long> roleIds;
}