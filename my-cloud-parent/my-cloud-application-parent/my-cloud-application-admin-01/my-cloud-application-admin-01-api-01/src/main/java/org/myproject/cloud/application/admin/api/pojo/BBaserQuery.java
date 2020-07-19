package org.myproject.cloud.application.admin.api.pojo;

import lombok.Data;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-19 20:04
 */
@Data
public class BBaserQuery {
    private int page = 1;
    private int size;
}