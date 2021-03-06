package org.myproject.app.db.auth.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.app.db.commons.pojo.BaseQuery;

import java.io.Serializable;

/**
 * auth_permission
 */
@ApiModel(value = "org-myproject-app-auth-pojo-AuthPermission")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@With
public class AuthPermissionQuery extends BaseQuery implements Serializable, MybatisExample<AuthPermissionExample> {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @AndLike
    private String name;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    @AndLike
    private String code;
    /**
     * enabled
     */
    @ApiModelProperty(value = "enabled")
    @AndEqualTo
    private Integer enabled;
}