package org.myproject.boot.application.admin.api.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BSysRoleRoute implements Serializable {
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

