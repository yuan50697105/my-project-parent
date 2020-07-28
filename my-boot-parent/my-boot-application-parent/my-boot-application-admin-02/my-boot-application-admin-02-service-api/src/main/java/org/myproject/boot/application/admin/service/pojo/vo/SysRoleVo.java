package org.myproject.boot.application.admin.service.pojo.vo;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 21:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Accessors(chain = true)
@With
public class SysRoleVo {
    @Accessors(fluent = true)
    private Event event;
    @Accessors(fluent = true)
    private Long id;
    private String name;
    @Singular
    private List<Long> routes;

    public enum Event {
        ADD, UPDATE
    }

}