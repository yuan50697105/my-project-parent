package org.myproject.boot.application.admin.mvc.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 角色路由表
 */
@Data
public class SysRoleRoute implements Serializable {
    private Long id;

    private Long roleId;

    private Long routeId;

    private static final long serialVersionUID = 1L;
}