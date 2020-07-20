package org.myproject.boot.application.admin.api.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.List;

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
public class BServiceRoute implements Serializable {
    @NonNull
    private String url;
    private String name;
    private String method;
    @Singular
    private List<BServiceRoute> children;
}