package org.myproject.boot.application.admin.mvc.api.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-15 20:00
 */
@Data
public class VSysUserUpdate {
    private String name;
    private List<Long> roleIds;
}