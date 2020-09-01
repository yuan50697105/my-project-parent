package org.myproject.app.db.auth.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "org-myproject-app-auth-pojo-UserRoleResult")
@Data
public class UserRoleResult implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long id;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private String username;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private String password;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private String name;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer enabled;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Date lastLoginTime;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Date createTime;
}

