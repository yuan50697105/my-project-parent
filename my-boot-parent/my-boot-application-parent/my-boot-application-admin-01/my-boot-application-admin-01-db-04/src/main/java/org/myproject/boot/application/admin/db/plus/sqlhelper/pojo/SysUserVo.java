package org.myproject.boot.application.admin.db.plus.sqlhelper.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String username;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 启用状态
     */
    private String enabled;
}