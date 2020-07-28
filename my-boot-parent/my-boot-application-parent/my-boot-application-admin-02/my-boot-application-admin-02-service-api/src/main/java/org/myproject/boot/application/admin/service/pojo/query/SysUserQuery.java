package org.myproject.boot.application.admin.service.pojo.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 20:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserQuery extends BaseQuery {
    private String username;
    private String name;
    private Long id;

}