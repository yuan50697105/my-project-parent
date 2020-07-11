package org.myproject.boot.application.admin.mvc.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_role
 */
@Data
public class SysRole implements Serializable {
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

    private static final long serialVersionUID = 1L;
}