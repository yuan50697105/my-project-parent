package org.myproject.boot.application.admin.service.pojo;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-05 14:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@With
@Builder
public class SysUserVoDTO {
    private String username;
    private String name;
    private String password;
    @Accessors(fluent = true)
    private Event event;

    public enum Event {
        ADD, UPDATE
    }
}