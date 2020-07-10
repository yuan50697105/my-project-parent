package org.myproject.boot.application.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@ApiModel(value = "org-myproject-boot-application-admin-pojo-SysUser")
@Data
public class SysUserVo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;
    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;
    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;
    /**
     * 启用状态
     */
    @ApiModelProperty(value = "启用状态")
    private String enabled;
    @ApiModelProperty(value = "角色ID列表")
    private List<Long> roleIds;
}
