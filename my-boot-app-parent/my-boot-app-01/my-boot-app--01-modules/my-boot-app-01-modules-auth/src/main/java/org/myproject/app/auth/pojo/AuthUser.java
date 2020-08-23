package org.myproject.app.auth.pojo;

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
public class AuthUser extends BaseEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public AuthUser withUsername(String username) {
        return this.username == username ? this : new AuthUser(username, this.password, this.name, this.enabled);
    }

    public AuthUser withPassword(String password) {
        return this.password == password ? this : new AuthUser(this.username, password, this.name, this.enabled);
    }

    public AuthUser withName(String name) {
        return this.name == name ? this : new AuthUser(this.username, this.password, name, this.enabled);
    }

    public AuthUser withEnabled(Integer enabled) {
        return this.enabled == enabled ? this : new AuthUser(this.username, this.password, this.name, enabled);
    }
}