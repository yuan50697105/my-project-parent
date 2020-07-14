package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 用户角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_user_role")
public class TbSysUserRole extends BaseEntity implements Serializable {
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "role_id")
    private Long roleId;

    private static final long serialVersionUID = 1L;
}