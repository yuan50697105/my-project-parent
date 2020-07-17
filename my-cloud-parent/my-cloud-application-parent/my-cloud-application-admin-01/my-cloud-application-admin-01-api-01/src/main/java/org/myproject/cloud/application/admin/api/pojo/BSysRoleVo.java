package org.myproject.cloud.application.admin.api.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BSysRoleVo implements Serializable {
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
    private List<String> routes;
    private Op op;

    public enum Op {
        ADD, UPDATE_INFO, UPDATE_ROUTE, UPDATE
    }

}
