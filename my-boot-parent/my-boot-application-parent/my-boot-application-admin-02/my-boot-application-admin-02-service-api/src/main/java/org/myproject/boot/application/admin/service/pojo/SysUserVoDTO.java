package org.myproject.boot.application.admin.service.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

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
    @Accessors(fluent = true)
    private Event event;
    @Accessors(fluent = true)
    private Long id;
    private String username;
    private String name;
    private String password;
    private List<Long> roleIds;

    public enum Event {
        ADD, UPDATE
    }
}