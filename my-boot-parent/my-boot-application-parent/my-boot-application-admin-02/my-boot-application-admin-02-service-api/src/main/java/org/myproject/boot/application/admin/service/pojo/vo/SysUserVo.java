package org.myproject.boot.application.admin.service.pojo.vo;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 09:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@With
public class SysUserVo {
    @Accessors(fluent = true)
    private Event event;
    @Accessors(fluent = true)
    private Long id;
    private String username;
    private String password;
    private String name;
    @Singular
    private List<Long> roleIds;

    public enum Event {
        SAVE, ADD, UPDATE, UPDATE_INFO, UPDATE_ROLE
    }
}