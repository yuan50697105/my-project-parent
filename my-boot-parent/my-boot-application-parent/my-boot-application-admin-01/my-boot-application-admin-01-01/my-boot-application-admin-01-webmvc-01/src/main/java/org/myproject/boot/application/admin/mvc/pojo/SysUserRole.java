package org.myproject.boot.application.admin.mvc.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户角色
 */
@Data
public class SysUserRole implements Serializable {
    private Long id;

    private Long userId;

    private Long roleId;

    private static final long serialVersionUID = 1L;
}