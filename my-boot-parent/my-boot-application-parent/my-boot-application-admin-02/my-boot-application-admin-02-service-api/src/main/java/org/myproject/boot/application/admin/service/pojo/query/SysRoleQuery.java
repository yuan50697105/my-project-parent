package org.myproject.boot.application.admin.service.pojo.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 21:40
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysRoleQuery extends BaseQuery {
    private String name;
}