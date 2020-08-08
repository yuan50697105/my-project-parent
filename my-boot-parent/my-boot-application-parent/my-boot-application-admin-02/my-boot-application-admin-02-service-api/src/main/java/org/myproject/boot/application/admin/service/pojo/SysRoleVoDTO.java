package org.myproject.boot.application.admin.service.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-08 16:48
 */
@Data
public class SysRoleVoDTO {
    private Event event;
    private Long id;
    private String name;
    private String decription;
    private List<Object> routes;

    public enum Event {
        ADD, UPDATE
    }


}