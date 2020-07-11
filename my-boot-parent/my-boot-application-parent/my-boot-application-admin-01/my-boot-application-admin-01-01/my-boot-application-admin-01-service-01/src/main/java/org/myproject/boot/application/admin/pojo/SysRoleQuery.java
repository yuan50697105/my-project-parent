package org.myproject.boot.application.admin.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysRoleQuery implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色描述
     */
    private String description;
    /**
     * 启用状态
     */
    private String enabled;
}

