package org.myproject.boot.application.admin.api.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BSysRole implements Serializable {
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

    private Op op;

    public enum Op {
        ADD, UPDATE_INFO, UPDATE_ROUTE
    }
}

