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
@Table(name = "tb_sys_user")
public class TbSysUser extends TbBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "username")
    private String username;
    @Column(name = "`name`")
    private String name;
    @Column(name = "`password`")
    private String password;
}