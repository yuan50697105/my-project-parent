package org.myproject.app.auth.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * auth_user
 */
@ApiModel(value = "org-myproject-app-auth-pojo-AuthUser")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@With
public class AuthUserVo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * username
     */
    @ApiModelProperty(value = "username")
    private String username;
    /**
     * password
     */
    @ApiModelProperty(value = "password")
    private String password;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
    /**
     * enabled
     */
    @ApiModelProperty(value = "enabled")
    private Integer enabled;

}