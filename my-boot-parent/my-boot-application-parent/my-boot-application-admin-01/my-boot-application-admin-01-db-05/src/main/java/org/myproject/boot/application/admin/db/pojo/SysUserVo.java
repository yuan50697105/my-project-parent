package org.myproject.boot.application.admin.db.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * sys_user
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUserVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;
    /**
     * 姓名
     */
    @Column(name = "`name`")
    private String name;
    /**
     * 密码
     */
    @Column(name = "`password`")
    private String password;
    /**
     * 启用状态
     */
    @Column(name = "enabled")
    private String enabled;
}