package org.myproject.cloud.application.admin.api.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BSysUser implements Serializable {
    private static final long serialVersionUID = 1L;
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
}

