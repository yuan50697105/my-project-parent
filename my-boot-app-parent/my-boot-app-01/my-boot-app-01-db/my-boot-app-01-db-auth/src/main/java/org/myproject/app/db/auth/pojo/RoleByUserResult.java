package org.myproject.app.db.auth.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "org-myproject-app-auth-pojo-RoleByUserResult")
@Data
public class RoleByUserResult implements Serializable {
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
    private String name;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private String description;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer enabled;
}

