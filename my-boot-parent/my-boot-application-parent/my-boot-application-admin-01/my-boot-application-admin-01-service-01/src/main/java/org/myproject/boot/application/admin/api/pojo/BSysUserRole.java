package org.myproject.boot.application.admin.api.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BSysUserRole implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Long userId;
    /**
     *
     */
    private Long roleId;
    /**
     *
     */
    private Long id;
}

