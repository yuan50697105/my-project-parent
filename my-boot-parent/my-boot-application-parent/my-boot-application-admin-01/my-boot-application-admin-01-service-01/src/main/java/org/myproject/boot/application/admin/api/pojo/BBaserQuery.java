package org.myproject.boot.application.admin.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-19 20:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public abstract class BBaserQuery {
    private int page = 1;
    private int size = 10;
}