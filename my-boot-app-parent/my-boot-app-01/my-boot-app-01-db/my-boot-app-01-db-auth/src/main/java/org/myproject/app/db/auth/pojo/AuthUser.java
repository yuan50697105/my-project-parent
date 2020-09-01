package org.myproject.app.db.auth.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * auth_user
 */
@ApiModel(value = "org-myproject-app-auth-pojo-AuthUser")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class AuthUser extends BaseEntity implements Serializable {
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
    /**
     * lastLoginTime
     */
    @ApiModelProperty(value = "lastLoginTime")
    private Date lastLoginTime;
    /**
     * createTime
     */
    @ApiModelProperty(value = "createTime")
    private Date createTime;

}