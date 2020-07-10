package org.myproject.boot.application.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "org-myproject-boot-application-admin-pojo-SysRole")
@Data
public class SysRoleQuery implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;
    /**
     * 角色名称
     */
    @ApiModelProperty(value = "角色名称")
    private String name;
    /**
     * 角色描述
     */
    @ApiModelProperty(value = "角色描述")
    private String description;
    /**
     * 启用状态
     */
    @ApiModelProperty(value = "启用状态")
    private String enabled;
}
