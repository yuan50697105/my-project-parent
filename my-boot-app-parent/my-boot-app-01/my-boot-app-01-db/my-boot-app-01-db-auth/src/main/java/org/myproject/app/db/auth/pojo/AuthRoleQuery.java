package org.myproject.app.db.auth.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.app.db.commons.pojo.BaseQuery;

import java.io.Serializable;

/**
 * auth_role
 */
@ApiModel(value = "org-myproject-app-auth-pojo-AuthRole")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class AuthRoleQuery extends BaseQuery implements Serializable, MybatisExample<AuthRoleExample> {
    private static final long serialVersionUID = 1L;
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