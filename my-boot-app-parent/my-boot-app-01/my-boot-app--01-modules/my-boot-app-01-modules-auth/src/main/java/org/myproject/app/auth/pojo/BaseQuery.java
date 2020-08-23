package org.myproject.app.auth.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 14:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseQuery extends BaseEntity {
    private int page = 1;
    private int limit = 20;
}