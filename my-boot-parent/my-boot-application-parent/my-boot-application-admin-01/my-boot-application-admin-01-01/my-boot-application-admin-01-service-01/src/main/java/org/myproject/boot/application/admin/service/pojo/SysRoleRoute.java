package org.myproject.boot.application.admin.service.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysRoleRoute implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private Long roleId;

    /**
     *
     */
    private Long routeId;
}

