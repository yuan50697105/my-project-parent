package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysRoute extends TbBaseEntity implements Serializable {
    private String name;

    private String url;

    private Long roleId;

    private static final long serialVersionUID = 1L;
}