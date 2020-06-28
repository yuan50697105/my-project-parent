package org.myproject.boot.commons.route;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-28 21:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Route {
    private String url;
}