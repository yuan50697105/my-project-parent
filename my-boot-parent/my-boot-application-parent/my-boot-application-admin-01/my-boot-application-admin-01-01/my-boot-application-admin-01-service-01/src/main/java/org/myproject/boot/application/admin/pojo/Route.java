package org.myproject.boot.application.admin.pojo;

import lombok.*;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 20:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Route {
    @NonNull
    private String url;
    private String name;
    private String method;
}