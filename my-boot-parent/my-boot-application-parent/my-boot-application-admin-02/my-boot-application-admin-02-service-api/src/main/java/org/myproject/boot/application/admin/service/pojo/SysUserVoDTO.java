package org.myproject.boot.application.admin.service.pojo;

import lombok.Data;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-04 12:41
 */
@Data
public class SysUserVoDTO {
    private String username;
    private String name;
    private String password;
    private Event event;

    public enum Event {
        ADD, UPDATE
    }

}