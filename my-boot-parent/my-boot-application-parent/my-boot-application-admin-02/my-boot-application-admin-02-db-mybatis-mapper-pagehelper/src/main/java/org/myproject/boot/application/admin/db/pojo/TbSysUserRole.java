package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 系统用户
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_user_role")
public class TbSysUserRole extends TbBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "role_id")
    private Long roleId;
}