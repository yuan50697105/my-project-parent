package org.myproject.app.db.auth.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-29 23:48
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel
@Data
public class AuthRoleDetailResult extends AuthRole {
    private List<PermissionByRoleResult> permissions;

}