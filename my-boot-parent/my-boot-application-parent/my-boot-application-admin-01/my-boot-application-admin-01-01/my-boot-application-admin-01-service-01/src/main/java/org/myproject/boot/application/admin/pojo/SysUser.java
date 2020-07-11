package org.myproject.boot.application.admin.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class SysUser implements Serializable {
    /**
     * id
     */
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

    private static final long serialVersionUID = 1L;
}

