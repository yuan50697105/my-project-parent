package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysRole extends TbBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String description;
}