package org.myproject.cloud.application.admin.api.pojo;

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

