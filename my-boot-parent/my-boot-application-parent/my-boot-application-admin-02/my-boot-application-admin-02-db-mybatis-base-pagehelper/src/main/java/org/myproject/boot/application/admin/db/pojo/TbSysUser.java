package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 系统用户
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysUser extends TbBaseEntity implements Serializable {
    private String username;

    private String name;

    private static final long serialVersionUID = 1L;
    private String password;
}