package org.myproject.app.db.commons.pojo;

import lombok.Data;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 14:48
 */
@Data
public class BaseQuery {
    private int page = 1;
    private int limit = 20;
}