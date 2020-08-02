package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_permission")
public class TbSysPermission extends TbBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "`name`")
    private String name;
    @Column(name = "role_id")
    private Long roleId;
}