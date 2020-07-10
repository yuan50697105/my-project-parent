package org.myproject.boot.application.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "org-myproject-boot-application-admin-pojo-SysUserRole")
@Data
public class SysUserRole implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long userId;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long roleId;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long id;
}
