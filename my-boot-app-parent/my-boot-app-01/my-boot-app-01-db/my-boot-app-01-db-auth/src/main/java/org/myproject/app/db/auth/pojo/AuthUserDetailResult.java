package org.myproject.app.db.auth.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-29 18:45
 */
@EqualsAndHashCode(callSuper = true)
@Data

@ApiModel
public class AuthUserDetailResult extends AuthUser {
    @ApiModelProperty
    private List<RoleByUserResult> roles;
    @ApiModelProperty
    private List<PermissionByUserIdResult> permissions;


}