package org.myproject.boot.application.admin.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class SysUserRole implements Serializable {
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

