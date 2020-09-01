package org.myproject.app.db.auth.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * auth_permission
 */
@ApiModel(value = "org-myproject-app-auth-pojo-AuthPermission")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class AuthPermission extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
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
}