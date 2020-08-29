package org.myproject.app.auth.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * auth_role
 */
@ApiModel(value = "org-myproject-app-auth-pojo-AuthRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class AuthRoleVo extends AuthRole implements Serializable {
    @ApiModelProperty
    private List<AuthPermission> permissions;
}