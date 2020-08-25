package org.myproject.app.auth.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * auth_permission
 */
@ApiModel(value = "org-myproject-app-auth-pojo-AuthPermission")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@With
public class AuthPermission extends BaseEntity implements Serializable {
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;

    /**
     * description
     */
    @ApiModelProperty(value = "description")
    private String description;

    /**
     * enabled
     */
    @ApiModelProperty(value = "enabled")
    private Integer enabled;

    private static final long serialVersionUID = 1L;
}