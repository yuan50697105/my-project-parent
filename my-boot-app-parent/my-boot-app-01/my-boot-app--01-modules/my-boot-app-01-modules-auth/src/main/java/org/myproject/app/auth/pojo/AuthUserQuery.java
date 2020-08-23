package org.myproject.app.auth.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * auth_user
 */
@ApiModel(value = "org-myproject-app-auth-pojo-AuthUser")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@With
public class AuthUserQuery extends BaseQuery implements Serializable, MybatisExample<AuthUserExample> {
    private static final long serialVersionUID = 1L;
    /**
     * username
     */
    @ApiModelProperty(value = "username")
    @AndLike
    private String username;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @AndLike
    private String name;
    /**
     * enabled
     */
    @ApiModelProperty(value = "enabled")
    @AndEqualTo
    private Integer enabled;

}