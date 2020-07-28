package org.myproject.boot.application.admin.service.pojo;

import lombok.Data;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 21:16
 */
@Data
public class BaseQuery {
    private int page = 1;
    private int limit = 20;
}