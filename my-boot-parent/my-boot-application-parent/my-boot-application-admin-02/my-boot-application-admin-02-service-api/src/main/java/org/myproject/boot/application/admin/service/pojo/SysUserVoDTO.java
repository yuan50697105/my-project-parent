package org.myproject.boot.application.admin.service.pojo;

import lombok.*;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-05 14:36
 */
@Data
public class SysUserVoDTO {
    private Event event;
    private Long id;
    private String username;
    private String name;
    private String password;
    private List<Long> roleIds;

    public enum Event {
        ADD, UPDATE
    }
}