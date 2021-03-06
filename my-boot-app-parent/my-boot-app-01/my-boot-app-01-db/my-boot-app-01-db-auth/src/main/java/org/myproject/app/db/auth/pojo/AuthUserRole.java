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
 * 用户角色
 */
@ApiModel(value = "org-myproject-app-auth-pojo-AuthUserRole")
@Data
@EqualsAndHashCode(callSuper = true)

@AllArgsConstructor
@NoArgsConstructor
public class AuthUserRole extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;
    /**
     * 角色ID
     */
    @ApiModelProperty(value = "角色ID")
    private Long roleId;
}